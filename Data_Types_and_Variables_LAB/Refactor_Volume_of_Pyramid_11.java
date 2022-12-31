package FUNDAMENTALS.Data_Types_and_Variables_LAB;

import java.util.Scanner;

public class Refactor_Volume_of_Pyramid_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        height = (length * width * height) / 3;


        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");
        System.out.printf("Pyramid Volume: %.2f", height);

    }
}
