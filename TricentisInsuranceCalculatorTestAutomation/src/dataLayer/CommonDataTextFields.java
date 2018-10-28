package dataLayer;

import supportingSolutions.RandomNumber;

public class CommonDataTextFields {
	
	public static String enginePerformanceValue(){
		String enginePerformance ="";
		int enginePerf = RandomNumber.myRandomInt(2000)+1;
		enginePerformance = Integer.toString(enginePerf);
		return enginePerformance;
	}
	
	public static String priceValue() {
		int value = RandomNumber.myRandomInt(1500)+500;
		String priceValue = Integer.toString(value);
		return priceValue;
	}
	public static String licenseNo() {
		int value = RandomNumber.myRandomInt(1_000_000_000);
		String licenseNo = Integer.toString(value);
		return licenseNo;
	}

	public static String annualMileageValue() {
		int value = RandomNumber.myRandomInt(99900) +100;
		String annualMileage = Integer.toString(value);
		return annualMileage;
	}
	public static String payloadValue() {
		int value = RandomNumber.myRandomInt(1000) +1;
		String payloadValue = Integer.toString(value);
		return payloadValue;
	}
	public static String weightValue() {
		int value = RandomNumber.myRandomInt(49900) +100;
		String weightValue = Integer.toString(value);
		return weightValue;
	}
	
	
}
