package exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
*   author: nhattruongNeoVim
*   since: 27/10/2023 20:31
*   description: Giải phương trình bậc 2
*   update:
*           - nhattruongNeoVim(27/10/2023 20:32)
*
*/

public class PTB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.print("Phương trình bậc hai có dạng ax^2 + bx + c = 0\n" + "Nhập a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            // phuong trinh bac nhat bx + c = 0
            System.out.println("Phương trình trở thành phương trình bậc nhất " + decimalFormat.format(b) + "x + " + decimalFormat.format(c) + " = 0");
            if (b == 0 && c == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (c == 0) {
                System.out.println("Phương trình có một nghiệm duy nhất x = 0");
            } else {
                System.out.println("Phương trình có một nghiệm duy nhất x = " + decimalFormat.format(-c / b));
            }
        } else {
            // phuong trinh bac hai
            double delta = Math.pow(b,2) - (4*a*c);
            if (delta < 0){
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + decimalFormat.format(-b/(2*a)) );
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Phương trình có hai nghiệm phân biệt   x1 = " + decimalFormat.format(x1) +"   x2 = " + decimalFormat.format(x2));
            }
        }
    }
}
