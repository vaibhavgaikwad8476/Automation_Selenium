package basis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		String expected_url = "https://www.myntra.com/";
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		String actual_url = driver.getCurrentUrl();
		if(expected_url.equals(actual_url)) {
			System.out.println("Ready to do seen kiara");
			Actions act = new Actions (driver);
			WebElement kids = driver.findElement(By.xpath("//a[text()='kids']"));
					Thread.sleep(2000);
					act.moveToElement(kids).perform();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//a[text()='Ethnic Ware'])[2]")).click();
		}
		else {
			System.out.println("not ready kiara .....");
		}
		
	}

}
