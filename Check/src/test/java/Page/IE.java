package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IE {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("ignoreProtectedModeSettings",true);
				
				System.setProperty("webdriver.ie.driver", "D:\\BCP laptop\\Eclipse Workspace\\Check\\Drivers\\IEDriver\\IEDriverServer.exe");
				
				WebDriver driver = new InternetExplorerDriver(caps);
				
				driver.get("https://google.com");
				 
			    driver.findElement(By.name("q")).sendKeys("Us election");
			    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			    
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
