package dataLayer;

import supportingSolutions.RandomNumber;

public class CommonDataLists {

	public static String selectVehicleProducent() {
		String vehicleProducent = "";
		String vehicleProducents[] = { "Audi", // Audi
				"BMW", // BMW
				"Ford", // Ford
				"Honda", // Honda
				"Mazda", // Mazda
				"Mercedes Benz", // Mercedes Benz
				"Nissan", // Nissan
				"Opel", // Opel
				"Porsche", // Porsche
				"Renault", // Renault
				"Skoda", // Skoda
				"Suzuki", // Suzuki
				"Toyota", // Toyota
				"Volkswagen", // Volkswagen
				"Volvo"// Volvo
		};
		int n = vehicleProducents.length;
		int valueNo = RandomNumber.myRandomInt(n);
		vehicleProducent = vehicleProducents[valueNo];

		return vehicleProducent;

	}

	public String numberOfSeats() {

		int supNumber = RandomNumber.myRandomInt(9) + 1;
		String numberOfSeats = Integer.toString(supNumber);
		return numberOfSeats;

	}
	
	public String fuelType() {
		String fuelTypes[] = { "Petrol", "Diesel", "Electric Power", "Gas", "Other"};
		int n = fuelTypes.length;
		int valueNo = RandomNumber.myRandomInt(n);
		String fuelType = fuelTypes[valueNo];
		return fuelType;
	}

}
