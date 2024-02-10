package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUndrestandSelectionMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/acer/Desktop/web%20elements/singleselect.html");
		
		WebElement singleSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select(singleSelectDD);
		
		//To select an option by using the Index value
		sel.selectByIndex(4);
		Thread.sleep(5000);
		
		//To select an option by using the Value of the Option 
		sel.selectByValue("v7");
		Thread.sleep(5000);
		
		//TO select an option by using the Value of the Option
		sel.selectByVisibleText("Samosa");
		Thread.sleep(5000);

		
		
		

	}

}
