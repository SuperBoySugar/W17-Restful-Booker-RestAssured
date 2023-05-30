package com.restful.booker.testsuite;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.BeforeClass;

import java.util.List;

import static io.restassured.RestAssured.given;

public class BookingAssertionTest {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RestAssured.basePath = "/auth";
        response = given()
                .when()
                .get("")
                .then().statusCode(200);
    }

   // Creates a new auth token to use for access to the PUT and DELETE /booking
   public void test001(){
       response = given()
               .when()
               .post("auth")
               .then().statusCode(200);
       List<Integer> total = response.extract().path("id");
       Assert.assertEquals(total.size(), 25);
   }
    }
