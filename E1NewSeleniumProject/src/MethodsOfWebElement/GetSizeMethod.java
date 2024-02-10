package MethodsOfWebElement;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do");
		
          WebElement usnTB = driver.findElement(By.name("username"));
          Dimension size = usnTB.getSize();
          int height = size.getHeight();
          int width = size.getWidth();
          System.out.println("Height is : "+height+" "+" Widht is : "Width");"
          	
          
          
          
	}

}
