package com.corejava;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared) {

        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int priceDifference = (this.pricePerSquare * this.squares) - (compared.pricePerSquare * compared.squares);
        if (priceDifference < 0) {
            return priceDifference * -1;
        }
        return priceDifference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int priceApartment = this.pricePerSquare * this.squares;
        int comparedPriceApartment = compared.pricePerSquare * compared.squares;
        if (priceApartment > comparedPriceApartment) {
            return true;
        } else {
            return false;
        }
    }
}
