package Elements;

import com.jayway.restassured.path.json.JsonPath;

import static Driver.ConstantVariable.azure_shallir;
import static com.jayway.restassured.RestAssured.given;

public class BaseApiMethods {

    public int сreateTask() {
        String response = null;
        JsonPath jsonPath = new JsonPath(response);
        int user_id = jsonPath.getInt("id");

        response = given()
                .baseUri(azure_shallir)
                .header("Authorization", "Basic MXNoYWxsaXJAZ21haWwuY29tOmdnenljYnB4cTJueXpvZmlvYXd5YXQzNXBnbmp1Y2Y1NXltNXNlY2NqNnlyd2V6YnZtaGE=")
                .param("api-version=6.0")
                .when().get()
                .then().extract()
                .response().prettyPrint();
        System.out.println(response);
        System.out.println(user_id);
        return user_id;
    }

}
