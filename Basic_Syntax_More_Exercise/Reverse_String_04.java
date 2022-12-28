package FUNDAMENTALS.Basic_Syntax_More_Exercise;

import java.util.Scanner;

public class Reverse_String_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word= scanner.nextLine();
        StringBuilder newword=new StringBuilder(word);
        String reverseword= newword.reverse().toString();
        System.out.printf("%s",reverseword);
        
    }
}
