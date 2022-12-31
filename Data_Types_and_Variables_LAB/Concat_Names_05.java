package FUNDAMENTALS.Data_Types_and_Variables_LAB;

import java.util.Scanner;

public class Concat_Names_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName= scanner.nextLine();
        String secondName= scanner.nextLine();
        String delimiter= scanner.nextLine();

        System.out.printf("%s%s%s",firstName,delimiter,secondName);

    }
}
