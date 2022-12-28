package FUNDAMENTALS.Basic_Syntax_LAB;

import java.util.Scanner;

public class Passed_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());


        if (grade>=3) {
            System.out.printf("Passed!");
        }else {
            System.out.printf("Failed!");
        }
    }
}
