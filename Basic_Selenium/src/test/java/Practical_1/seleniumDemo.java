package Practical_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumDemo {
	public static void main(String[] args) {
		
		//chrom
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\SONY\\Downloads\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	} 
}
