/*
 The goal of this test is to verify if user is able to order insurance for Truck
 Author: Wojciech Chrzaszcz

 */
package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import supportingSolutions.*;
import testData.*;

public class TestCase001 {

	ChromeDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\wchrzaszcz\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)

	public void step1_OpenInsuranceCalculatorApp() {
		String baseUrl = "http://sampleapp.tricentis.com/101/index.php";
		driver.get(baseUrl);
		Wait.waitForElement(driver, "app_sub_title");
		Assert.assertEquals(driver.getTitle(), "Tricentis Vehicle Insurance");
	}

	@Test(priority = 2)
	public void step2_clickOnTruckOption() {
		Wait.waitForElement(driver, "nav_truck");
		InsuranceCalculatorHomePage calculatorHomePage = new InsuranceCalculatorHomePage(driver);
		calculatorHomePage.clickOnTruckeLink();
	}

	@Test(priority = 3)
	public void step3_populateEnterWehicleData() {
		EnterWehicleDataTruck wehicleDataTruck = new EnterWehicleDataTruck(driver);
		Wait.waitForElement(driver, "make");
		wehicleDataTruck.selectValueFromMakeList("Mercedes Benz");
		wehicleDataTruck.enterEnginePerformance("200");
		wehicleDataTruck.enterManufacturingDate("01/01/2014");
		wehicleDataTruck.selectNumberOfSeats("3");
		wehicleDataTruck.selectFuelType("Diesel");
		wehicleDataTruck.enterPayload("900");
		wehicleDataTruck.enterWeight("1000");
		wehicleDataTruck.enterPrice("80000");
		wehicleDataTruck.enterLicencsePlateNumber("AB007");
		wehicleDataTruck.enterAnualMileage("23000");
		wehicleDataTruck.clickOnNextButton();
	}

	@Test(priority = 4)
	public void step4_populateInsurantData() {
		EnterInsurantData enterInsurantData = new EnterInsurantData(driver);
		Wait.waitForElement(driver, "firstname");
		enterInsurantData.enterFirstName("John");
		enterInsurantData.enterLastName("Smith");
		enterInsurantData.enterDateOfBirth("03/23/1990");
		enterInsurantData.selectGenderMale();
		enterInsurantData.selectCountry("United Kingdom");
		enterInsurantData.enterZipcode("8050");
		enterInsurantData.selectOccupation("Employee");
		enterInsurantData.selectHobbySpeeding();
		enterInsurantData.clickOnNextButton();

	}

	@Test(priority = 5)
	public void step5_enterProductData() {
		EnterProductData enterProductData = new EnterProductData(driver);
		Wait.waitForElement(driver, "startdate");
		enterProductData.enterStartDate(InsuranceStartDate.insuranceStartDate());
		enterProductData.selectInsuranceSum("7000000");
		enterProductData.selectInsuranceDamage("Full Coverage");
		enterProductData.clickOnProductEuroProtection();
		enterProductData.clickOnNextButton();

	}

	@Test(priority = 6)
	public void step6_selectPriceOption() {
		SelectPriceOption selectPriceOption = new SelectPriceOption(driver);
		Wait.waitForElement(driver, "selectplatinum_price");
		Assert.assertEquals("1,659.00", selectPriceOption.getPlatiniumPrice());
		selectPriceOption.selectPlatiniumPriceOption();
		Wait.waitForElementToBeClickable(driver, "nextsendquote");
		selectPriceOption.clickOnNextButton();
	}

	@Test(priority = 7)
	public void step7_SendQuotes() {
		SendQuotes sendQuotes = new SendQuotes(driver);
		Wait.waitForElement(driver, "email");
		sendQuotes.enterEmail("abc@abc.com");
		sendQuotes.enterPhone("789000090");
		sendQuotes.enterUsername("testuser");
		sendQuotes.enterPassword("Passw0rd");
		sendQuotes.confirmPassword("Passw0rd");
		sendQuotes.enterComment("test comment");
	//	sendQuotes.clickOnNextButton();

	}

	@AfterTest

	public void browserClose() {
		 driver.quit();
	}

}
