package FUNDAMENTALS.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPpl=Integer.parseInt(scanner.nextLine());
        int capacity=Integer.parseInt(scanner.nextLine());


        int loads=(int) Math.ceil((double)numOfPpl/capacity);


        System.out.printf("%d",loads);

    }
}
