package test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class practice {

	public static void main(String[] args) {
	 WebDriver driver;

 String expectedvalue = "Worldpay";
 
	 //driver = new FirefoxDriver();
	 //driver.manage().window().maximize();
	 System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("file:///G:/Study/HTML%20&%20Java%20Script/Worldpay.htm");
	 driver.manage().window().maximize();
	 String actualvalue = driver.getTitle(); 
	 if(actualvalue.contentEquals(expectedvalue)){
		 System.out.println("Title matched");
	 }
	 else{
		 System.out.println("Title Not Matched");
	 }
	 WebElement uploadElement = driver.findElement(By.id("R1"));
	 driver.findElement(By.id("R1")).click();
	 uploadElement.sendKeys("F:\folder.jpg");
	 
	 
	 /*driver.get("http://demo.guru99.com/selenium/deprecated.html");
	 driver.manage().window().maximize();
	 driver.switchTo().frame("classFrame");
	 driver.findElement(By.linkText("Deprecated")).click();*/
	 
	
	 
	}

}
