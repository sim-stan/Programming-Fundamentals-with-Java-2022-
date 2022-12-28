package FUNDAMENTALS.Basic_Syntax_LAB;

import java.util.Scanner;

public class Back_In_30_Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());


        int hoursTomin=hours*60;

        int totalmin=hoursTomin+mins+30;

        hours = totalmin/60;
        mins=totalmin%60;

        if (hours>23) {
            hours = 0;
            System.out.printf("%d:%d",hours,mins);

        }else if (mins<10){
            System.out.printf("%d:0%d",hours,mins);
        }else {
            System.out.printf("%d:%d",hours,mins);
        }

    }
}
