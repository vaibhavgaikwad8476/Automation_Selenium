package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class OpenInNewTab extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("Chrome");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement books = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a"));
		Thread.sleep(2000);
		act.keyDown(Keys.SHIFT).click(books).perform();
	}

}
