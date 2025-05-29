package Lab05.Ex1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyDate {

    public String getCurrentDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return format.format(new Date());
    }

    public long calculateDaysBtwDates(String date1, String date2) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = (Date) format.parse(date1);
        Date d2 = (Date) format.parse(date2);
        long diff = Math.abs(d2.getTime() - d1.getTime());
        return diff / (1000 * 60 * 60 * 24);
    }

    public String findDay(String dateStr) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = (Date) format.parse(dateStr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int dayIndex = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        return days[dayIndex];
    }

}
