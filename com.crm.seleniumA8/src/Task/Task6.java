package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class Task6 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("Chrome");
		Thread.sleep(2000);
		login();
		driver.findElement(By.id("username"));
		driver.findElement(By.id("password"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		
		
		
	}

}
