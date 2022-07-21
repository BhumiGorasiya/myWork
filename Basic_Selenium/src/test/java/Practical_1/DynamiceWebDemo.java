package Practical_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Diverconnection;

public class DynamiceWebDemo {
	public static void main(String[] args) {
		
		WebDriver driver = Diverconnection.getdriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");	
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(rows.size());
		
		for(int i=0; i<rows.size();i++) 
		{
			System.out.println("Test");
			List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td"));
			System.out.println(cols.size());
			for(int j = 1; j<=cols.size();j++)
			{
				WebElement data = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(data.getText());
			}
		}
		
	}

}
