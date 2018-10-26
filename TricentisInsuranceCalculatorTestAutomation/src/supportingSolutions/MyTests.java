/*
package supportingSolutions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import testData.GenerateRandomDateOfManufacturing;

public class MyTests {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\wchrzaszcz\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "http://sampleapp.tricentis.com/101/index.php";
		driver.get(baseUrl);
		driver.findElementById("nav_truck").click();
		Wait.waitForElement(driver, "make");
		driver.findElementById("engineperformance").sendKeys("2001");
		if(Assert.assertEquals(driver.findElementByXPath("//*[@id=\"insurance-form\"]/div/section[1]/div[2]/span").getText(),
				"Must be a number between 1 and 2000") {
			System.out.println("jest ok");
		}
		else {
			s
		}
		;
	}

}

*/
