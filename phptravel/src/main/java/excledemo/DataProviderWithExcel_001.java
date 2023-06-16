package excledemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

import excledemo.ExcelUtils;

public class DataProviderWithExcel_001 {

	WebDriver driver;

	@BeforeMethod

	public void beforeMethod() throws Exception {

		System.out.println("-----Before Class----");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/jar/chromedriver.exe");

		driver = new ChromeDriver(); // new WebDriver

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.phptravels.net/admin");

	}

	@Test(dataProvider = "Authentication")

	public void Registration_data(String sUserName, String sPassword) throws Exception {

		System.out.println(sUserName);

		System.out.println("Login Method");
		// Login

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(sUserName);

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(sPassword);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Thread.sleep(SLEEP_TIME);

		System.out.println("Loggedin");

		try {
			System.out.println("Logged method");

			// Logout

			driver.findElement(By.xpath("//a[@class='btn btn-danger btn-sm btn-block']")).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(Thread.currentThread().getStackTrace());
		}

	}

	@DataProvider

	public Object[][] Authentication() throws Exception {

		Object[][] testObjArray = ExcelUtils
				.getTableArray("E:\\eclipse-workspace\\phptravel\\TestData.xlsx", "Sheet1");

		return (testObjArray);

	}

	@AfterMethod

	public void afterMethod() {

		driver.close();

	}

}