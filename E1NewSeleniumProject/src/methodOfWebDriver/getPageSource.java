package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String pageSourece = driver.getPageSource();
		
		System.out.println(pageSourece);
		

	}

}
