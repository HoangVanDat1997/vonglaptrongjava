package com.codegym.minitest2;

public class FictionBook extends Book {
    public String category; // Thể loại
    public String nameBook;
    public FictionBook(int bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
