package lesson;

import java.util.Scanner;

/**
*   author: nhattruongNeoVim
*   since: 23/10/2023 16:33
*   description: Character in java
*   update:
*           - nhattruongNeoVim(23/10/2023 16:33)
*
*/

public class CharType {
    public static void main(String[] args) {

        /*  Method                              Definitions
         *   Character.isDigit()             returns true if input character is a digit (0,1,2,...)
         *   Character.isLetter()            returns true if input character is a letter (a,b,c,A,...)
         *   Character.isWhitespace()        returns true if input character is a whitespace
         *   Character.isLowerCase()         returns true if input character is a lower
         *   Character.isUpperCase()         returns true if input character is an upper
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String s = sc.nextLine();
        char c = s.charAt(0);
        System.out.println(c);

        // Compare
        System.out.println(Character.compare('b', 'b'));
        System.out.println(Character.compare('a', 'b'));
        System.out.println(Character.compare('b', 'a'));

        // Method
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isWhitespace(c));
        System.out.println(Character.isLowerCase(c));
        System.out.println(Character.isUpperCase(c));
    }
}