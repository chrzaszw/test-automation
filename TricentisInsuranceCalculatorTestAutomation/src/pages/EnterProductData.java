package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterProductData {

	WebDriver driver;

	By startDate = By.id("startdate");
	By insuranceSum = By.id("insurancesum");
	By damageInsurance = By.id("damageinsurance");
	By optionalProductEuroProtection = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span");
	By optionalProductLegalDefenseInsurance = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[2]/span");
	By nextButton = By.id("nextselectpriceoption");
	By prevButton = By.id("preventerinsurancedata");

	public EnterProductData(WebDriver driver) {
		this.driver = driver;
	}

	public void enterStartDate(String startDateValue) {
		driver.findElement(startDate).sendKeys(startDateValue);

	}

	public void selectInsuranceSum(String insuranceSumValue) {
		Select selectInsuranceSumValue = new Select(driver.findElement(insuranceSum));
		selectInsuranceSumValue.selectByValue(insuranceSumValue);
	}

	public void selectInsuranceDamage(String insuranceDamageValue) {
		Select selectInsuranceDamageValue = new Select(driver.findElement(damageInsurance));
		selectInsuranceDamageValue.selectByValue(insuranceDamageValue);
	}

	public void clickOnProductEuroProtection() {
		driver.findElement(optionalProductEuroProtection).click();
	}

	public void clickOnProductLegalDefenseInsurance() {
		driver.findElement(optionalProductLegalDefenseInsurance).click();
	}

	public void clickOnNextButton() {
		driver.findElement(nextButton).click();

	}

	public void clickOnPrevButton() {
		driver.findElement(prevButton).click();
	}

}
