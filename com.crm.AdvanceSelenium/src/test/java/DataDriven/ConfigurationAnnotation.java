package DataDriven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	@BeforeSuite
	public void beforeSuit1() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test
	public void test() {
		System.out.println("test");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass1() {
		System.out.println("After Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
}
