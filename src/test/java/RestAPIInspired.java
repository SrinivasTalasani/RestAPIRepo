
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class RestAPIInspired {

    @Test
    public void jsonIterateArr() {
        RestAssured.baseURI = "https://api.coindesk.com/v1/bpi/currentprice.json";
        Response response = RestAssured.given()
                .when()

                .get(baseURI);

        if (response.getStatusCode() == 200) {
            System.out.println("status code: " + response.getStatusCode());
            String rate = response.jsonPath().getString("bpi.USD.rate");
            System.out.println("USD.RATE: " + rate);
            String description = response.jsonPath().getString("bpi.USD.description");
            System.out.println("USD.DESCRIPTION: " + description);
            System.out.println("URL: " + RestAssured.baseURI);

        } else {
            System.out.println("Failed to get data:" + response.getStatusCode());
        }
    }
}
	
	
	
	
	


