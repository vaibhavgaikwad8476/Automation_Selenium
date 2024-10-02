package basis;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement()
		driver.close();
	}

}
