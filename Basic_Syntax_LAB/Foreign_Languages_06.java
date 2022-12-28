package FUNDAMENTALS.Basic_Syntax_LAB;

import java.util.Scanner;

public class Foreign_Languages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            String country= scanner.nextLine();

            if (country.equals("USA") || country.equals("England"))
                System.out.printf("English");

            else if (country.equals("Spain") || country.equals("Argentina")|| country.equals("Mexico")) {
                System.out.printf("Spanish");
            }else {
                System.out.printf("unknown");
            }
    }
}
