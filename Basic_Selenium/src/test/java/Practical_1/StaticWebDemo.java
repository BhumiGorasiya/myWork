package Practical_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Diverconnection;

public class StaticWebDemo {

	public static void main(String[] args) {
		
		WebDriver driver = Diverconnection.getdriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		WebElement currency = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]"));
		System.out.println(currency.getText());
	}
}
