package demo.basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	@Test
	public void f() {

		System.out.println("This Test @Test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This Test @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This Test @AfterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This Test @BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This Test @AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This Test @BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This Test @AfterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This Test @BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This Test @AfterSuite");
	}

}
