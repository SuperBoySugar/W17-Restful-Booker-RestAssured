package com.restful.booker.crudtest;

import com.restful.booker.model.BookingPojo;
import com.restful.booker.testbase.BaseTest;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class CreateBookingTest extends BaseTest {

    @Test
    public void createNewBooking() {



        HashMap<Object, Object> bookingdates = new HashMap<>();
        bookingdates.put("checkin", "2023-11-05");
        bookingdates.put("checkout", "2023-11-15");

        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstName("John");
        bookingPojo.setLastName("Walker");
        bookingPojo.setTotalPrice(222);
        bookingPojo.setDepositPaid(true);
        bookingPojo.setBookingDates(bookingdates);
        bookingPojo.setAdditionNeeds("Brunch");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization","Barer 2d471ea93b4e52c80b57e1e8227dea702bb54173c4c781467e9f2b6f9f369a36")
                .body(bookingPojo)
                .when()
                .post("/booking");
        response.then().statusCode(200);
        response.then().time(lessThan(3000L));
        response.prettyPrint();
    }

}
