package com.corejava;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients = new ArrayList<>();

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }
    public int getCookingTime() {
        return cookingTime;
    }
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    @Override
    public String toString() {
        return this.getName() + ", cooking time: " + this.cookingTime;
    }
}
