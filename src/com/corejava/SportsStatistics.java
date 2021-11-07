package com.corejava;

import java.nio.file.Paths;
import java.util.Scanner;

public class SportsStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File: ");
        String file = scanner.nextLine();
        System.out.print("Team: ");
        String team = scanner.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(file))) {
            int count = 0;
            int wins = 0;
            int losses = 0;
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                if (line.contains(team)) {
                    count++;
                }
                if (team.equals(homeTeam) && homeTeamPoints > visitingTeamPoints){
                    wins++;
                }
                if (team.equals(homeTeam) && homeTeamPoints < visitingTeamPoints) {
                    losses++;
                }
                if (team.equals(visitingTeam) && homeTeamPoints > visitingTeamPoints) {
                    losses++;
                }
                if (team.equals(visitingTeam) && homeTeamPoints < visitingTeamPoints) {
                    wins++;
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
