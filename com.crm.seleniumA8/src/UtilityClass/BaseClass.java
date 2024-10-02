package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	
			
				public static WebDriver driver ;
					
					public static void preCondition(String browser) throws InterruptedException {
						
						if(browser.equalsIgnoreCase("chrome")) {
							
							driver = new ChromeDriver();
						}
						else if(browser.equalsIgnoreCase("edege")) {
							driver = new EdgeDriver();
							 
						}
						
						else if(browser.equalsIgnoreCase("Firefox")) {
							driver = new FirefoxDriver();
							 
						}
						else  {
							driver = new ChromeDriver();
							 
						}
						driver.manage().window().maximize();
						Thread.sleep(3000);
						driver.get("https://demowebshop.tricentis.com/");
						
					}
					public static void login() throws InterruptedException {
						driver.findElement(By.xpath("//a[@class='ico-login']")).click();
						Thread.sleep(3000);
						driver.findElement(By.id("Email")).sendKeys("pratik110@gmail.com");
						Thread.sleep(3000);
						driver.findElement(By.id("Password")).sendKeys("Pratik@2805");
						Thread.sleep(3000);
						driver.findElement(By.id("RememberMe")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@value='Log in']")).click();
						Thread.sleep(3000);
						
					}
					public static void logout1() {
						driver.findElement(By.xpath("//a[text()='Log out']")).click();
						
					}
					
					public static  void postCondition() {
						driver.close();
						
					}

					public static  void postCondition2() {
						driver.quit();
						
					}


				}




