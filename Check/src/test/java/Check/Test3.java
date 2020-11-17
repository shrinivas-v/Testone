package Check;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Page.Googlelaunch;

public class Test3 {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		google();

	}

	public static void google() {
	
		
		System.setProperty("webdriver.gecko.driver", "D:\\BCP laptop\\Eclipse Workspace\\Check\\Drivers\\GeckoDriver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
		Googlelaunch.textbox(driver).sendKeys("US election results");
		 
	    Googlelaunch.textbox(driver).sendKeys(Keys.RETURN);
	    
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		System.out.println("Testing Completed");
		
	}
	
}
