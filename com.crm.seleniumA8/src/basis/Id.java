package basis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("small-searchterms")).sendKeys("clock");
		driver.close();
	}

}
