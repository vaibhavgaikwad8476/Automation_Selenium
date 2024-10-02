package basis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DWSHomePage {

	public static void main(String[] args) throws InterruptedException {
		String expected_title = "Demo Web Shop";
		// open  the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window 
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(3000);
		//enter into facebook page
		driver.get("https://demowebshop.tricentis.com/");
		//verifying the page
		String actual_title = driver.getTitle();
		Thread.sleep(3000);
		if(expected_title.equals(actual_title))
		{
			   System.out.println("I am in dws page");
			   driver.findElement(By.partialLinkText("Digital downloads")).click();
			    WebElement multi_select = driver.findElement(By.id("products-orderby"));
		        Select sel = new Select(multi_select);
		        Thread.sleep(2000);
		        List<WebElement> option = sel.getOptions();
		        int i=1;
		        for (WebElement web : option)
		        {
					sel.selectByIndex(i++);
					Thread.sleep(2000);
				}
	    }
		else {
			System.out.println(" i am not in dws page");
		}
}
}


