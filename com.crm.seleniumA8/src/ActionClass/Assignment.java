package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		String expected_title = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		// open  the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window 
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into facebook 
		driver.get("https://www.myntra.com/");
		String actual_title =driver.getTitle();
		
		Thread.sleep(3000);
		if(expected_title.equals(actual_title))
		{
           System.out.println("i am in myntra page");
           
            Actions act = new Actions(driver);
            
			WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
			act.moveToElement(men).perform();
			Thread.sleep(2000);
			
			
			
			WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
			
			act.moveToElement(women).perform();
			Thread.sleep(2000);
			
			
			
			WebElement kids = driver.findElement(By.xpath("//a[text()='Kids']"));
			
			act.moveToElement(kids).perform();
			Thread.sleep(2000);
			
			
			
			WebElement home = driver.findElement(By.xpath("//a[text()='Home & Living']"));
			
			act.moveToElement(home).perform();
			Thread.sleep(2000);
			
			
			
			WebElement beauty = driver.findElement(By.xpath("//a[text()='Beauty']"));
			
			act.moveToElement(beauty).perform();
			Thread.sleep(2000);
						
			
			WebElement studio = driver.findElement(By.xpath("//a[text()='Studio']"));
			
			act.moveToElement(studio).perform();
			Thread.sleep(2000);
			
			
	    }
		else {
			System.out.println("i am not in myntra page");
		}
		driver.close();

}


	}


