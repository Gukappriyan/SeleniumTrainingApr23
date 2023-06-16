package demo.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameters {
	
	WebDriver driver;
	String path;
	
	
	@Parameters({ "username_P", "password_P", "url" })
	@Test
	public void login(String username_P, String password_P, String url) {

		path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/jar/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(url);

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(username_P);

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password_P);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.close();
	}

}
