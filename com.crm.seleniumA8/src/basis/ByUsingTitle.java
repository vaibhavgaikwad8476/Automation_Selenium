package basis;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ByUsingTitle {
	
	// open the browser
	public static void main(String[] args) throws InterruptedException {
		String excepected_result="Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//watching condition
		Thread.sleep(3000);
		//enter into dws webpage
		driver.get("https://demowebshop.tricentis.com/");
	
		String actual_result=driver.getTitle();
		if(excepected_result.equals(actual_result)) {
			System.out.println("i am in dws page...");
		}
		else {
			System.out.println("i am not in dws page..........");
		}
		Thread.sleep(3000);
		//close the browser
		driver.close();
		

	}

}
