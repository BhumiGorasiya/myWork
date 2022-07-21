package Practical_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Diverconnection;

public class Task_2 {
	public static void main(String[] args) {
		
		WebDriver driver = Diverconnection.getdriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//div[@class='nav-signin-tooltip-footer']/a")).click();
		
		driver.findElement(By.name("customerName")).sendKeys("Bhumi Patel");
		driver.findElement(By.id("ap_phone_number")).sendKeys("740740255");
		driver.findElement(By.xpath("//input[@id = 'ap_email']")).sendKeys("bhumi@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'ap_password']")).sendKeys("b@1234");
		driver.findElement(By.xpath("//input[@id = 'continue']")).click();
	}

}
