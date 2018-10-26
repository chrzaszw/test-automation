package testData;

import java.time.LocalDate;

public class InsuranceStartDate {

	public static String insuranceStartDate() {
		LocalDate today = LocalDate.now();
		today = today.plusMonths(2);
		String data = today.getMonthValue() + "/" + today.getDayOfMonth() + "/" + today.getYear();
		return data;
	}

}
