package demo.basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoopDemo {

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

		driver.get("https://portal.bsnl.in/myportal/");
	}

	@Test(priority = 0)
	public void loginTest() throws Exception {

		System.out.println("Login Method");
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		int i = 0;

		// extract the link texts of each link element
		for (WebElement e : linkElements) {
			// linkTexts[i] = e.getText();
			System.out.println(e.getText());
			i++;
		}
	}

	@AfterClass
	public void closeBrowser() {

		driver.close();
	}

}
