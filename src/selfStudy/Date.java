package selfStudy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate current=LocalDate.now();
        System.out.println(current.format(dtf));
        System.out.println("=====");
        LocalDate birthday=LocalDate.of(2020,05,25);
        System.out.println(birthday.format(dtf));

        System.out.println("=====");
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd MMMM yyyy, E");
        System.out.println(birthday.format(dtf2));

        System.out.println("=====");
        LocalDate bdFiliz=LocalDate.of(2020,04,05);
        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("dd MM yyyy, E");
        System.out.println(bdFiliz.format(dtf3));


    }
}
