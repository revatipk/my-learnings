package enthuware.DataTimeAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestDataTime {
    public static void main(String [] args){
        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.of(2015, 2, 5);
        LocalDate d3 = LocalDate.now();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        //2
        System.out.println(LocalDate.of(2015, Month.JANUARY, 01).format(DateTimeFormatter.ISO_DATE_TIME));

        //3
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = ld.plus(Period.of(0, 1, 1));
         DateTimeFormatter.ISO_ZONED_DATE_TIME.format(LocalDateTime.now());

         //4

        java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
        System.out.println(dt);
    }
}
