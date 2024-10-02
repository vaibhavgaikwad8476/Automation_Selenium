package basis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropDownMenu {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/vaibh/Downloads/demo%20(1).html");
		WebElement multi_Select = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multi_Select);
		sel.selectByVisibleText("Jaguar");
		Thread.sleep(2000);
		sel.selectByValue("bmw");
		Thread.sleep(2000);
		sel.selectByValue("vol");
		
	}

}
