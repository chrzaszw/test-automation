package testData;

import java.time.LocalDate;

public class InsuranceStartDate {
	

	public static String insuranceStartDate() {
		//this method will generate future date current date + two months as insurance Start Date
		LocalDate today = LocalDate.now();
		today = today.plusMonths(2);
		String data = today.getMonthValue() + "/" + today.getDayOfMonth() + "/" + today.getYear();
		return data;
	}

}
