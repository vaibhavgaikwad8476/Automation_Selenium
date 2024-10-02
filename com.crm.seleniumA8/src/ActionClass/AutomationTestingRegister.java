package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityClass.BaseClass;

public class AutomationTestingRegister extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				       
				       
		
				        // Initialize the ChromeDriver
				        ChromeDriver driver = new ChromeDriver();

				        // Maximize the browser window
				        driver.manage().window().maximize();

				        // Navigate to the Automation Demo Site
				        driver.get("https://demo.automationtesting.in/Register.html");

				        // Fill in the registration details
				        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Pratik");
				        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Waghmare");
				        driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Vinkar coloney choupala Nanded");
				        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("wagpratik110@gmail.com");
				        driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("7385554067");
				        driver.findElement(By.cssSelector("input[value='Male']")).click();
				        driver.findElement(By.id("checkbox1")).click();
				        driver.findElement(By.id("msdd")).click();
				        driver.findElement(By.cssSelector("li[class='ng-scope']")).click();
				        driver.findElement(By.id("Skills")).sendKeys("Java");
				        driver.findElement(By.id("countries")).sendKeys("India");
				        driver.findElement(By.id("yearbox")).sendKeys("2000");
				        driver.findElement(By.cssSelector("select[placeholder='Month']")).sendKeys("February");
				        driver.findElement(By.id("daybox")).sendKeys("2");
				        driver.findElement(By.id("firstpassword")).sendKeys("Pratik@123");
				        driver.findElement(By.id("secondpassword")).sendKeys("Pratik@123");
				        driver.findElement(By.xpath("//*[@id=\"msdd\"]/div"));

				        // Submit the form
				        driver.findElement(By.id("submitbtn")).click();

				        // Close the browser
				        driver.quit();
				    }
				

			}
