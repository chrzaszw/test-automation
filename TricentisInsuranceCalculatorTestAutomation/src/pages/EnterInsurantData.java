package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantData {

	WebDriver driver;

	By firstName = By.id("firstname");
	By lastName = By.id("lastname");
	By dayOfBirth = By.id("birthdate");
	By genderMale = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	By genderFemale = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span");
	By streetAddress = By.id("streetaddress");
	By country = By.id("country");
	By zipCode = By.id("zipcode");
	By city = By.id("city");
	By occupation = By.id("occupation");
	By hobbiesSpeeding = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
	By hobbiesBungeeJumping = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span");
	By hobbiesCliffDiving = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span");
	By hobbiesSkyDiving = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span");
	By hobbiesOther = By.id("other");
	By prevButton = By.id("preventervehicledata");
	By nextButton = By.id("nextenterproductdata");

	public EnterInsurantData(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName(String firstNameValue) {
		driver.findElement(firstName).sendKeys(firstNameValue);
	}

	public void enterLastName(String lastNameValue) {
		driver.findElement(lastName).sendKeys(lastNameValue);
	}

	public void enterDateOfBirth(String dateOfBirthValue) {
		driver.findElement(dayOfBirth).sendKeys(dateOfBirthValue);
	}

	public void selectGenderMale() {
		driver.findElement(genderMale).click();
	}

	public void selectGenderFemale() {
		driver.findElement(genderFemale).click();
	}

	public void enterStreetAddress(String streetAddressValue) {
		driver.findElement(streetAddress).sendKeys(streetAddressValue);

	}

	public void selectCountry(String countryName) {
		Select selectCountryValue = new Select(driver.findElement(country));
		selectCountryValue.selectByValue(countryName);

	}

	public void enterZipcode(String zipCodeValue) {
		driver.findElement(zipCode).sendKeys(zipCodeValue);
	}

	public void enterCity(String cityName) {
		driver.findElement(city).sendKeys(cityName);
	}

	public void selectOccupation(String occupationValue) {
		Select selectOccupationValue = new Select(driver.findElement(occupation));
		selectOccupationValue.selectByValue(occupationValue);

	}

	public void selectHobbySpeeding() {
		driver.findElement(hobbiesSpeeding).click();
	}

	public void selectHobbySkyDiving() {
		driver.findElement(hobbiesSkyDiving).click();
	}

	public void selectHobbyOther() {
		driver.findElement(hobbiesOther).click();
	}

	public void selectHobbyCliffDiving() {
		driver.findElement(hobbiesCliffDiving).click();
	}

	public void selectHobbyBungeeJumping() {
		driver.findElement(hobbiesBungeeJumping).click();
	}

	public void clickOnNextButton() {
		driver.findElement(nextButton).click();

	}

	public void clickOnPrevButton() {
		driver.findElement(prevButton).click();
	}
}
