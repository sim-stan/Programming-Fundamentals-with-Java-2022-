package FUNDAMENTALS.Basic_Syntax_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pplCount = Integer.parseInt(scanner.nextLine());
        String type= scanner.nextLine();
        String day= scanner.nextLine();
        double price=0.0;

        switch (day){

            case "Friday":

                if (type.equals("Students")){
                    if (pplCount>=30){
                        price=(pplCount*8.45)*0.85;
                    }else {
                        price=(pplCount*8.45);
                    }

                } else if (type.equals("Business")) {
                    if (pplCount>=100){
                        price=(pplCount-10)*10.90;

                    }else {
                        price=pplCount*10.90;
                    }

                } else if (type.equals("Regular")) {
                    if (pplCount>=10 && pplCount<=20){
                        price=(pplCount*15) * 0.95;

                    }else {
                        price=pplCount*15;
                    }
                }

                break;

            case "Saturday":
                if (type.equals("Students")){
                    if (pplCount>=30){
                        price=(pplCount*9.80)*0.85;
                    }else {
                        price=(pplCount*9.80);
                    }

                } else if (type.equals("Business")) {
                    if (pplCount>=100){
                        price=(pplCount-10)*15.60;

                    }else {
                        price=pplCount*15.60;
                    }

                } else if (type.equals("Regular")) {
                    if (pplCount>=10 && pplCount<=20){
                        price=(pplCount*20) * 0.95;

                    }else {
                        price=pplCount*20;
                    }
                }
                break;

            case "Sunday":
                if (type.equals("Students")){
                    if (pplCount>=30){
                        price=(pplCount*10.46)*0.85;
                    }else {
                        price=(pplCount*10.46);
                    }

                } else if (type.equals("Business")) {
                    if (pplCount>=100){
                        price=(pplCount-10)*16;

                    }else {
                        price=pplCount*16;
                    }

                } else if (type.equals("Regular")) {
                    if (pplCount>=10 && pplCount<=20){
                        price=(pplCount*22.50) * 0.95;

                    }else {
                        price=pplCount*22.50;
                    }
                }

                break;
        }
        System.out.printf("Total price: %.2f",price);

    }
}
