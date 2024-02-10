package Locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();//To Launch The Browser
	    driver.manage().window().maximize();//To maximize the browser window
	    driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
	    
	
		WebElement usnTexbox = driver.findElement(By.id("email"));
		usnTexbox.sendKeys("email");
		Thread.sleep(1000);

		String pass;
		WebElement passTextbox = driver.findElement(By.id("pass"));
		usnTexbox.sendKeys("password");
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();

		

		
		
		
	    

	    	



	}

}
