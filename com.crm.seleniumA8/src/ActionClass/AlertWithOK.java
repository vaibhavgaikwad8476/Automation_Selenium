package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertWithOK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(2000);
		Alert alt= driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		
	}

}
