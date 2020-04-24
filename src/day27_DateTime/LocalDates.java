package day27_DateTime;

import java.time.LocalDate;

public class LocalDates {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2020,04,23);
        System.out.println(date); // 2020-04-23

        LocalDate birthday= LocalDate.of(2020,05,25);
        System.out.println(birthday);

        //isAfter  >>> it returns boolean ****
        boolean result= date.isBefore(birthday);
        System.out.println(result); // true

        //isBefore >>> it returns boolean ****
        boolean result1= date.isAfter(birthday);
        System.out.println(result1); // false

        // isEqual(date2)
        boolean result2 = date.isEqual(birthday);
        System.out.println(result2);

        // isLeapyear();
        boolean result3 = birthday.isLeapYear();
        System.out.println(result3);

        System.out.println("=========================================================");

        LocalDate now = LocalDate.now(); // 2020-04-23
        System.out.println("Today is: "+now);

        String str = now.toString();
        System.out.println(str.replace("-", " "));




    }
}
