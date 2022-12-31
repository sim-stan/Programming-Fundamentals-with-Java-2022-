package FUNDAMENTALS.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Print_Part_Of_ASCII_Table_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum=Integer.parseInt(scanner.nextLine());
        int lastNum=Integer.parseInt(scanner.nextLine());


        for (int i = firstNum; i <=lastNum; i++) {

            char symbol =(char)(i);
            System.out.printf("%s ",symbol);
        }

    }
}
