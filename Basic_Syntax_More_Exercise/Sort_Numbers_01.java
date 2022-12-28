package FUNDAMENTALS.Basic_Syntax_More_Exercise;

import java.util.Scanner;

public class Sort_Numbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());


        if (n1 > n2 && n1 > n3) {
            if (n2 >= n3) {
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            } else if (n2 < n3) {
                System.out.println(n1);
                System.out.println(n3);
                System.out.println(n2);
                }
             }
             else if (n2 > n1 && n2 > n3) {
                  if (n1 >= n3) {
                System.out.println(n2);
                System.out.println(n1);
                System.out.println(n3);

            } else if (n1 < n3) {
                System.out.println(n2);
                System.out.println(n3);
                System.out.println(n1);

            }
        }
             else if (n3 > n1 && n3 > n2) {
                if (n1 >=n2) {
                    System.out.println(n3);
                    System.out.println(n1);
                    System.out.println(n2);

                } else if (n1 < n2) {
                    System.out.println(n3);
                    System.out.println(n2);
                    System.out.println(n1);

                }


            }
        }
    }