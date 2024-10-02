package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DWSRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected_title = "Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		// maximize the window 
		driver.manage().window().maximize();
		//waiting condition
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		//enter into webpage 
		String actual_title =driver.getTitle();
		
		if(expected_title.equals(actual_title))
		{
			System.out.println("I am in dwe page");
		
		 Actions act = new Actions(driver);
		
		 WebElement log_in = driver.findElement(By.className("ico-login"));
		 act.click(log_in).perform();
		 
		 WebElement email = driver.findElement(By.id("Email"));
		 act.sendKeys(email,"vaibhavgaikwad123@gmail.com").keyDown(Keys.ENTER).perform();
		 
		 
		 WebElement password = driver.findElement(By.id("Password"));
		 act.sendKeys(password,"Vaibhav@123").keyDown(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 
		 WebElement rememberMe = driver.findElement(By.id("RememberMe"));
		 act.click(rememberMe).perform();
		 
		 
		 WebElement log_button = driver.findElement(By.xpath("//input[@value='Log in']"));
		 act.click(log_button).perform();
		 
//		 driver.close();
		 
		 System.out.println("Login sucessfully done");
		 
		}
		else {
			System.out.println("I am not in dws page");
		}
		 
		 
	

}


	}


