package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOperationMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/acer/Desktop/web%20elements/multipal.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiSelectDD);
		
		sel.selectByIndex(3);
		Thread.sleep(3000);
		
	    sel.selectByValue("v2");
		Thread.sleep(2000);
		
		
		
		
		

			
		
	}

}
