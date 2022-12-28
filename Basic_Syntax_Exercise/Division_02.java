package FUNDAMENTALS.Basic_Syntax_Exercise;

import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int div=2;

        if (num%10==0){
            div=10;
            System.out.printf("The number is divisible by %d",div);

        } else if (num%7==0) {
            div=7;
            System.out.printf("The number is divisible by %d",div);

        } else if (num%6==0) {
            div=6;
            System.out.printf("The number is divisible by %d",div);

        }else if (num%3==0) {
            div = 3;
            System.out.printf("The number is divisible by %d",div);

        }else if (num%2==0) {
            div = 2;
            System.out.printf("The number is divisible by %d",div);

        }else {
            System.out.print("Not divisible");
        }
    }
}
