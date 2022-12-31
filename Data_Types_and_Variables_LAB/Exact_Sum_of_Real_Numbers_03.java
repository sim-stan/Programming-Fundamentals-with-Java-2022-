package FUNDAMENTALS.Data_Types_and_Variables_LAB;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exact_Sum_of_Real_Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        BigDecimal sum=new BigDecimal(0);
        for (int i = 1; i <=n ; i++) {
            BigDecimal currentNum=new BigDecimal(scanner.nextLine());
            sum= sum.add(currentNum);
        }
        System.out.println(sum);
    }
}
