package Synchronization;

import java.time.Duration;

import org.checkerframework.common.reflection.qual.GetClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//To declare Implicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//To declare Explicit wait
		
		driver.get("https://www.shoppersstack.com");//To Launch the Web Application
		
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		
		WebElement checkButton = driver.findElement(By.xpath("//button[@id='Check"));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
		
		
		
		
		
		
		
		
		

		
		
	}

}
