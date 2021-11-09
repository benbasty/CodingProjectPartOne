package com.corejava;

public class Book3 {
    private String name;
    private int publicationYear;

    public Book3(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals (Object compared) {
        if (this == compared) {
            return true;
        }
        if (! (compared instanceof Book3)) {
            return false;
        }
        Book3 comparedBook = (Book3) compared;
        if (this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear) {
            return true;
        }
        return false;
    }
}
