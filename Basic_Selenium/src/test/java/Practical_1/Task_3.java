package Practical_1;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.Diverconnection;

public class Task_3 {
	public static void main(String[] args) {
		
		WebDriver driver = Diverconnection.getdriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bhumi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patel");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		for(WebElement g : gender) 
		{
			System.out.println(g.getAttribute("Value"));
		} 
		gender.get(1).click();
		
		driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]/span[2]")).click();
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/input")).sendKeys("23/02/2020");
		driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]/span[2]/input")).click();
		driver.findElement(By.name("photo")).sendKeys("F:\\Part 2 photo\\IMG_20170308_135211.jpg");
		driver.findElement(By.xpath("//table/tbody/tr[8]/td[2]/span[3]")).click();
		
		WebElement country =  driver.findElement(By.name("continents"));
		Select conts = new Select(country);
		conts.selectByVisibleText("Africa");
		
		WebElement commands = driver.findElement(By.name("selenium_commands"));
		Select command = new Select(commands);
		command.selectByVisibleText("Wait Commands");
		command.selectByVisibleText("WebElement Commands");
		
		driver.findElement(By.name("submit")).click();
		
		
		
		
		
		
	}

}

    