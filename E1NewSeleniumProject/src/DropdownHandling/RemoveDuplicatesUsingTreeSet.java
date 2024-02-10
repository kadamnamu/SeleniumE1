package DropdownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class RemoveDuplicatesUsingTreeSet {

	private static final WebElement[] Options = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/acer/Desktop/web%20elements/multipal.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiSelectDD);//To create the object of Select
		
		//To remove the Duplicates
		TreeSet<String> ts = new TreeSet <String>();//To create the object of TreeSet
		
	List<WebElement> options = sel.getOptions();//To get the list of all the options
	
    for(WebElement we :options )
    {
    	String textToInsert = we.getText();
    	ts.add(textToInsert);
    	
    }
    for(String text : ts)
    {
      System.out.println(text);
    }
	
		
		
		
		
		
		
		

	}

}
