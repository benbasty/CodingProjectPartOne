package com.corejava;

import java.util.ArrayList;
import java.util.Objects;

public class Menu {
    private ArrayList<String> meals;
    public Menu() {
        this.meals = new ArrayList<>();
    }
    public void addMeal(String meal) {
        if (this.meals.contains(meal)) {
            meals = this.meals;
        } else {
            this.meals.add(meal);
        }

    }
    public void printMeals() {
        for (String meal: meals) {
            System.out.println(meal);
        }
    }
    public void clearMenu() {
        this.meals.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;
        Menu menu = (Menu) o;
        return meals.equals(menu.meals);
    }
}
