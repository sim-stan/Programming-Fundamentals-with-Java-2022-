package FUNDAMENTALS.Basic_Syntax_LAB;

import java.util.Scanner;

public class Even_Number_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        while(number%2!=0) {
            System.out.printf("Please write an even number.%n");
            number=Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d",Math.abs(number));
    }
}
