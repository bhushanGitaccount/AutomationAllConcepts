package RestAssuredConcepts;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class SimpleAPIcall {
    public static void main(String [] args)
    {
        /*
        * given - where we are preparing the request that may contain  parameters/Setting Headers/Setting Auth etc
        * When -Perform request (GET/POST/PATCH/PUT)
	      Then -Response (Response Header/Response Body)
	      *
	      *  Example -  https://reqres.in/api/users?page=2
        * */

       ValidatableResponse responsedata= (ValidatableResponse) RestAssured
                .given()
                .queryParam("page",2)
                .when()
                .get("https://reqres.in/api/users")

                .then()
               .statusCode(200);
        System.out.println(responsedata);

        System.out.println("Successfully called API");
//----------------------Object type representation --------------------
        RequestSpecification requestspec = RestAssured.given();
        Response response =requestspec.get("https://reqres.in/api/users?page=2");
        response.prettyPrint();
        ValidatableResponse validatableres = response.then();
        validatableres.statusCode(200);

    }
}
