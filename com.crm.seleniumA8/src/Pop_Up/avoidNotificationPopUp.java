package Pop_Up;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class avoidNotificationPopUp {
	public static void main(String[] args) throws InterruptedException {
		
				// TODO Auto-generated method stub
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-notifications");
				ChromeDriver driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.get("https://www.easemytrip.com/");
				Thread.sleep(2000);
			}
	

	}


