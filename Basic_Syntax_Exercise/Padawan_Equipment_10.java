package FUNDAMENTALS.Basic_Syntax_Exercise;

import java.util.Scanner;

public class Padawan_Equipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOFmoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double singleSaber = Double.parseDouble(scanner.nextLine());
        double singleRobe = Double.parseDouble(scanner.nextLine());
        double singleBelt = Double.parseDouble(scanner.nextLine());

        double price=0;


        double saber=Math.ceil(students*1.10);
        double robe=singleRobe*students;
            if (students>6) {
             int discount =students / 6;
             students=students-discount;
            }
        price=singleSaber*saber + robe + singleBelt*students;


        double diff=Math.abs(price-amountOFmoney);


        if (price<=amountOFmoney){

            System.out.printf("The money is enough - it would cost %.2flv.",price);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",diff);
        }
    }

}
