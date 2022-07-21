package Practical_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Diverconnection;

public class MultipalWindows {
	public static void main(String[] args) {
		
		WebDriver driver = Diverconnection.getdriver();
		driver.get("http://demo.guru99.com/popup.php");
		
		String mainWin = driver.getWindowHandle();
		System.err.println("mainwin :"+mainWin);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> Wins = driver.getWindowHandles();
		for(String win : Wins) 
		{
			if(!win.equals(mainWin))
			{
				driver.switchTo().window(win);
			}
		}
		driver.findElement(By.name("emailid")).sendKeys("Tops@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		//driver.close();
		
		//driver.switchTo().window(mainWin);
		//driver.close();
		driver.quit();
	}
}
