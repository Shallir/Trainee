import Elements.BaseApiMethods;
import org.testng.annotations.Test;

import static Driver.ConstantVariable.azure_shallir;
import static com.jayway.restassured.RestAssured.given;

public class Api {
    BaseApiMethods base_api_methods = new BaseApiMethods();

    @Test
    public void testOAuthWithClientCredential() {
        System.out.println(base_api_methods.сreateTask());
    }


    @Test
    public void testUserFetchesSuccess() {
        String response;
        response =  given()
                .baseUri(azure_shallir)
                .header("Authorization", "Basic MXNoYWxsaXJAZ21haWwuY29tOmdnenljYnB4cTJueXpvZmlvYXd5YXQzNXBnbmp1Y2Y1NXltNXNlY2NqNnlyd2V6YnZtaGE=")
                .param("api-version=6.0")
                .when().get()
                .then().extract()
                .response().prettyPrint()
        ;
        System.out.println(response);
    }
}
