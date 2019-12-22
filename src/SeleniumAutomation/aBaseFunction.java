package SeleniumAutomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class aBaseFunction {

	public static WebDriver getDriver() {

		 //System.setProperty("webdriver.chrome.driver","C:\\Users\\SQLDBA\\Desktop\\Drivers\\chromedriver.exe");
		 //WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.firefox.driver","C:\\Users\\SQLDBA\\Desktop\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 return driver;
	 		 
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\SQLDBA\\Desktop\\DriverForFirefoxChromeIE\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// return driver;
//
//		System.setProperty("webdriver.ie.driver",
//				"C:\\Users\\SQLDBA\\Desktop\\DriverForFirefoxChromeIE\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		return driver;

	}

}

