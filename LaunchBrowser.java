package selenium;


import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

	ChromeDriver D2 = new ChromeDriver();
	D2.get ("https://www.gmail.com");
	Thread.sleep(3000);
	String url=	D2.getCurrentUrl();
	Set<String> handle = D2.getWindowHandles();
	String title = 	D2.getTitle();
	D2.findElement(By.id("identifierId")).sendKeys("mane.pdm@gmail.com");
	D2.findElement(By.id("identifierNext")).click();
	//D2.quit();
	System.out.println("Url >>"+url);
	System.out.println("Parent browser id >> "+ handle);
	//System.out.println(D2);
	System.out.println("Title of active tab >>"+title);
	
	}

}
 