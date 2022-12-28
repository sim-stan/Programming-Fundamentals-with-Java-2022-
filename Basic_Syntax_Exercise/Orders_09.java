package FUNDAMENTALS.Basic_Syntax_Exercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double total=0.0;

        for (int i = 1; i <=n ; i++) {

            double pricePerCapsuls = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());

            double price= (days * capsules) * pricePerCapsuls;

            total=total+price;
            System.out.printf("The price for the coffee is: $%.2f%n",price);
        }
        System.out.printf("Total: $%.2f",total);
    }
}
