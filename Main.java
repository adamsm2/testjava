package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.play();
/*
        game.startTime = LocalDateTime.now();

        Player [] players = new Player[2];

        //players[0] = new Player(20);
        //players[1] = new Player(20);
        //players[0].name = "Wiesiu";
        //players[1].name = "Kox";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("\n\tKOLEJKA GRACZA O NAZWIE: "+players[j].name);
                System.out.println("LICZBA ŁĄCZNIE ZDOBYTYCH DO TEJ PORY PUNKTÓW:"+ players[j].sumOfPoints);
                System.out.println("RUNDA: " + (i + 1) + "  RZUT 1");
                if (players[j].makeAThrow(i, 0) == 0) {
                    System.out.println("\t\tSTRIKE!");
                    continue;
                }
                System.out.println("RUNDA: " + (i + 1) + "  RZUT 2");
                if (players[j].makeAThrow(i, 1) == 0) {
                    System.out.println("\t\tSPARE!");
                }
            }


        }
        game.endTime = LocalDateTime.now();
        System.out.println("\n\nLICZBA ŁĄCZNIE ZDOBYTYCH PUNKTÓW PRZEZ CAŁĄ GRĘ PRZEZ GRACZA "+players[0].name+": " + players[0].sumOfPoints);
        System.out.println("LICZBA ŁĄCZNIE ZDOBYTYCH PUNKTÓW PRZEZ CAŁĄ GRĘ PRZEZ GRACZA "+players[1].name+": " + players[1].sumOfPoints);
        int winner = 0;
        for (int i = 1; i < 2; i++) {
            if (players[winner].sumOfPoints < players[i].sumOfPoints)
                winner = i;
        }
        System.out.println("WYGRYWA: "+players[winner].name);
        System.out.println("\tROZPOCZĘCIE GRY: " + dtf.format(game.startTime));
        System.out.println("\tKONIEC GRY: " + dtf.format(game.endTime));
*/
    }


}
