package FUNDAMENTALS.Data_Types_and_Variables_Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSnowballs=Integer.parseInt(scanner.nextLine());

        long highValue= 0;
        int snowballSnow1=0;
        int snowballTime1=0;
        int snowballQuality1=0;


        for (int i = 1; i <=totalSnowballs ; i++) {

            int snowballSnow=Integer.parseInt(scanner.nextLine());
            int snowballTime=Integer.parseInt(scanner.nextLine());
            int snowballQuality=Integer.parseInt(scanner.nextLine());
            long value  = (long) Math.pow(1.00* snowballSnow / snowballTime, snowballQuality);

           //BigInteger value= BigInteger.(snowballSnow / snowballTime,snowballQuality);

           if (value>highValue){

               highValue=value;
               snowballSnow1=snowballSnow;
               snowballTime1=snowballTime;
               snowballQuality1=snowballQuality;
           }

        }

        System.out.printf("%d : %d = %d (%d)",snowballSnow1,snowballTime1,highValue,snowballQuality1);
    }
}
