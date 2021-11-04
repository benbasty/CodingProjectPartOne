package com.corejava;

public class Book {
    private String title;
    private String pages;
    private String yearPublication;

    public Book(String title, String pages, String yearPublication) {
        this.title = title;
        this.pages = pages;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public String  getPages() {
        return this.pages;
    }

    public String getYearPublication() {
        return this.yearPublication;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.yearPublication;
    }
}
