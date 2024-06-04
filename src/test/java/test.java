import groovy.lang.DelegatesTo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.form;

public class test {

    @Test
    public void RestTest(){
        baseURI="https://api.coindesk.com/v1/bpi/currentprice.json";
        Response response =RestAssured.given()
                .when()
                .get(baseURI);
        if ( response.getStatusCode()==200){
            System.out.println("status code" +response.getStatusCode());
        }
    }
@Test
    public  void restTest(){
       baseURI="https://api.coindesk.com/v1/bpi/currentprice.json";
       Response response = RestAssured.given()
               .when()
               .get(baseURI);
       if (response.getStatusCode()==200){
           System.out.println("status code"+response.getStatusCode());
       }
}

//   public static void main(String[] args) {
//      baseURI= "https://api.coindesk.com/v1/bpi/currentprice.json";
//      Response response = RestAssured.given()
//       .when()
//               .get(baseURI);
//
//      if (response.getStatusCode()==200){
//          System.out.println("status code"  +response.getStatusCode());
//      }
//  }
 public static void main(String[] args) {
      baseURI= "https://api.coindesk.com/v1/bpi/currentprice.json";
      Response response = RestAssured.given()
              .when()
              .get(baseURI);
      if(response.getStatusCode()==200){
          System.out.println("status code" +    response.getStatusCode());
      }
  }

  @Test
    public void Testu() {
      baseURI = "https://api.coindesk.com/v1/bpi/currentprice.json";
      Response response = RestAssured.given()
              .when()

              .get(baseURI);
  if(response.getStatusCode()==200){
      System.out.println("status code "+ response.getStatusCode());
  }
    }}

