package MethodsOfWebElement;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		
		//To find username textbox and store in a variable
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");//To pass the inputs to username textbox
		
		

		
		
	}

}
