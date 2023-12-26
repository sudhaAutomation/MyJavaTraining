package testNGp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo {
	@Test
	public void testCase1() {
		System.out.println("5.Test case 1 executed");
	}
	@Test
	public void testCase3() {
		System.out.println(".Test case 3 executed");
	}
	@Test
	public void testCase2() {
		System.out.println("7.Test case 2 executed");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("4.Before method executed");
		System.out.println("write the pre condition of the test case");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("6.After Method executed");
		System.out.println("write the post condition of the test case");
		System.out.println();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("3.Before Class executed");
		System.out.println();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("7.After Class executed");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("2.Before Test executed");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("8.After Test executed");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("1.Before suite executed");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(".After Suite executed");
	}

}
