package Practical_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.Diverconnection;

public class Task_6 {
	public static void main(String[] args) {
		
		WebDriver driver = Diverconnection.getdriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		driver.findElement(By.id("firstName")).sendKeys("Tops");
		driver.findElement(By.id("lastName")).sendKeys("Tech");
		driver.findElement(By.id("userEmail")).sendKeys("tops@gmail.com");
  
		driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div[2]")).click();
		/*
		List<WebElement> Gender = driver.findElements(By.name("gender"));
		for(WebElement g : Gender)
		{
			System.out.println(g.getAttribute("value"));
		}
		Gender.get(1).click(); 
		*/
		driver.findElement(By.id("userNumber")).sendKeys("9595952587");
		driver.findElement(By.id("dateOfBirthInput")).click();
		 
		String myDate = "25";  
		String myMonth = "April";
		String myYear = "2022";
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText(myYear);
		
		List<WebElement> date = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		for(WebElement d : date)
		{
			if(d.getText().equals(myDate))
			{
				if(d.getAttribute("aria-label").contains(myMonth))
				{
					d.click();
					break;
				}
			}
		}
		
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		Actions builder = new Actions(driver);
		
		builder.click(subject)
				.sendKeys("Maths")
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[1]/label")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("F:\\Part 2 photo\\IMG-20170220-WA0000.jpg");
		driver.findElement(By.id("currentAddress")).sendKeys("Surat. Gujrat");
		
		
		
	}

}
