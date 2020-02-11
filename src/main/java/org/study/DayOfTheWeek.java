package org.study;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfTheWeek {

    public String dayOfTheWeek(int day, int month, int year) {
        String[]days={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Calendar cal= new GregorianCalendar(year,month-1,day);
        return days[(cal.get(Calendar.DAY_OF_WEEK)-1)];

    }

    public static void main(String[] args) {
        System.out.println(new DayOfTheWeek().dayOfTheWeek(31,8,2019));
    }
}
