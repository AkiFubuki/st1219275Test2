package com.example.st1219275test2;

public class Book {
    public String title;
    public String author;
    public String ISBN;
    public String category;
    public double price;

    public Book(String title, String author, String ISBN, String category, String price){
        setTitle(title);
        setAuthor(author);
        setISBN(ISBN);
        setCategory(category);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.length()>4) {
            this.title = title;
        }
        else
            throw new IllegalArgumentException("Name must be at least 4 characters long");
        if (title.contains(" ")){
            title.replace(" ","");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.length()>2) {
            this.author = author;
        }
        else
            throw new IllegalArgumentException("Name must be at least 4 characters long");
        if (author.contains(" ")){
            author.replace(" ","");
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
