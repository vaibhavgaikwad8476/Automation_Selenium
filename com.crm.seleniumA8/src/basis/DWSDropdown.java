package basis;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DWSDropdown extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String expected_title="Demo Web Shop";
				precondition("chrome");
				Thread.sleep(2000);
				String actual_title = driver.getTitle();
				if (expected_title.equals(actual_title)) {
				System.out.println("iam in dwa page");
				login();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[contains (text(), 'Digital downloadn'))")).click();
				Thread.sleep(2000);
				WebElement sort_by = driver.findElement(By.id("products-orderby"));
				Select sel = new Select (sort_by);
				List<WebElement> opt = sel.getOptions();
				int i=0;
				for (WebElement web: opt) {
				sort_by=driver.findElement(By.id("products-orderby"));
				sel = new Select (sort_by);
				sel.selectByIndex(i++);
				Thread.sleep(1500);
				}
				Thread.sleep(1500);
				logout();
				Thread.sleep(1500);
				postCondition();
				}
				else {
					System.out.println("I am Not in DWS Page");
				}

			}

			private static void logout() {
				// TODO Auto-generated method stub
				
			}

			private static void login() {
				// TODO Auto-generated method stub
				
			}

			private static void precondition(String string) {
				// TODO Auto-generated method stub
				
			}
		
		
		
	}


