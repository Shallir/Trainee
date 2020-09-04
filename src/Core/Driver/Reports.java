package Driver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Reports {
    public static ExtentTest test = null;
    public static ExtentReports report = null;
    //mvn allure:serve

    private static ExtentReports starter(){
        report = new ExtentReports("D:\\Project\\TraineeFramework\\ExtentReports\\ExtentReportResults.html", true);
        return report;
    }

    public static synchronized ExtentReports start_report()
    {
        if(report == null)
        {
            starter();
        }
        return report;
    }

    public static void start_test (String name){
        test = report.startTest(name);
    }

    public static void end_test(String name){
        report.endTest(test);
    }

    public static void end_report()
    {
        end_test("test");
        report.flush();
    }
}
