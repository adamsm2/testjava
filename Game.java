package com.company;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    ArrayList<Player> players;
    int currentPlayerNumber;
    int currentRoundNumber;
    int currentThrowNumber;
    LocalDateTime startTime;
    LocalDateTime endTime;

    public Game() {
        this.players = new ArrayList<>();
    }

    public boolean play() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        int numberOfPlayers = initPlayersList();

        this.startTime = LocalDateTime.now();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < numberOfPlayers; j++) {
                System.out.println("\n\tKOLEJKA GRACZA O NAZWIE: "+players.get(j).name);
                System.out.println("LICZBA ŁĄCZNIE ZDOBYTYCH DO TEJ PORY PUNKTÓW:"+ players.get(j).sumOfPoints);
                System.out.println("RUNDA: " + (i + 1) + "  RZUT 1");
                if (players.get(j).makeAThrow(i, 0) == 0) {
                    System.out.println("\t\tSTRIKE!");
                    continue;
                }
                System.out.println("RUNDA: " + (i + 1) + "  RZUT 2");
                if (players.get(j).makeAThrow(i, 1) == 0) {
                    System.out.println("\t\tSPARE!");
                }
            }
        }
        
        this.endTime = LocalDateTime.now();

        int winner = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("\n\nLICZBA ŁĄCZNIE ZDOBYTYCH PUNKTÓW PRZEZ CAŁĄ GRĘ PRZEZ GRACZA " + players.get(i).name + ": " + players.get(i).sumOfPoints);
            if (players.get(winner).sumOfPoints < players.get(i).sumOfPoints)
                winner = i;
        }

        System.out.println("WYGRYWA: "+players.get(winner).name);
        System.out.println("\tROZPOCZĘCIE GRY: " + dtf.format(this.startTime));
        System.out.println("\tKONIEC GRY: " + dtf.format(this.endTime));

        return true;
    }

    public void goToNextMove() {
        this.currentPlayerNumber = 0;
        this.currentRoundNumber++;
        this.currentThrowNumber = 0;
    }

    private int initPlayersList() {
        Scanner in = new Scanner(System.in);
        int numberOfPlayers = 0;

        while (numberOfPlayers < 1 || numberOfPlayers > 6) {
            System.out.print("Podaj liczbę graczy z przedziału od 1 do 6: ");
            if (in.hasNextInt()) {
                numberOfPlayers = in.nextInt();
            } else {
                in.next();
            }
        }

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Podaj nazwę gracza " + (i+1) + ":");
            String playerName = in.next();
            players.add(new Player(playerName));
        }

        return numberOfPlayers;
    }
}
