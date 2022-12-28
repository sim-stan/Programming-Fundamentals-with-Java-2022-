package FUNDAMENTALS.Basic_Syntax_More_Exercise;

import java.util.Scanner;

public class Gaming_Store_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        String command= scanner.nextLine();

        double spent=0.0;
        double price=0.0;

        while (!command.equals("Game Time")){

            if (command.equals("OutFall 4")){
                price=39.99;
                if (budget>=price) {
                    spent = spent + price;
                    budget = budget - price;
                    System.out.printf("Bought %s%n",command);
                } else if (budget==0) {
                    System.out.println("Out of money!");
                    break;

                }else {
                    System.out.println("Too Expensive");
                }


            } else if (command.equals("CS: OG")) {
                price=15.99;
                if (budget>=price) {
                    spent = spent + price;
                    budget = budget - price;
                    System.out.printf("Bought %s%n",command);
                } else if (budget==0) {
                    System.out.println("Out of money!");
                    break;

                }else {
                    System.out.println("Too Expensive");
                }

            } else if (command.equals("Zplinter Zell")) {
                price=19.99;
                if (budget>=price) {
                    spent = spent + price;
                    budget = budget - price;
                    System.out.printf("Bought %s%n",command);
                } else if (budget==0) {
                    System.out.println("Out of money!");
                    break;

                }else {
                    System.out.println("Too Expensive");
                }

            }else if (command.equals("Honored 2")) {
                price=59.99;
                if (budget>=price) {
                    spent = spent + price;
                    budget = budget - price;
                    System.out.printf("Bought %s%n",command);
                } else if (budget==0) {
                    System.out.println("Out of money!");
                    break;

                }else {
                    System.out.println("Too Expensive");
                }

            }else if (command.equals("RoverWatch")) {
                price=29.99;
                if (budget>=price) {
                    spent = spent + price;
                    budget = budget - price;
                    System.out.printf("Bought %s%n",command);
                } else if (budget==0) {
                    System.out.println("Out of money!");
                    break;

                }else {
                    System.out.println("Too Expensive");
                }

            }else if (command.equals("RoverWatch Origins Edition")) {
                price=39.99;
                if (budget>=price) {
                    spent = spent + price;
                    budget = budget - price;
                    System.out.printf("Bought %s%n",command);
                } else if (budget==0) {
                    System.out.println("Out of money!");
                    break;

                }else {
                    System.out.println("Too Expensive");
                }

            }else {
                System.out.println("Not Found");
            }
            if (budget==0){
                System.out.println("Out of money!");
                break;
            }

            command= scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spent,budget);

    }
}
