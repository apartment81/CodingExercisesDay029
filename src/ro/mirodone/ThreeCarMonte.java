package ro.mirodone;

import java.util.Random;
import java.util.Scanner;

class ThreeCarMonte {

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    private int door = 1 + random.nextInt(3);

    void game() {

        System.out.println("You have to guess which of three doors has a car behind it.");
        System.out.println("If you guess right, you get the car.");
        System.out.println();
        System.out.println("Which door is it?");
        System.out.println();
        System.out.println("-------  -------  -------");
        System.out.println("|     |  |     |  |     |");
        System.out.println("|  1  |  |  2  |  |  3  |");
        System.out.println("|     |  |     |  |     |");
        System.out.println("-------  -------  -------");

        int choice = scanner.nextInt();
        System.out.println();

        if (choice == door) {
            System.out.println("We have a winner!");
        } else {
            System.out.println("Mwahaha the car is all mine! You get nothing!");
        }


        if (door == 1) {
            System.out.println("-------  -------  -------");
            System.out.println("|     |  |     |  |     |");
            System.out.println("| car |  |  2  |  |  3  |");
            System.out.println("|     |  |     |  |     |");
            System.out.println("-------  -------  -------");
        } else if (door == 2) {
            System.out.println("-------  -------  -------");
            System.out.println("|     |  |     |  |     |");
            System.out.println("|  1  |  | car |  |  3  |");
            System.out.println("|     |  |     |  |     |");
            System.out.println("-------  -------  -------");
        } else if (door == 3) {
            System.out.println("-------  -------  -------");
            System.out.println("|     |  |     |  |     |");
            System.out.println("|  1  |  |  2  |  | car |");
            System.out.println("|     |  |     |  |     |");
            System.out.println("-------  -------  -------");
        }
    }
}
