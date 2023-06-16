package demo.basic;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoopConDemo {
	WebDriver driver;
	String path;
	
	@Test
	public void loodDemo() {
		
		path = System.getProperty("user.dir");
		
		
		
		System.setProperty("webdriver.chrome.driver", path + "/jar/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://portal.bsnl.in/myportal/");
		
		List<WebElement> listEle = driver.findElements(By.tagName("a"));
		
		for (WebElement webElement : listEle) {
			
			System.out.println(webElement.getText());
			
		}
		
		driver.close();
		
	}

}
