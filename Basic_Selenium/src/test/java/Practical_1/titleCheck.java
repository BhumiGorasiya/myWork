package Practical_1;

import org.openqa.selenium.WebDriver;

import util.Diverconnection;

public class titleCheck {


	public static void main(String[] args) {
		
		WebDriver driver = Diverconnection.getdriver();
		driver.get("https://www.facebook.com/");
		
		String expectedTitle = "facebook ERP";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Passes");
		}else {
			System.out.println("failed");
		}
		
		
		
	}

}
