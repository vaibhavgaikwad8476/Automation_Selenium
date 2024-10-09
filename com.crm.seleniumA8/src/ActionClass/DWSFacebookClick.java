package ActionClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class DWSFacebookClick extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("Chrome");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		Set<String> childs = driver.getWindowHandles();
		for (String str : childs) {
			driver.switchTo().window(str);
			
		}
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//*[@id=\":r2:\"]"));
		email.sendKeys("vaibhavgaikwad123@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
	}

}
