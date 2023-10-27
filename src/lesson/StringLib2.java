package lesson;

import java.util.Scanner;

/**
*   author: nhattruongNeoVim
*   since: 24/10/2023 09:00
*   description: String in java (2)
*   update:
*           - nhattruongNeoVim(24/10/2023 09:00)
*
*/

public class StringLib2 {
    public static void main(String[] args) {
        /*  Methods         Definitions
        *   indexOf         Checks the first position of a character or string, return -1 if not found
        *   lastIndexOf     Checks the last position of a character or string, return -1 if not found
        *   contains        Check substring
        *   substring       Get a substring from a longer string
        *                       substring(int beginIndex)               :Get from beginIndex to end of string
        *                       substring(int beginIndex, int endIndex) :Get from beginIndex to endIndex - 1
        *   replace         Replace all occurrences of a substring with another substring (replaceFirst, replaceAll)
        *   trim            Trim leading and trailing spaces
        * */

        String mess = "I am student of Quy Nhon University, a very good student";
        System.out.println(mess);

        // 6.indexOf
        System.out.println("the index of the first 'student' is: " + mess.indexOf("student"));

        // 7.lastIndexOf
        System.out.println("the index of the last 'student' is: " + mess.lastIndexOf("student"));

        // 8.contains
        System.out.println();
        String link = "https://github.com/nhattruongNeoVim/dotfiles";
        System.out.println("link: " + link);
        System.out.print("enter a string you want to check: ");
        String check = new Scanner(System.in).nextLine();

        if (link.contains(check)) {
            System.out.println("find " + check + " in " + "link");
        } else {
            System.out.println("not found " + check + " in " + "link");
        }

        // 9.substring
        System.out.println();
        String message ="abcdefghijklmnopqrstuvwxyz";
        System.out.println(message);
        String sub1 = message.substring(4);
        String sub2 = message.substring(4, 8);
        System.out.println("substr from 4 to end: " + sub1 + "\n" + "substring from 4 to 8: " + sub2);

        // 10.replace
        System.out.println();
        String rfMess = mess.replaceFirst("student", "teacher");
        System.out.println(rfMess);
        String raMess = mess.replaceAll("student", "teacher");
        System.out.println(raMess);

        // 11.trim
        System.out.println();
        String trimMess = "          this is trimmed          ";
        System.out.println(trimMess);
        System.out.println(trimMess.trim());

        /* In regular expression:
         *       \s+: represents one or more consecutive spaces
         *         $: represents end of line
         *      \s+$: represents one or more consecutive spaces after the string
         *      ^\s+: represents one or more consecutive spaces before the stringh
         *         \: is a special symbol in Java, so we need \\
         * */

        // 11.1 trimEnd
        // 11.1.1 use regular expression
        trimMess = "          trimmed          ";
        String trimEnd = trimMess.replaceAll("\\s+$", "");
        System.out.println(trimEnd);

        // 11.1.2 use while
        while (trimMess.endsWith(" ")){
            trimMess = trimMess.substring(0, trimMess.length() - 1);
        }
        System.out.println(trimMess);

        // 11.2 trimStart
        // 11.2.1 use regular expression
        trimMess = "          trimmed          ";
        String trimStart = trimMess.replaceAll("^\\s+", "");
        System.out.println(trimStart);

        // 11.2.2 use while
        while (trimMess.startsWith(" ")){
            trimMess = trimMess.substring(1);
        }
        System.out.println(trimMess);
    }
}