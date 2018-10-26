package dataLayer;

import supportingSolutions.RandomNumber;

public class MotorcycleSpecificData {

	
	public String motorcycleNumberOfSeats() {
		int supNumber = RandomNumber.myRandomInt(3) + 1;
		String numberOfSeats = Integer.toString(supNumber);
		return numberOfSeats;
	}
	
	

}
