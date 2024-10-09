package ActionClass;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import UtilityClass.BaseClass;

public class ReadHandle extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		preCondition("Chrome");
		Thread.sleep(2000);
		Set<String> dws = driver.getWindowHandles();
		System.out.println(dws);
		
	}

}
