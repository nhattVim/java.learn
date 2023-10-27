package lesson;

/**
*   author: nhattruongNeoVim
*   since: 23/10/2023 14:32
*   description: Math library in Java
*   update:
*           - nhattruongNeoVim(23/10/2023 14:32)
*
*/

public class MathLib {
    public static void main(String[] args) {

        /*
         *   Method                      Definitions
         *   PI                          return PI value
         *   abs(a)                      absolute value
         *   max(a, b)                   maximum value
         *   min(a, b)                   minimum
         *   sqrt(a)                     square value
         *   pow(x, y)                   exponent x^y
         *   sin(radian)                 calculate sin value, radian = Math.Pi*corner/180
         *   cos(radian)                 calculate cos value
         *   tan(radian)                 calculate tan value
         * */

        System.out.println("Pi = " + Math.PI);
        System.out.println(Math.abs(-100));
        System.out.println(Math.max(1,5));
        System.out.println(Math.min(1,5));
        System.out.println(Math.sqrt(7));
        System.out.println(Math.pow(2, 3));

        int corner = 90;
        System.out.println("sin: " + Math.sin(Math.PI*corner/180));
        System.out.println("cos: " + Math.cos(Math.PI*corner/180));
        System.out.println("tan: " + Math.tan(Math.PI*corner/180));
        System.out.println("cotan: " + (1/Math.tan(Math.PI*corner/180)) );
    }
}