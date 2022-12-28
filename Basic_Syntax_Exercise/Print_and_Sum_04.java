package FUNDAMENTALS.Basic_Syntax_Exercise;

import java.util.Scanner;

public class Print_and_Sum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = num1; i <=num2 ; i++) {

            sum +=i;
            System.out.printf("%d ",i);

        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
