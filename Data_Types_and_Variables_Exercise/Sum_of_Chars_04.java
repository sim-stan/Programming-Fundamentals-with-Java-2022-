package FUNDAMENTALS.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Sum_of_Chars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines=Integer.parseInt(scanner.nextLine());
            int sum=0;
        for (int i = 1; i <=lines ; i++) {
            String symbol= scanner.nextLine();
            int num=symbol.charAt(0);
            sum +=num;

        }
        System.out.printf("The sum equals: %d",sum);
    }
}
