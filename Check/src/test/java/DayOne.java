import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DayOne {
	
	public static void main(String[] args) {
		
		String loc = System.getProperty("user.dir");
		
		System.out.println("path : " +loc);
		
		//System.setProperty("webdriver.gecko.driver", "D:\\BCP laptop\\Eclipse Workspace\\Check\\Drivers\\GeckoDriver\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\BCP laptop\\Eclipse Workspace\\Check\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "D:\\BCP laptop\\Eclipse Workspace\\Check\\Drivers\\IEDriver\\IEDriverServer.exe");
		
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");
		 
	    driver.findElement(By.name("q"));
	    driver.findElement(By.name("q")).sendKeys("Test");
				
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
	
}
