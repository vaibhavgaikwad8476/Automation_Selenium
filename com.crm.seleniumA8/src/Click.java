import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 WebElement Books = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		 act.click(Books).perform();
	}

}
