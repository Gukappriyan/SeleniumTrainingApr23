package demo.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowser {
	WebDriver driver;
	String path;

	@Parameters({ "browser" })
	@BeforeClass
	public void browserSetup(String browser) {
		path = System.getProperty("user.dir");

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", path + "/jar/chromedriver.exe");
			driver = new ChromeDriver();
		} else {

			System.setProperty("webdriver.gecko.driver", path + "/jar/geckodriver-32.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://phptravels.net/admin");
	}

	@Test
	public void login() {

		try {
			driver.findElement(By.name("email"));
		}catch (Exception e) {
			System.out.println("No element");
		}
//		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
//
//		driver.findElement(By.name("password")).clear();
//		driver.findElement(By.name("password")).sendKeys("demoadmin");
//
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
	}
	
	@AfterClass
	public void closeTest() {
		
		driver.close();
	}

}
