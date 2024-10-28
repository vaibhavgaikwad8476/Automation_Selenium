package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityClass.BaseClass;

public class Task3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		preCondition("chrome");
		String actual_url=driver.getCurrentUrl();
		
		if(actual_url.equals(actual_url)) 
		{
			System.out.println("I am in DWS Page");
			login();
			driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
			
			
			 List<WebElement> products = driver.findElements(By.className("product-item"));
		        double highestPrice = 0.0;
		        WebElement highestPricedProduct = null;

		        for (WebElement product : products) {
		            WebElement priceElement = product.findElement(By.className("price actual-price"));
		            double price = Double.parseDouble(priceElement.getText().replace("$", ""));
		            if (price > highestPrice) {
		                highestPrice = price;
		                highestPricedProduct = product;
		            }
		            product.findElement(By.className("button-2 product-box-add-to-cart-button")).click();
		        }
		        
		        if (highestPricedProduct != null) {
//		        	driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		            highestPricedProduct.findElement(By.className("remove-button")).click();
		        }
			Thread.sleep(2000);
			logout1();
			
		}
		else 
		{
			System.out.println("I am not in DWS Page");
		}
		
		postCondition();
		
		
		
		

		
				
		
		

	}

}





