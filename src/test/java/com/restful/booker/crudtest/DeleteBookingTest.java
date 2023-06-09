package com.restful.booker.crudtest;

import com.restful.booker.testbase.BaseTest;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class DeleteBookingTest extends BaseTest {
    @Test
    public void deleteBookingById() {

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token: 053719487e6e814")
                .pathParam("id", 883)
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(201);
        response.then().time(lessThan(3000L));
        response.prettyPrint();
    }
}
