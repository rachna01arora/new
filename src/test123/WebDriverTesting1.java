package test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTesting1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://www.orangehrm.com/resources/download/download-software/";
		driver.get(baseUrl);
	

		
		//driver.findElement(By.id("u_0_j")).sendKeys("Rahul");
		//driver.findElement(By.id("u_0_l")).sendKeys("Jain");
		
		//driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("helllo");
       //driver.close();
	}

}
