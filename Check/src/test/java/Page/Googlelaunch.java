package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Googlelaunch {
	
	private static WebElement e1 = null;

	public static WebElement textbox(WebDriver driver) {
		
		e1 = driver.findElement(By.name("q"));
		
		return e1;
		
	}

}
