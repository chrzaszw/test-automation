package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendQuotes {

	WebDriver driver;

	By email = By.id("email");
	By phone = By.id("phone");
	By username = By.id("username");
	By password = By.id("password");
	By confirmPassword = By.id("confirmpassword");
	By comments = By.id("Comments");
	By nextButton = By.id("sendemail");
	By prevButton = By.id("prevselectpriceoption");

	public SendQuotes(WebDriver driver) {
		this.driver = driver;
	}

	public void enterEmail(String emailValue) {
		driver.findElement(email).sendKeys(emailValue);
	}

	public void enterPhone(String phoneNumber) {
		driver.findElement(phone).sendKeys(phoneNumber);
	}

	public void enterUsername(String usernameValue) {
		driver.findElement(username).sendKeys(usernameValue);
	}

	public void enterPassword(String passwordValue) {
		driver.findElement(password).sendKeys(passwordValue);
	}

	public void confirmPassword(String passwordConformation) {
		driver.findElement(confirmPassword).sendKeys(passwordConformation);
	}

	public void enterComment(String commentValue) {
		driver.findElement(comments).sendKeys(commentValue);
	}

	public void clickOnNextButton() {
		driver.findElement(nextButton).click();
	}

	public void clickOnPrevButton() {
		driver.findElement(prevButton).click();
	}
}
