package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act = new Actions(driver);
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		Thread.sleep(2000);
		act.clickAndHold(rome).perform();
		WebElement italy = driver.findElement(By.id("box106"));
		Thread.sleep(2000);
		act.release(italy).perform();

	}

}
