package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsuranceCalculatorHomePage {

	WebDriver driver;

	By applicationName = By.id("app_sub_title");
	By automobileLink = By.id("nav_automobile");
	By truckLink = By.id("nav_truck");
	By motorcycleLink = By.id("nav_motorcycle");
	By camperLink = By.id("nav_camper");

	public InsuranceCalculatorHomePage(WebDriver driver) {

		this.driver = driver;
	}
	
	public String getApplicationTitle() {
		String applicationTitle = driver.findElement(applicationName).getText();
		return applicationTitle;
	}
	
	public void clickOnAutomobileLink () {
		driver.findElement(automobileLink).click();
	}
	
	public void clickOnTruckeLink () {
		driver.findElement(truckLink).click();
	}
	public void clickOnMotorcycleLink () {
		driver.findElement(motorcycleLink).click();
	}
	public void clickOnCamperLink () {
		driver.findElement(camperLink).click();
	}

}
