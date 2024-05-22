import com.google.common.graph.EndpointPair;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;

import org.junit.Assert;
import io.restassured.path.json.JsonPath;

public class RestAPIInspired {

    @Test
    public void jsonIterateArr() {
        RestAssured.baseURI = "https://reqres.in";
        Response response = RestAssured.given()
                .when()

                .get("/api/users/2");

        if (response.getStatusCode() == 200) {
            System.out.println("status code:" + response.getStatusCode());
            String firstName = response.jsonPath().getString("data.first_name");
            System.out.println("First Name:" + firstName);
            String url = response.jsonPath().getString("url");
            System.out.println(RestAssured.baseURI + ("/api/users/2"));

        } else {
            System.out.println("Failed to get data:" + response.getStatusCode());
        }


    }
}
	
	
	
	
	


