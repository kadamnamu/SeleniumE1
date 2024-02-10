package methodOfWebDriver;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");//To launch the web application 
		
		Thread.sleep(3000);
		
		

	}
}
