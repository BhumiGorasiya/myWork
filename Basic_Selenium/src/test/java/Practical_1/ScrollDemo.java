package Practical_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Diverconnection;

public class ScrollDemo {
	public static void main(String[] args) {
		WebDriver driver = Diverconnection.getdriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span/div/div[1]"));
		
		//js.executeScript("window.scrollBy(0,200)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//js.executeScript("arguments[0].scrollIntoView();",element);
		
	}

}
