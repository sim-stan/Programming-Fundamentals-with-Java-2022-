package FUNDAMENTALS.Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class Triples_of_Latin_Letters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n =Integer.parseInt(scanner.nextLine());

        for (char i = 'a'; i <'a'+n ; i++) {
            for (char j = 'a'; j <'a'+n ; j++) {
                for (char k = 'a'; k <'a'+n ; k++) {

                    char firstchar=(char) ( i);
                    char secondchar=(char) (j);
                    char thirdchar=(char) ( k);

                    System.out.printf("%c%c%c%n",firstchar,secondchar,thirdchar);

                }

            }
            
        }
    }
}
