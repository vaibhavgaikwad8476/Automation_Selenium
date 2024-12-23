package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("box6"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Italy']"));
		Thread.sleep(2000);
		act.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
		
		WebElement source1 = driver.findElement(By.id("box7"));
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Spain']"));
		Thread.sleep(2000);
		act.dragAndDrop(source1, target1).perform();
		Thread.sleep(2000);
		
		
		WebElement source2 = driver.findElement(By.id("box1"));
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Norway']"));
		Thread.sleep(2000);
		act.dragAndDrop(source2, target2).perform();
		Thread.sleep(2000);
		
		WebElement source3 = driver.findElement(By.id("box4"));
		WebElement target3 = driver.findElement(By.xpath("//div[text()='Denmark']"));
		Thread.sleep(2000);
		act.dragAndDrop(source3, target3).perform();
		Thread.sleep(2000);
		
		WebElement source4 = driver.findElement(By.id("box5"));
		WebElement target4 = driver.findElement(By.xpath("//div[text()='South Korea']"));
		Thread.sleep(2000);
		act.dragAndDrop(source4, target4).perform();
		Thread.sleep(2000);
		
		WebElement source5 = driver.findElement(By.id("box2"));
		WebElement target5 = driver.findElement(By.xpath("//div[text()='Sweden']"));
		Thread.sleep(2000);
		act.dragAndDrop(source5, target5).perform();
		Thread.sleep(2000);
		
		WebElement source6 = driver.findElement(By.id("box3"));
		WebElement target6 = driver.findElement(By.xpath("//div[text()='United States']"));
		Thread.sleep(2000);
		act.dragAndDrop(source6, target6).perform();
		Thread.sleep(2000);
		
	}
	

}
