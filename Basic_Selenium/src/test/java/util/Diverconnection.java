package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Diverconnection {
	
	public static WebDriver getdriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}

}
