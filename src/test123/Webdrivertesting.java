package test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Webdrivertesting {

	public static void main(String[] args) {
		String actualTitle = "";
		String expectedTitle = "Worldpay";
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com");
		driver.get("file:///G:/Study/HTML%20&%20Java%20Script/Worldpay.htm");
		driver.manage().window().maximize();
		//driver.get("www.gmail.com");
		actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle))
	
		{
			System.out.println("Title Matched");
			
		}
		else{
			System.out.println("Title Not Matched");
		}
		System.out.println(driver.getTitle());
		driver.findElement(By.id("B1")).sendKeys("Rahul");
		driver.findElement(By.id("2")).sendKeys("Jain");
		driver.findElement(By.id("L4")).click();
		driver.findElement(By.id("E1")).sendKeys("rahul@gmail.com");
		driver.findElement(By.id("E2")).sendKeys("Rahul");
		driver.findElement(By.id("E3")).sendKeys("Jain");
		driver.findElement(By.id("C1")).click();
		driver.findElement(By.id("b2")).click();
		//driver.findElement(By.id("R1")).click();
		//driver.close();
		System.exit(0);
	}

}
