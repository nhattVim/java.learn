package lesson;

/**
*   author: nhattruongNeoVim
*   since: 24/10/2023 08:35
*   description: String in java (1)
*   update:
*           - nhattruongNeoVim(24/10/2023 08:35)
*
*/

public class StringLib1 {
    public static void main(String[] args) {

        // In Java, the main library works with String is StringBuilder

        /*      Methods                     Definitions
         *      append(String)              Adds the given string to the end of the string
         *      insert(index, String)       Inserts the given string at the given index into the string
         *      delete(start, end)          Deletes all characters from the start to end - 1
         *      string.Length()             Returns the length of the string (including whitespace)
         */

        StringBuilder mess = new StringBuilder();
        StringBuilder initMess = new StringBuilder("Init a message");

        // 1.append
        mess.append("Hello, ");
        mess.append("I just learned how to create a message with StringBuilder");
        System.out.println(mess);

        // 2.insert
        mess.insert(5, " everyone");
        System.out.println(mess);

        // 3.delete
        mess.delete(0, 6);
        System.out.println(mess);

        // 4.length
        System.out.println(mess.length());
    }
}