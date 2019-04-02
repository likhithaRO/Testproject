package sanitytest;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglechromeTestcase {
	
	public static void main (String [] args){
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	String PageTitle = driver.getTitle() ;
	
	if(PageTitle.equals("Google")){
		System.out.println("Google application launched - Passes ");
	}
	else {
		System.out.println("Google application not launched - Fail");
	}
	driver.close();
	}
}
