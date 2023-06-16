package demo.basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNGParameterDemo {

	static WebDriver driver;
	public static final int SLEEP_TIME = 2000;

	@BeforeClass
	public void setUp() {
		System.out.println("-----Before Class----");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/jar/chromedriver.exe");

		driver = new ChromeDriver(); // new WebDriver

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Parameters({ "username_P", "password_P", "url_P" })
	@Test(priority = 0)
	public void loginTest(String userName, String pass, String url) throws Exception {

		System.out.println("Login Method");
		// Login
		driver.get(url);

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(userName);

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pass);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(SLEEP_TIME);
		
		
		Assert.assertEquals(driver.getTitle(), "Dashboard");

		// Assert.assertNotEquals(actual, expected);

		// Assert.assertTrue(condition);

		// Assert.assertFalse(condition);

		System.out.println("Loggedin");
	}

	@Test(priority = 1)
	public void logOutTest() {

		System.out.println("Logged method");

		// Logout

		driver.findElement(By.xpath("//a[@class='btn btn-danger btn-sm btn-block']")).click();
	}

	@AfterClass
	public void closeBrowser() {

		driver.close();
	}

}
