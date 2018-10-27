package dataLayer;

import java.time.LocalDate;
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
    
	public static String insuranceStartDate() {
		//this method will generate future date current date + two months as insurance Start Date
		LocalDate today = LocalDate.now();
		today = today.plusMonths(2);
		String data = today.getMonthValue() + "/" + today.getDayOfMonth() + "/" + today.getYear();
		return data;
	}
}
