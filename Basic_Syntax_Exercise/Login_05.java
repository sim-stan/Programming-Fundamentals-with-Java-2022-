package FUNDAMENTALS.Basic_Syntax_Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String userName= scanner.nextLine();
        String command= scanner.nextLine();
        StringBuilder sb=new StringBuilder(userName);
        String reversePass= sb.reverse().toString();
        int attempt=0;


        while (true){


        if (!command.equals(reversePass)) {
            attempt++;

            if (attempt ==4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
        }else {
            System.out.printf("User %s logged in.",userName);
            break;
        }
            command= scanner.nextLine();
        }
    }
}
