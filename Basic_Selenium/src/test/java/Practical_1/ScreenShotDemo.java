 package Practical_1;

import org.openqa.selenium.WebDriver;

import util.Diverconnection;

public class ScreenShotDemo {
	public static void main(String[] args) {
		
		WebDriver driver = Diverconnection.getdriver();
		driver.get("");
	}

}
