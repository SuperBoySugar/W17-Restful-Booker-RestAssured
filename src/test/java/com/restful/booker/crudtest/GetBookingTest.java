package com.restful.booker.crudtest;

import com.restful.booker.model.BookingPojo;
import com.restful.booker.testbase.BaseTest;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetBookingTest extends BaseTest {

    @Test
    public void getAllBookings() {
        BookingPojo bookingPojo = new BookingPojo();
        // bookingPojo.setUsername("admin");
        //  bookingPojo.setPassword("password123");

        Response response = given()
                .body(bookingPojo)
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getBooking() {

        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setUsername("admin");
        bookingPojo.setPassword("password123");

        Response response = given()
                .pathParam("id",1007)
                .body(bookingPojo)
                .when()
                .get("/booking"+"/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }



}
