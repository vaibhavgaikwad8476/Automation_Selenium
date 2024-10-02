package ActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class OnlyKeyboardAction extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("Chrome");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.
		
		keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.sendKeys("mobile")
		.keyDown(Keys.ENTER).perform();

	}

}
