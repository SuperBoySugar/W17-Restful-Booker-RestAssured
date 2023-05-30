package com.restful.booker.model;

import java.util.HashMap;

public class BookingPojo {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int totalPrice;
    private Boolean depositPaid;
    private HashMap<Object,Object> bookingDates;
    private String checkIn;
    private String checkOut;
    private String additionNeeds;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;

    }

    public Boolean getDepositPaid() {
        return depositPaid;

    }
    public void setDepositPaid(Boolean depositPaid) {
        this.depositPaid = depositPaid;

    }

    public HashMap<Object, Object> getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(HashMap<Object, Object> bookingDates) {
        this.bookingDates = bookingDates;
    }
    public String getCheckIn(){
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
    public String getCheckOut(){
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
    public String getAdditionNeeds(){
        return additionNeeds;
    }
    public void setAdditionNeeds(String additionNeeds){
        this.additionNeeds = additionNeeds;
    }


}

//"firstname" : "Jim",
//        "lastname" : "Brown",
//        "totalprice" : 111,
//        "depositpaid" : true,
//        "bookingdates" : {
//        "checkin" : "2018-01-01",
//        "checkout" : "2019-01-01"
//        },
//        "additionalneeds"