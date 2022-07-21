package Practical_1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Diverconnection;

public class AlertButton {
	public static void main(String[] args) {
		
		WebDriver driver = Diverconnection.getdriver();
		driver.get("https://demoqa.com/alerts");
		
		//driver.findElement(By.id("alertButton")).click();
		
		//Alert alert = driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));			//explicite wait
		wait.until(ExpectedConditions.alertIsPresent()); 
		 
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 alert.accept();
		
	
		/*
		driver.findElement(By.id("confirmButton")).click();
		 
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 alert.dismiss();
		 */
		
		/*
		 driver.findElement(By.id("promtButton")).click();
		
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 alert.sendKeys("xyz");
		 alert.accept();
		*/
		
		
		 
	}

}
