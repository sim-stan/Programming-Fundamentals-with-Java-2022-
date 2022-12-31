package FUNDAMENTALS.Data_Types_and_Variables_LAB;

import java.util.Scanner;

public class Convert_Meters_to_Kilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meter=Integer.parseInt(scanner.nextLine());

        double kilometer=1.0* meter/1000;

        System.out.printf("%.2f",kilometer);
    }
}
