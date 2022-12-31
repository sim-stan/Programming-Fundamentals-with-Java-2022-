package FUNDAMENTALS.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Integer_Operations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());
        int num4=Integer.parseInt(scanner.nextLine());

        int result=((num1+num2)/num3)*num4;
        System.out.printf("%d",result);
    }
}
