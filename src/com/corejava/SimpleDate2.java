package com.corejava;

public class SimpleDate2 {
    private int day;
    private int month;
    private int year;

    public SimpleDate2(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate2 compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day = this.day + 1;

        if (this.day > 30) {
            this.month = this.month + 1;
            this.day = 1;
            if(this.month > 12) {
                this.year = this.year + 1;
                this.month = 1;
            }
        }
    }
    public void advance(int howManyDays) {
        for(int i = 0; i < howManyDays; i++){
            this.advance();
        }
    }

    public SimpleDate2 afterNumberOfDays(int days){
        SimpleDate2 newDate = new SimpleDate2(day,month,year);

        for(int i = 0; i < days; i++){
            newDate.advance();
        }

        return newDate;
    }
}
