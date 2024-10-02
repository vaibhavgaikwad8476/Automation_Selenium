package basis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				String expected_title="Demo Web Shop";
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				String actual_title=driver.getTitle();
				
				driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
				
				if(expected_title.equals(actual_title))
				{
					System.out.println("I am in DWS Page");
					
					WebElement sort = driver.findElement(By.id("products-orderby"));
					
					Select sel=new Select(sort);
					List<WebElement> opt = sel.getOptions();
					int i=0;
					
					for(WebElement web : opt)
					{
						sort=driver.findElement(By.id("products-orderby"));
						sel=new Select(sort);
						sel.selectByIndex(i++);
						
						System.out.println("HashCode of "+(sel.hashCode()));
						System.out.println("It is "+(sel.equals(opt)));
						Thread.sleep(2000);
						
						sort=driver.findElement(By.id("products-orderby"));
						sel=new Select(sort);
						WebElement wrap = sel.getWrappedElement();
						System.out.println("Wrapped Element : "+wrap);
						
						sort=driver.findElement(By.id("products-orderby"));
						sel=new Select(sort);
						WebElement first = sel.getFirstSelectedOption();
						System.out.println("First element is : " +first);
						System.out.println("----------------------------");

					}	
					
				}
			}

		

	}


