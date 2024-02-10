package assignmet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class FlipKartAssignment {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Hp Laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("///div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='HP']/ Preceding-sibling :: div[@class='_24_Dny']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='Core i5']/ Preceding-sibling :: div[@class='_24_Dny']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("///div[text()='RAM Capacity'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='8 GB']/ Preceding-sibling :: div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("///div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[text()='8 GB']/ Preceding-sibling :: div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		
           List<WebElement> laptops = driver.findElements(By.xpath("//div[@CLASS= '_4Rr01T']"));
           
   List<WebElement> laptopPrices = driver.findElements(By.xpath("//div[@CLASS= '_4Rr01T']/ ancestor :: div[@class='_3pLy-c row']/ descendant :: div[@class='_30jeq3 _1_WHN1'"));
           for (int i=0; i < laptops.size(); i++);
           {
        	   
           
           String op = laptops.getClass()
		
          for(int i=0; i < laptops.size();i++)
		 
		 {
			 String price = laptopPrices.get(i).getText();
			 System.out.print(op+" : "+price);
			 Thread.sleep(1000);
			 }
		       System.out.println();
           
           }
           
	}

           
	
		
 		







		



