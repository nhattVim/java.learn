package lesson;

/*  *
*   author: nhattruongNeoVim
*   since: 27/10/2023 20:48
*   description: String in java (3)
*   update:
*           - nhattruongNeoVim(27/10/2023 20:49)
*
*/

public class StringLib3 {
    public static void main(String[] args) {
        // 12.split string
        // 12.1 split string to substring
        String mess = "Hello, world";
        String[] array = mess.split(", ");
        for (String s : array) {
            System.out.println(s);
        }
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }

        // 12.2 split string to characters
        char[] characters = mess.toCharArray();
        for (char character : characters) {
            System.out.println(character);
        }
        // for (int i = 0; i < characters.length; i++) {
        //     System.out.println(characters[i]);
        // }

        // 13.toLowerCase() && toUpperCase()
        String message = "I aM NhatTrUonGnEovIm";
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

    }
}
