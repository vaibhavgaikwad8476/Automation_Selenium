package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class SimpleAlertPopUp extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("Chrome");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.search-box > form > input.button-1.search-box-button")).click();
		Alert alt= driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
	}

}
