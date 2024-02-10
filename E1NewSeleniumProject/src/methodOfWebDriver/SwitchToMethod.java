package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.switchTo().activeElement().sendKeys("Java,Keys.ENTER");




	}

}
