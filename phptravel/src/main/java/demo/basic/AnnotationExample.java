package demo.basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationExample {
	
	static WebDriver driver;
	public static final int SLEEP_TIME = 2000;

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("Before Suite - Clear Data");
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("After Suite - Send Email");
	}

	@BeforeClass
	public void beforeClassSetup() {
		System.out.println("-----Before Class----");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/jar/chromedriver.exe");

		driver = new ChromeDriver(); // new WebDriver

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.phptravels.net/admin");
	}

	@AfterClass
	public void afterClassClose() {
		System.out.println("After Class");
		driver.close();
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("After Method");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("After Test");
	}

	@Test
	public void toVerifyValidLogin() throws Exception {

		System.out.println("Login Method");
		// Login

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("demoadmin");

	//	driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(SLEEP_TIME);

		System.out.println("Loggedin");
	}
	
	@Test
	public void toVerifyErrorMsgWhenEmpty() throws Exception {

		System.out.println("to Verify Error Msg When Empty");
		// Login

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("");

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(SLEEP_TIME);

		System.out.println("Loggedin");
	}
	
	@Test
	public void toVerifyErrorMsgWhenInvalid() throws Exception {

		System.out.println("to Verify Error Msg When Invalid");
		// Login

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("asdfsafasfas@adfasf.com");

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("asfdasfdsaf");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(SLEEP_TIME);

		System.out.println("Loggedin");
	}

}
