package com.example.st1219275test2;

import java.util.ArrayList;

public class Library {

    public String streetAddress;
    public ArrayList<Book> BookObjects ;

    public Library(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        if (streetAddress.length()>=10)
            this.streetAddress = streetAddress;
        else
            throw new IllegalArgumentException("the street address has to be 10 characters or more");

    }
    public void addBook(String Book){
    Book+=BookObjects;

    }
    public void inventoryValue(double price){
    double sum=0;
    sum=sum+price;
    }
    public void getCategories(){

    }
    public void getBooksInCategory(String categories){

    }
}
