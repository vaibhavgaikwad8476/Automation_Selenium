package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.netty.channel.ChannelOption;

public class CalanderpopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notification");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.agoda.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"check-in-box\"]/div/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		
		
	}

}