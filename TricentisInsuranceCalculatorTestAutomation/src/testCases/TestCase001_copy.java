/*
 The goal of this test is to verify if user is able to order insurance for Truck
 Author: Wojciech Chrzaszcz
 * 
 */
/* package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import supportingSolutions.*;
import testData.*;

public class TestCase001_copy {

	ChromeDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\wchrzaszcz\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test(priority = 1)

	public void openInsuranceCalculatorApp() {
		String baseUrl = "http://sampleapp.tricentis.com/101/index.php";
		driver.get(baseUrl);

		Wait.waitForElement(driver, "app_sub_title");
		Assert.assertEquals(driver.getTitle(), "Tricentis Vehicle Insurance");
	}

	@Test(priority = 2)
	public void clickOnTruckOption() {
		Wait.waitForElement(driver, "nav_truck");
		InsuranceCalculatorHomePage calculatorHomePage = new InsuranceCalculatorHomePage(driver);
		calculatorHomePage.clickOnTruckeLink();
	}

	@Test(priority = 3)
	public void populateEnterWehicleData() {
		EnterWehicleDataTruck wehicleDataTruck = new EnterWehicleDataTruck(driver);
		Wait.waitForElement(driver, "make");
		wehicleDataTruck.selectValueFromMakeList(EnterWehicleDataStepTestData.selectMakeValue());
		wehicleDataTruck.enterEnginePerformance("2001");
		Assert.assertEquals(driver.findElementByXPath("//*[@id=\"insurance-form\"]/div/section[1]/div[2]/span").getText(),
				"Must be a number between 1 and 2000") ;
		wehicleDataTruck.enterManufacturingDate(GenerateRandomDateOfManufacturing.randomDateOfManufacturing());
		wehicleDataTruck.selectNumberOfSeats("3");
		wehicleDataTruck.selectFuelType("Diesel");
		wehicleDataTruck.enterPayload("1000");
		wehicleDataTruck.enterWeight("2300");
		wehicleDataTruck.enterPrice("90000");
		wehicleDataTruck.enterLicencsePlateNumber("AB007");
		wehicleDataTruck.enterAnualMileage("24000");
		wehicleDataTruck.clickOnNextButton();
	}

	@AfterTest

	public void browserClose() {
		driver.quit();
	}

} */
