package basis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {

		String expected_Title="Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		String actual_Title = driver.getTitle();
		if(expected_Title.equals(actual_Title)) {
			System.out.println("I am dws page...");
			driver.findElement(By.className("ico-register")).click();	
		}
		else {
			System.out.println("I am not in dws page...");
		}
		Thread.sleep(3000);
		driver.close();
		
	}

}