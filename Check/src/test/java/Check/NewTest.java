package Check;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Googlelaunch;

public class NewTest {
		
		WebDriver driver = null;
		
		@BeforeTest
		public void setup() {
			
			System.setProperty("webdriver.gecko.driver", "D:\\BCP laptop\\Eclipse Workspace\\Check\\Drivers\\GeckoDriver\\geckodriver.exe");
		   
			driver = new FirefoxDriver();
			
		}
		
		@Test
		public void run() {
			
			driver.get("https://google.com");
			
			Googlelaunch.textbox(driver).sendKeys("US election results");
			 
		    Googlelaunch.textbox(driver).sendKeys(Keys.RETURN);
			
		}

		@AfterTest
		public void end() {
			
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
