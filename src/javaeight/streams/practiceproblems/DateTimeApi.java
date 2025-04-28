package javaeight.streams.practiceproblems;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeApi {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        Period period =Period.between(LocalDate.of(2003,11, 4),today);
        System.out.println(period.getYears()+" Years "+period.getMonths()+" Months "+period.getDays()+" Days");

    }
}
