package demo.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;
	String path;

	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {

		return new Object[][] { 
									{ "testuser_1", "Test@123" },
									{ "admin@phptravels.com", "demoadmin" },
									{ "testuser_3", "Test@1234" },
									
			};

	}

	@Test(dataProvider = "Authentication")
	public void login(String username_P, String password_P) throws Exception {

		path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/jar/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://phptravels.net/admin");

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(username_P);

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password_P);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Dashboard");

	}

	@AfterClass
	public void closeBrowser() {
		
		driver.close();
	}
}
