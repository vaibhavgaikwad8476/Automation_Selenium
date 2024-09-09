package basis;

import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		String actual_Title = driver.getTitle();
		
	}

}
