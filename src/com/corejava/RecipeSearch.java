package com.corejava;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipes = readRecipesFromFile(file);
        System.out.println("Commands");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                System.out.println("Recipes");
                for (Recipe recipe: recipes) {
                    System.out.println(recipe.toString());
                }
                System.out.println("");
            }
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedWord = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.getName().contains(searchedWord)) {
                        System.out.println(recipe.toString());
                    }
                }
            }
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time:");
                int maxCookingTime = scanner.nextInt();
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.getCookingTime() <= maxCookingTime) {
                        System.out.println(recipe.toString());
                    }
                }
            }
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe.toString());
                    }
                }

            }
        }

    }

    public static ArrayList<Recipe> readRecipesFromFile(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> recipeParts = new ArrayList<>();
        String recipeName;
        int recipeTime;
        try(Scanner filereader = new Scanner(Paths.get(file))) {
            while (filereader.hasNextLine()) {
                String line = filereader.nextLine();
                if (!line.isEmpty()) {
                    recipeParts.add(line);
                } else {
                    recipeName = recipeParts.get(0);
                    recipeTime = Integer.parseInt(recipeParts.get(1));
                    recipeParts.remove(0);
                    recipeParts.remove(0);
                    recipes.add(new Recipe(recipeName, recipeTime, recipeParts));
                    recipeParts.clear();
                }

            }
            if (!recipeParts.isEmpty()) {
                recipeName = recipeParts.get(0);
                recipeTime = Integer.parseInt(recipeParts.get(1));
                recipeParts.remove(0);
                recipeParts.remove(0);
                recipes.add(new Recipe(recipeName, recipeTime, recipeParts));
                recipeParts.clear();
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }

}
