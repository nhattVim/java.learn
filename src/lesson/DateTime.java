package lesson;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
*   author: nhattruongNeoVim
*   since: 23/10/2023 14:10
*   description: DateTime in java
*   update:
*           - nhattruongNeoVim(23/10/2023 14:10)
*
*/

public class DateTime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        // Lấy ngày tháng năm (Getter)
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(day + "/" + month + "/" + year);

        // Set ngày tháng năm theo ý muốn (Setter)
        cal.set(Calendar.YEAR, 1987);
        cal.set(Calendar.MONTH, 12 - 1); // Tháng trong java chạy từ 0 -> 11
        cal.set(Calendar.DAY_OF_MONTH, 13);

        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(day + "/" + (month + 1) + "/" + year);

        // Xuất theo định dạng
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        // Tạo một đối tượng để get time trong đối tượng cal
        Date date = cal.getTime();
        String formatDate = dinhDang.format(date);
        System.out.println(formatDate);
    }
}
