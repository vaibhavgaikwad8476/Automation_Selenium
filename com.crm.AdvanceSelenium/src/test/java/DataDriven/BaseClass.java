package DataDriven;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BaseClass {

	    public static void main(String[] args) {
	       
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Define login credentials and URL
	        String URL = "https://demowebshop.tricentis.com/"; 
	        String username = "vaibhavgaikwad8476@gmail.com";     
	        String password = "Vaibhav@123"; 

	        WebDriver driver = new ChromeDriver();

	        try {
	        
	            driver.get("https://demowebshop.tricentis.com/");
	            
	      
	            WebElement loginButton = driver.findElement(By.linkText("Login"));
	            loginButton.click();

	            // Enter username and password
	            WebElement usernameField = driver.findElement(By.id("vaibhavgaikwad8476@gmail.com"));  
	            WebElement passwordField = driver.findElement(By.id("Vaibhav@123")); 
	            usernameField.sendKeys(username);
	            passwordField.sendKeys(password);

	          
	            passwordField.submit();
	            Thread.sleep(3000);  

	            if (driver.getPageSource().contains("Logout")) {
	                System.out.println("Login successful");
	            } else {
	                System.out.println("Login failed!");
	            }

	            
	            WebElement logoutButton = driver.findElement(By.linkText("Logout")); 1
	            logoutButton.click();
	            Thread.sleep(2000);  // Wait for logout to process

	            // Verify logout by checking the presence of the login button
	            if (driver.getPageSource().contains("Login")) {
	                System.out.println("Logout successful");
	            } else {
	                System.out.println("Logout failed!");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}


}
