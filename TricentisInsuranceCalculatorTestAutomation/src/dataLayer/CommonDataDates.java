package dataLayer;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CommonDataDates {

    public static String randomDateOfManufacturing() {

        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1998, 2018);

        gc.set(Calendar.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));

        gc.set(Calendar.DAY_OF_YEAR, dayOfYear);
        
        String dateOfManufacturing = (gc.get(Calendar.MONTH) + 1) + "/" + gc.get(Calendar.DAY_OF_MONTH) + "/" + gc.get(Calendar.YEAR);

        return dateOfManufacturing;

    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    } 
}
