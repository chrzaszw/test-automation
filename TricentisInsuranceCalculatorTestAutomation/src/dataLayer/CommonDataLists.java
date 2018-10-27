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
		String fuelTypes[] = { "Petrol", "Diesel", "Electric Power", "Gas", "Other" };
		int n = fuelTypes.length;
		int valueNo = RandomNumber.myRandomInt(n);
		String fuelType = fuelTypes[valueNo];
		return fuelType;
	}

	public String countryName() {
		String countryNames[] = { "Andorra", "United Arab Emirates", "Afghanistan", "Antigua and Barbuda", "Anguilla",
				"Albania", "Armenia", "Angola", "Antarctica", "Argentina", "American Samoa", "Austria", "Australia",
				"Aruba", "Åland Islands", "Azerbaijan", "Bosnia and Herzegovina", "Barbados", "Bangladesh", "Belgium",
				"Burkina Faso", "Bulgaria", "Bahrain", "Burundi", "Benin", "Saint Barthélemy", "Bermuda",
				"Brunei Darussalam", "Bolivia - Plurinational State of ", "Bonaire - Sint Eustatius and Saba", "Brazil",
				"Bahamas", "Bhutan", "Bouvet Island", "Botswana", "Belarus", "Belize", "Canada",
				"Cocos (Keeling) Islands", "Congo - the Democratic Republic of the", "Central African Republic",
				"Congo", "Switzerland", "Côte d' ivoire", "Cook Islands", "Chile", "Cameroon", "China", "Colombia",
				"Costa Rica", "Cuba", "Cabo Verde", "Curaçao", "Christmas Island", "Cyprus", "Czech Republic",
				"Germany", "Djibouti", "Denmark", "Dominica", "Dominican Republic", "Algeria", "Ecuador", "Estonia",
				"Egypt", "Western Sahara", "Eritrea", "Spain", "Ethiopia", "Finland", "Fiji",
				"Falkland Islands (Malvinas)", "Micronesia - Federated States of", "Faroe Islands", "France", "Gabon",
				"United Kingdom", "Grenada", "Georgia", "French Guiana", "Guernsey", "Ghana", "Gibraltar", "Greenland",
				"Gambia", "Guinea", "Guadeloupe", "Equatorial Guinea", "Greece",
				"South Georgia and the South Sandwich Islands", "Guatemala", "Guam", "Guinea-Bissau", "Guyana",
				"Hong Kong", "Heard Island and McDonald Islands", "Honduras", "Croatia", "Haiti", "Hungary",
				"Indonesia", "Ireland", "Israel", "Isle of Man", "India", "British Indian Ocean Territory", "Iraq",
				"Iran - Islamic Republic of", "Iceland", "Jersey", "Jamaica", "Jordan", "Japan", "Kenya", "Kyrgyzstan",
				"Cambodia", "Kiribati", "Comoros", "Saint Kitts and Nevis", "Korea - Democratic People",
				"Korea - Republic of", "Kuwait", "Cayman Islands", "Kazakhstan", "Lao People", "Lebanon", "Saint Lucia",
				"Liechtenstein", "Sri Lanka", "Liberia", "Lesotho", "Lithuania", "Luxembourg", "Latvia", "Libya",
				"Morocco", "Monaco", "Moldova - Republic of", "Montenegro", "Saint Martin (French part)", "Madagascar",
				"Marshall Islands", "Macedonia - the former Yugoslav Republic of", "Mali", "Myanmar", "Mongolia",
				"Macao", "Northern Mariana Islands", "Martinique", "Mauritania", "Montserrat", "Malta", "Mauritius",
				"Maldives", "Malawi", "Mexico", "Malaysia", "Mozambique", "Namibia", "New Caledonia", "Niger",
				"Norfolk Island", "Nigeria", "Nicaragua", "Netherlands", "Norway", "Nepal", "Nauru", "Niue",
				"New Zealand", "Oman", "Panama", "Peru", "French Polynesia", "Papua New Guinea", "Philippines",
				"Pakistan", "Poland", "Saint Pierre and Miquelon", "Pitcairn", "Puerto Rico", "Palestine - State of",
				"Portugal", "Palau", "Paraguay", "Qatar", "Réunion", "Romania", "Serbia", "Russian Federation",
				"Rwanda", "Saudi Arabia", "Solomon Islands", "Seychelles", "Sudan", "Sweden", "Singapore",
				"Saint Helena - Ascension and Tristan da Cunha", "Slovenia", "Svalbard and Jan Mayen", "Slovakia",
				"Sierra Leone", "San Marino", "Senegal", "Somalia", "Suriname", "South Sudan", "Sao Tome and Principe",
				"El Salvador", "Sint Maarten (Dutch part)", "Syrian Arab Republic", "Swaziland",
				"Turks and Caicos Islands", "Chad", "French Southern Territories", "Togo", "Thailand", "Tajikistan",
				"Tokelau", "Timor-Leste", "Turkmenistan", "Tunisia", "Tonga", "Turkey", "Trinidad and Tobago", "Tuvalu",
				"Taiwan - Province of China", "Tanzania - United Republic of", "Ukraine", "Uganda",
				"United States Minor Outlying Islands", "United States", "Uruguay", "Uzbekistan",
				"Holy See (Vatican City State)", "Saint Vincent and the Grenadines",
				"Venezuela - Bolivarian Republic of", "Virgin Islands - British", "Virgin Islands - U.S.", "Viet Nam",
				"Vanuatu", "Wallis and Futuna", "Samoa", "Yemen", "Mayotte", "South Africa", "Zambia", "Zimbabwe" };

		int n = countryNames.length;
		int valueNo = RandomNumber.myRandomInt(n);
		String countryName = countryNames[valueNo];

		return countryName;

	}

}
