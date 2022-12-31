package FUNDAMENTALS.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Beer_Kegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines=Integer.parseInt(scanner.nextLine());
        String biggest="";
        double biggestKeg=0.0;


        for (int i = 1; i <=lines ; i++) {

            String name= scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());

            double currentKeg=3.14 * radius*radius * height;


            if (currentKeg>biggestKeg){
                biggestKeg=currentKeg;
                biggest=name;
            }


        }
        System.out.printf("%s",biggest);
    }
}
