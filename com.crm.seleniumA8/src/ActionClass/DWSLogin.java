package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DWSLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected_url = "https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		// maximize the window 
		driver.manage().window().maximize();
		//waiting condition
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		//enter into webpage 
		String actual_url=driver.getCurrentUrl();
		
		if(expected_url.equals(actual_url))
		{
			System.out.println("I am in dwe page");
		
		
		 Actions act = new Actions(driver);
		
		 WebElement register = driver.findElement(By.className("ico-register"));
		 act.click(register).perform();
		 
		 WebElement gender = driver.findElement(By.id("gender-male"));
		 act.click(gender).perform();
		

		 WebElement first_name = driver.findElement(By.xpath("//input[@id='FirstName']"));
		 act.sendKeys(first_name,"Vaibhav").keyDown(Keys.ENTER).perform();
		 

		 WebElement last_name = driver.findElement(By.xpath("//input[@id='LastName']"));
		 act.sendKeys(last_name,"Gaikwad").keyDown(Keys.ENTER).perform();
		 

		 WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		 act.sendKeys(email,"vaibhavgaikwad123@gmail.com").keyDown(Keys.ENTER).perform();
		 
		 WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		 act.sendKeys(password,"Vaibhav@123").keyDown(Keys.ENTER).perform();
		 
		 WebElement confirm_password = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		 act.sendKeys(confirm_password,"Vaibhav@123").keyDown(Keys.ENTER).perform();
		 
		 
		 WebElement register_button = driver.findElement(By.id("gender-male"));
		 act.click(register_button).perform();
		
		 driver.close();
		 
		 System.out.println("Registeration done sucessfully");
		
		}
		else {
			System.out.println("I am not in dws page");
		}

	}

	}


