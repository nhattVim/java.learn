package lesson;

/**
*   author: nhattruongNeoVim
*   since: 23/10/2023 14:10
*   description: Exception handling
*   update:
*           - nhattruongNeoVim(23/10/2023 14:11)
*
*/

public class TryCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
            System.out.println("a / b = " + a/b);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("This line will run whether an exception is raised or not");
        }
        System.out.println("This line won't run if an exception occurs");
    }
}