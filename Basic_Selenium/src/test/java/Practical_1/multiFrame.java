package Practical_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Diverconnection;

public class multiFrame {
	public static void main(String[] args) {
		
		WebDriver driver = Diverconnection.getdriver();
		driver.get("https://demoqa.com/frames");
		/*
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		for(WebElement frame : frames)
		{
			System.out.println(frame.getAttribute("id"));
		}
		*/ 
		
		//WebElement frame = driver.findElement(By.id("sampleHeading"));
		//driver.switchTo().frame(frame);
		//System.out.println(frame);
		
		driver.switchTo().frame(1);
		String data =  driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(data);
		
	}

}
