package sanitytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement ;
public class GeckoScript {
	public static void main (String[] args){
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\LIKHITHA\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("www.gcrit.com/build3/admin/index.php");
	    driver.findElement(By.name("password")).click();
	    driver.quit();
	}

}
