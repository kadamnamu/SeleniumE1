package DropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandDeselectionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(null);
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiSelectDD);
		
		

		
		
		
	}

}
