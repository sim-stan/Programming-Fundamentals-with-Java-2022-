package FUNDAMENTALS.Data_Types_and_Variables_LAB;

import java.util.Scanner;

public class Chars_to_String_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol=scanner.nextLine().charAt(0);
        char secondSymbol=scanner.nextLine().charAt(0);
        char thirdSymbol=scanner.nextLine().charAt(0);
        System.out.printf("%c%c%c",firstSymbol,secondSymbol,thirdSymbol);
    }
}
