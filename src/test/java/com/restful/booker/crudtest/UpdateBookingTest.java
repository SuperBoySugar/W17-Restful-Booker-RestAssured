package com.restful.booker.crudtest;

import com.restful.booker.model.BookingPojo;
import com.restful.booker.testbase.BaseTest;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class UpdateBookingTest extends BaseTest {
    @Test
    public void updateBooking() {

        HashMap<Object, Object> bookingdates = new HashMap<>();
        bookingdates.put("checkin", "2023-11-05");
        bookingdates.put("checkout", "2023-11-15");

        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstName("roi");
        bookingPojo.setLastName("Wong");
        bookingPojo.setTotalPrice(145);
        bookingPojo.setDepositPaid(false);
        bookingPojo.setBookingDates(bookingdates);
        bookingPojo.setAdditionNeeds("Breakfast");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Cookie",  "toke: c4230010028bee2")
                .pathParam("id", 1007)
                .body(bookingPojo)
                .when()
                .put("/booking/{id}");
        response.then().statusCode(200);
        response.then().time(lessThan(3000L));
        response.prettyPrint();
    }

}
