package Task;

public class Base {

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import basis.WebDriver;

public static WebDriver driver;
		
		public static void preCondition(String browser) throws InterruptedException {
			
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver=new WebDriver();
			} 
			else if(browser.equalsIgnoreCase("edge"))
			{
				driver=new WebDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver=new WebDriver();
			}
			else {
				ChromeDriver driver=new ChromeDriver();
			}
			//	maximize the window
			
			driver.manage().window().maximize();
			//	waiting condition
			Thread.sleep(2000);
			//get the url	
			driver.get("https://demowebshop.tricentis.com/");
		}
		
			public static void login() throws InterruptedException
			{
				driver.findElement(By.xpath("//a[@class='ico-login']")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("Email")).sendKeys("kunalacn86@gmail.com");
				driver.findElement(By.id("Password")).sendKeys("SR@150499");
				driver.findElement(By.id("RememberMe")).click();
				driver.findElement(By.cssSelector("input[value='Log in']")).click();
			}
			
			
			public static void logout() 
			{
				driver.findElement(By.xpath("//a[text()='Log Out']")).click();
			}
			
			public static void postCondition() 
			{
				driver.close();
			}
	

