package demo.basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class TestNGDemo {

	static WebDriver driver;
	public static final int SLEEP_TIME = 2000;

	@BeforeTest
	public void setUp() {
		System.out.println("-----Before Class----");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/jar/chromedriver.exe");

		driver = new ChromeDriver(); // new WebDriver

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.phptravels.net/admin");
	}

	//@Test(priority = 0)
	@Test
	public void loginTest() throws Exception {

		System.out.println("Login Method");
		// Login

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("demoadmin");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Thread.sleep(SLEEP_TIME);

		System.out.println("Loggedin");
	}

	//@Test(priority = 1)
	@Test
	public void loginTestGetTitle() {

		String title = driver.getTitle();
		System.out.println(title);
		// Assert.assertEquals(title, "Dashboard");

	}

	//@Test(priority = 6)
	@Test
	public void logOutTest() {

		try {
			System.out.println("Logged method");

			// Logout

			driver.findElement(By.xpath("//a[@class='btn btn-danger btn-sm btn-block']")).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(Thread.currentThread().getStackTrace());
		}
	}

	@Test(groups = { "customer" })
	public void createCustomer() {

		System.out.println("Customer Created");

	}

	@Test(groups = { "customer" })
	public void editCustomer() {

		System.out.println("Edit Customer");
	}

	@Test(groups = { "customer" })
	public void deleteCustomer() {

		System.out.println("Delete Customer");
	}

	@AfterTest
	public void closeBrowser() {

		driver.close();
	}

}
