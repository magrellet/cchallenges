package hrank.amonthofcoding;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Gets the day's name using  the month, day and year as parameter
 */
public class DateAndTime {
    public static void main(String[] args) throws ParseException {
        System.out.println(findDay(8, 5, 2015));
        System.out.println(findDayJava8(8, 5, 2015));
    }

    private static String findDay(int month, int day, int year) {

        DateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");
        String date = month + " " + day + " " + year;
        String[] weekDays = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Date myDate;
        try {
            Calendar calendar = Calendar.getInstance();
            myDate = dateFormat.parse(date);
            calendar.setTime(myDate);
            int dayIndex = calendar.get(Calendar.DAY_OF_WEEK);
            return weekDays[dayIndex];

        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String findDayJava8(int month, int day, int year) throws ParseException {

        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().toString();
    }
}
