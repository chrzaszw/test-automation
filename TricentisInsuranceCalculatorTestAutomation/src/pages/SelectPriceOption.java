package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectPriceOption {

	WebDriver driver;

	By priceSilver = By.id("selectsilver_price");
	By priceGold = By.id("selectgold_price");
	By pricePlatinium = By.id("selectplatinum_price");
	By priceUltimate = By.id("selectultimate_price");
	By priceSilverOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span");
	By priceGoldOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span");
	By pricePlatiniumOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span");
	By priceUltimateOption = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
	By nextButton = By.xpath("//*[@id=\"nextsendquote\"]");
	By prevButton = By.id("");


	public SelectPriceOption(WebDriver driver) {

		this.driver = driver;
	}

	public String getSilverPrice() {
		return driver.findElement(priceSilver).getText();
	}

	public String getGoldPrice() {
		return driver.findElement(priceGold).getText();
	}

	public String getPlatiniumPrice() {
		return driver.findElement(pricePlatinium).getText();
	}

	public String getUltimatePrice() {
		return driver.findElement(priceUltimate).getText();
	}

	public void selectSilverPriceOption() {
		driver.findElement(priceSilverOption).click();
	}

	public void selectGoldPriceOption() {
		driver.findElement(priceGoldOption).click();
	}

	public void selectPlatiniumPriceOption() {
		driver.findElement(pricePlatiniumOption).click();
	}

	public void selectUltimatePriceOption() {
		driver.findElement(priceUltimateOption).click();
	}
	

	public void clickOnNextButton() {
		driver.findElement(nextButton).click();
	}
	
	
}
