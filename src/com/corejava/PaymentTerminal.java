package com.corejava;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }
    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 2.5) {
            this.money += 2.5;
            this.affordableMeals++;
            return payment - 2.5;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 4.3) {
            this.money += 4.3;
            this.heartyMeals++;
            return payment - 4.3;
        }
        return payment;
    }

    public boolean eatAffordably(CardPayment card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= 2.5) {
            this.affordableMeals++;
        }
        return card.takeMoney(2.5);
    }

    public boolean eatHeartily(CardPayment card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned

        if (card.balance() >= 4.3) {
            this.heartyMeals++;
        }
        return card.takeMoney(4.3);
    }

    public void addMoneyToCard(CardPayment card, double sum) {
        // ...
        card.addMoney(sum);
        this.money = this.money + sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

}
