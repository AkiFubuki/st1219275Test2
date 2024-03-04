package com.example.st1219275test2;

import java.util.ArrayList;

public class Library {

    public String streetAddress;
    public ArrayList<Book> BookObjects ;

    public Library(String streetAddress, ArrayList<Book> bookObjects) {
        this.streetAddress = streetAddress;
        BookObjects = bookObjects;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {

        this.streetAddress = streetAddress;
    }

    public ArrayList<Book> getBookObjects() {
        return BookObjects;
    }

    public void setBookObjects(ArrayList<Book> bookObjects) {
        BookObjects = bookObjects;
    }
}
