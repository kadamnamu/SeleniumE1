package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/acer/Desktop/web%20elements/multipal.html");


        
		WebElement singleselectDD = driver.findElement(By.xpath("//select[@class='select']"));
		Select sel = new Select (singleselectDD);
		
		for(int i=2; i<=5;i++) 
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		WebElement firstops = sel.getFirstSelectedOption();
		String fso = firstops.getText();
		System.out.println(fso);


	}

}
