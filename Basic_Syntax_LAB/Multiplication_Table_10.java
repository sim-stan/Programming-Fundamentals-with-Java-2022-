package FUNDAMENTALS.Basic_Syntax_LAB;

import java.util.Scanner;

public class Multiplication_Table_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());
        int result=0;
        for (int i = 1; i <=10 ; i++) {
            result=num*i;
            System.out.printf("%d X %d = %d%n",num,i,result);
        }
    }
}
