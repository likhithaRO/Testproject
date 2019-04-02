package sanitytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\LIKHITHA\\geckodriver.exe");	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	driver.quit();

	}

}
