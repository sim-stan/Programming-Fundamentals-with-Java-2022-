package FUNDAMENTALS.Basic_Syntax_LAB;

import java.util.Scanner;

public class Multiplication_Table_2_0_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int result=0;

        for (int i = num2; i <=10 ; i++) {
                result=num1*i;
                System.out.printf("%d X %d = %d%n",num1,i,result);
        }if (num2>10) {
            result = num1 * num2;
            System.out.printf("%d X %d = %d", num1, num2, result);
        }
    }
}

