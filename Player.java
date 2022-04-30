package com.company;

import java.util.Scanner;

public class Player implements Comparable<Player> {
    String name;
    int sumOfPoints;
    int [] pointsArray;

    public Player (String name) {
        this.name = name;
        this.pointsArray = new int[20];
    }

    public int getSumOfPoints() {
        return sumOfPoints;
    }

    @Override
    public int compareTo(Player p) {
        return p.getSumOfPoints() - this.sumOfPoints;
    }

    public int makeAThrow (int numberOfRound, int numberOfThrow) {
        int currentThrow = 2*numberOfRound + numberOfThrow;
        int previousThrow = 2*numberOfRound;
        int maxPinsToKnocked = 10;

        if (numberOfThrow != 2)
            maxPinsToKnocked -= this.pointsArray[previousThrow];

        int numberOfKnockedPins = getNumberOfKnockedPins(maxPinsToKnocked);

        this.pointsArray[currentThrow] = numberOfKnockedPins;
        this.sumOfPoints += numberOfKnockedPins;


        return (numberOfKnockedPins - maxPinsToKnocked);
    }

    private int getNumberOfKnockedPins(int max) {
        Scanner in = new Scanner(System.in);
        int knockedPins = -1;
        while (knockedPins < 0 || knockedPins > max){
            System.out.print("Podaj liczbę zbitych kręgli z przedziału od 0 do " + max + ": ");
            if (in.hasNextInt()) {
                knockedPins = in.nextInt();
            } else {
                in.next();
            }
        }
        return knockedPins;
    }
}

