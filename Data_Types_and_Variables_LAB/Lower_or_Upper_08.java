package FUNDAMENTALS.Data_Types_and_Variables_LAB;

import java.util.Scanner;

public class Lower_or_Upper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol=scanner.nextLine().charAt(0);

        if (Character.isUpperCase(symbol)){

            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }

    }
}
