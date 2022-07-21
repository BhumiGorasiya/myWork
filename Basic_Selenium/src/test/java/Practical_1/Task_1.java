package Practical_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Diverconnection;

public class Task_1 {
	
	public static void main(String[] args) {
		WebDriver driver = Diverconnection.getdriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	
		
		

	}

}
