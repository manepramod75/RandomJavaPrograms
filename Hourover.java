package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hourover {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver ();
		driver.get("https://www.amazon.in/l/100130892031?ref_=octosbng_PCPH070D&ef_id=:G:s&s_kwcid=AL!9012!3!!b!!o!!wholesale%20purchase%20in%20flipkart!414598796!1267737709583111&msclkid=04818ca900fe12488a31e5979d82b6fc");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//span[text() = 'Fresh']"));
		Actions A1 = new Actions (driver);
		 A1.moveToElement(e1).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Shop all groceries on Amazon")).click();
		 driver.findElement(By.id("a-autoid-0")).click();
		 WebElement e2 = driver.findElement(By.name("Enter an Indian pincode"));
		 e2.sendKeys("411033");
		 Thread.sleep(3000);
		 driver.findElement(By.id("GLUXZipUpdate")).click();
		 
		 
		
		
		/*driver.get("https://www.google.com/?zx=1765776810755&no_sw_cr=1");
		driver.manage().window().maximize();
		WebElement e5 = driver.findElement(By.className("gLFyf"));
		e1.sendKeys("Pune");
		Thread.sleep(3000);
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class ='OBMEnb']/ul/li"));
		int count1 = list1.size();
		System.out.println(count1);*/
		
		
		
		
		
		
	}

}
