package FUNDAMENTALS.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Sum_Digits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num=Integer.parseInt(scanner.nextLine());

        int sum=0;

        while ( num>0){
        sum= sum + (num%10);
        num=num/10;

        }
        System.out.printf("%d",sum);
    }

}
