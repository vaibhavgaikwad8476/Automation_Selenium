package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Ahmednagar");
		Thread.sleep(2000);
		driver.findElement()By.xpath(null)
		
	}
	

}
