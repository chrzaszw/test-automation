package supportingSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void waitForElement (WebDriver driver2, String element_id)
	  {
		  
		  WebDriverWait wait = new WebDriverWait(driver2, 800);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id(element_id)));
	  }

	
	public static void waitForElementToBeClickable (WebDriver driver2, String element_id)
	  {
		  
		  WebDriverWait wait = new WebDriverWait(driver2, 800);
		  wait.until(ExpectedConditions.elementToBeClickable(By.id(element_id)));
	  }

}
