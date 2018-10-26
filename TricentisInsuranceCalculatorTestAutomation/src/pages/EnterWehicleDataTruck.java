package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterWehicleDataTruck {
	WebDriver driver;

	By pageTitle = By.id("entervehicledata");
	By makeList = By.id("make");
	By enginePerformance = By.id("engineperformance");
	By dateOfmManufacture = By.id("dateofmanufacture");
	By numberOfSeats = By.id("numberofseats");
	By fuelType = By.id("fuel");
	By payload = By.id("payload");
	By totalWeight = By.id("totalweight");
	By listPrice = By.id("listprice");
	By licensePlateNumber = By.id("licenseplatenumber");
	By annualMileage = By.id("annualmileage");
	By nextButton = By.id("nextenterinsurantdata");

	public EnterWehicleDataTruck(WebDriver driver) {

		this.driver = driver;
	}

	public String getPageTitle() {
		String pageTitleVar = driver.findElement(pageTitle).getText();

		return pageTitleVar;
	}

	public void selectValueFromMakeList(String make) {
		Select selectMake = new Select(driver.findElement(makeList));
		selectMake.selectByValue(make);
	}

	public void enterEnginePerformance(String enginePerformanceValue) {
		driver.findElement(enginePerformance).sendKeys(enginePerformanceValue);
	}

	public void enterManufacturingDate(String manufacturingDate) {
		driver.findElement(dateOfmManufacture).sendKeys(manufacturingDate);
	}

	public void selectNumberOfSeats(String seatsNumber) {
		Select selectNumberOfSeats = new Select(driver.findElement(numberOfSeats));
		selectNumberOfSeats.selectByValue(seatsNumber);
	}

	public void selectFuelType(String typeOfFuel) {
		Select selectTypeOfFuel = new Select(driver.findElement(fuelType));
		selectTypeOfFuel.selectByValue(typeOfFuel);
	}

	public void enterPayload(String payloadValue) {
		driver.findElement(payload).sendKeys(payloadValue);
	}

	public void enterWeight(String weight) {
		driver.findElement(totalWeight).sendKeys(weight);
	}

	public void enterPrice(String price) {
		driver.findElement(listPrice).sendKeys(price);
	}

	public void enterLicencsePlateNumber(String plateNumber) {
		driver.findElement(licensePlateNumber).sendKeys(plateNumber);
	}

	public void enterAnualMileage(String mileage) {
		driver.findElement(annualMileage).sendKeys(mileage);
	}

	public void clickOnNextButton() {
		driver.findElement(nextButton).click();
	}
}
