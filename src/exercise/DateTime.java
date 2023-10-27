package exercise;

import java.util.Calendar;
import java.util.Scanner;

/**
*   author: nhattruongNeoVim
*   since: 23/10/2023 13:48
*   description: Viết chương trình nhập vào ngày tháng năm sinh và tính tuổi
*   update:
*           - nhattruongNeoVim(23/10/2023 13:49)
*
*/

public class DateTime {
    public static void main(String[] args) {
        int day, month, year, age;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your day: ");
        day = input.nextInt();
        System.out.print("Enter your month: ");
        month = input.nextInt();
        System.out.print("Enter your year: ");
        year = input.nextInt();

        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month - 1, day);
        System.out.println("Your birthday is " + birthday.get(Calendar.DAY_OF_MONTH) + "/" + (birthday.get(Calendar.MONTH) + 1) + "/" + birthday.get(Calendar.YEAR));

        // Calculate age
        Calendar current = Calendar.getInstance();
        age = current.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
        System.out.println("Your age is " + age + " years old");
    }
}