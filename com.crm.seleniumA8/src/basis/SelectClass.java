package basis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClass {

	public SelectClass(WebElement birth_day) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/vaibh/Downloads/demo%20(1).html");
		WebElement single_select = driver.findElement(By.id("stander"))
		

	}

}
