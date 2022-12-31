package FUNDAMENTALS.DataTypes_and_Variables_More_Exercise;

import java.util.Scanner;

public class Balanced_Brackets_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLines = Integer.parseInt(scanner.nextLine());
        int openingBracketsCount = 0;
        int closingBracketsCount = 0;
        boolean isBalanced = true;

        for (int i = 1; i <= inputLines; i++) {

            String input = scanner.nextLine();

            if (input.equals("(")) {
                openingBracketsCount++;
                if (openingBracketsCount - closingBracketsCount >= 2) {
                    isBalanced = false;
                    break;
                }
            } else if (input.equals(")")) {
                closingBracketsCount++;

                if (closingBracketsCount > openingBracketsCount) {
                    isBalanced = false;
                    break;
                }
            }

        }
        if (openingBracketsCount != closingBracketsCount) {
            isBalanced = false;
        }

        if (!isBalanced) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }

    }
}
