package Driver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {

    private static ExtentTest test;
    private static ExtentReports report;
    //mvn allure:serve

    private static void starter(){
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReports/ExtentReportResults.html");
            spark.config().setTheme(Theme.DARK);
            spark.config().setDocumentTitle("page title");
            spark.config().setEncoding("utf-8");
            spark.config().setProtocol(Protocol.HTTPS);
            spark.config().setReportName("build name");
            spark.config().setTheme(Theme.DARK);
            spark.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");
        report = new ExtentReports();
        report.attachReporter(spark);

    }

    public static ExtentReports start_report()
    {
        if(report == null)
        {
            starter();
        }
        return report;
    }

    public static ExtentTest start_test()
    {
        if(test == null)
        {
            report.createTest("Session start");
        }
        return test;
    }

    public static void end_test(){
        if(test != null) {
            report.removeTest(test);
        }
    }

    public static void end_report()
    {
        report.flush();
    }
}
