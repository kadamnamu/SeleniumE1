package DropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicatesUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/acer/Desktop/web%20elements/multipal.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiSelectDD);//To create the object of Select
		  HashSet<String> hs = new HashSet<String> ();
		  
		  List<WebElement> option = sel.getOptions();
		  
		  for (int i=0; i<options.size();i++);
		  
		  
		  
		  
		  
		
		
		
		

		

		
	
		
		
	}

}
