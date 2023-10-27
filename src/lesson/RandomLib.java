package lesson;

import java.util.Random;

/**
*   author: nhattruongNeoVim
*   since: 23/10/2023 15:52
*   description: Ramdom in java
*   update:
*           - nhattruongNeoVim(23/10/2023 15:52)
*
*/

public class RandomLib {
    public static void main(String[] args) {
        // initialize a random object
        Random rd = new Random();

        int n = rd.nextInt(101) - 50;
        System.out.println(n);

        double f = rd.nextDouble() * 100;
        System.out.println(f);
    }
}