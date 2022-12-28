package FUNDAMENTALS.Basic_Syntax_Exercise;

import java.util.Scanner;

public class Vending_Machine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        String command = scanner.nextLine();

        while(!command.equals("Start")){
                double coins = Double.parseDouble(command);
                if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0) {
                    sum = sum + coins;

                } else {
                    System.out.printf("Cannot accept %.2f%n", coins);
                }
                command= scanner.nextLine();

            }
        while (!command.equals("End")) {
            String product=command;
            if (command.equals("Nuts")) {
                if (sum < 2.0) {
                    System.out.println("Sorry, not enough money");

                } else {
                    sum = sum - 2.00;
                    System.out.println("Purchased "+ product);
                }

            } else if (command.equals("Water")) {
                if (sum < 0.7) {
                    System.out.println("Sorry, not enough money");

                } else {
                    sum = sum - 0.7;
                    System.out.println("Purchased "+ product);
                }

            } else if (command.equals("Crisps")) {
                if (sum < 1.5) {
                    System.out.println("Sorry, not enough money");

                } else {
                    sum = sum - 1.5;
                    System.out.println("Purchased "+ product);
                }
            } else if (command.equals("Soda")) {
                if (sum < 0.8) {
                    System.out.println("Sorry, not enough money");

                } else {
                    sum = sum - 0.8;
                    System.out.println("Purchased "+ product);
                }
            } else if (command.equals("Coke")) {
                if (sum < 1.0) {
                    System.out.println("Sorry, not enough money");

                } else {
                    sum = sum - 1.0;
                    System.out.println("Purchased " + product);
                }
            }

            command = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}

