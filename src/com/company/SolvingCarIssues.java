package com.company;
import java.util.Scanner;

public class SolvingCarIssues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.print("Does the car not turn on when key is turned while in the ignition? ");
        choice = sc.next().charAt(0);

        if (choice == 'Y') {
            System.out.print("Are the Battery terminals corroded? ");
            choice = sc.next().charAt(0);
            if (choice == 'Y')
                System.out.println("Clean the terminals and try starting again.");

            else
                System.out.println("Replace cables and try again.");
        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            choice = sc.next().charAt(0);
            if (choice == 'Y')
                System.out.println("Replace the Battery.");
            else {
                System.out.print("Does the car crank up but fail to start?");
                choice = sc.next().charAt(0);
                if (choice == 'Y')
                    System.out.println("Check spark plug connection.");
                else {
                    System.out.print("Does the engine start and then die? ");
                    choice = sc.next().charAt(0);
                    if (choice == 'Y') {
                        System.out.println("Does your car have fuel injection? ");
                        choice = sc.next().charAt(0);
                        if (choice == 'Y')
                            System.out.println("Take it to a mechanic to get serviced.");
                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }
                    else {
                        System.out.println("This should not be possible.");
                    }

                }

            }

        }

        sc.close();

    }
}
