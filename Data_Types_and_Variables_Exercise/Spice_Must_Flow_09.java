package FUNDAMENTALS.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Spice_Must_Flow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int yield=Integer.parseInt(scanner.nextLine());
        int consumeSpices=0;
        int days=0;
        while (yield>=100) {
            days++;
            consumeSpices += yield-26;
            yield -=10;
        }
        consumeSpices-=26;
        System.out.printf("%d%n",days);
        System.out.printf("%d",consumeSpices);
    }
}
