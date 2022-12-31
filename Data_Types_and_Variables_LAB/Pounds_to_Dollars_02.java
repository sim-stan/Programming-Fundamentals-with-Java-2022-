package FUNDAMENTALS.Data_Types_and_Variables_LAB;

import java.util.Scanner;

public class Pounds_to_Dollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds=Double.parseDouble(scanner.nextLine());;

        double dollars=pounds*1.36;
        System.out.printf("%.3f",dollars);

    }
}
