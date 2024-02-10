package Locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();//To Launch The Browser
	    driver.manage().window().maximize();//To maximize the browser window
		driver.get("file:///C:/Users/acer/Desktop/web%20elements/textbox.html");//To launch Web Application.
		Thread.sleep(2000);
		
		WebElement textBox = driver.findElement(By.tagName("inpt"));//Find Password TextField on the webpage.
		textBox.sendKeys("manager");//To pass the inputs to Password TextField.
		
		//Note:- Inputs are passed to Username TextField bacause it is the 1st element designed with input tag.
		

	}

}
