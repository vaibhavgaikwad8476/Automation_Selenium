package basis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		String expected_title = "Facebook – log in or sign up";

		// open  the browser

		ChromeDriver driver = new ChromeDriver();

		// maximize the window 

		driver.manage().window().maximize();

		//waiting condition

		Thread.sleep(3000);

		//enter into facebook page

		driver.get("https://www.facebook.com/");

		//verifying the page

		String actual_title = driver.getTitle();

		Thread.sleep(3000);

		if(expected_title.equals(actual_title))

		{

			System.out.println("I am in facebook page");

		    driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		    Thread.sleep(3000);

		    driver.findElement(By.xpath("//input[@data-type='text']")).sendKeys("Vaibhav");

		    Thread.sleep(3000);

		    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gaikwad");

		    Thread.sleep(3000);

		    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("vaibhavgaikwad8476@gmail.com");

		    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Vaibhav@1234");

		    

	        WebElement birth_day = driver.findElement(By.id("day"));

	        Select  sel = new Select(birth_day);

		    sel.selectByVisibleText("28");

		    

		    WebElement birth_month = driver.findElement(By.id("month"));

		    Select  sel1 = new Select(birth_month);

		    sel1.selectByVisibleText("Mar");

		    

		    WebElement birth_year = driver.findElement(By.id("year"));

			Select  sel2 = new Select(birth_year);

		    sel2.selectByVisibleText("2001");

		    

		    driver.findElement(By.xpath("//label[text()='Male']")).click();

		    driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();

		    Thread.sleep(3000);

		    driver.close();
       }

	}

	}


