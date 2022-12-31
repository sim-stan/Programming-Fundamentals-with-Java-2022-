package FUNDAMENTALS.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Water_Overflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int capacity=255;
        int currentLitters=0;

        for (int i = 1; i <=n ; i++) {
            int litters=Integer.parseInt(scanner.nextLine());

            currentLitters +=litters;


            if (currentLitters>capacity) {
                currentLitters-=litters;
                System.out.printf("Insufficient capacity!%n");
            }


        }

        System.out.printf("%d",currentLitters);
    }
}
