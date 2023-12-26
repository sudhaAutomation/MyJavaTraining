package testNGp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameters {
	WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser", "url", "userId", "password" })
	public void setUp(String browser, String url, String userId, String password) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
			driver = new ChromeDriver();// launch the browser
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\msedgedriver.exe");
			driver = new EdgeDriver();// launch the browser
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();// launch the browser
		}
		driver.manage().window().maximize();// maximize the window
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("uid")).sendKeys(userId);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();

	}

	@Test
	public void addCustomer() {
		driver.findElement(By.linkText("New Customer")).click();
		String actHeading = driver.findElement(By.xpath("//p[contains(text(),'Add New Customer')]")).getText();
		System.out.println("page heading is " + actHeading);
		Assert.assertTrue(actHeading.contains("Add New Customer"), "add new custoimer page validation failed");
	}

	@Test
	public void deleteCustomer() {
		driver.findElement(By.linkText("Delete Customer")).click();
		String actheading = driver.findElement(By.xpath("//p[contains(text(),'Delete Customer Form')]")).getText();
		System.out.println("page heading is " + actheading);
		Assert.assertTrue(actheading.contains("Delete Customer"), "Delete Customer page validation is failed");
	}
	@Test
	public void editCustomer() {
		driver.findElement(By.linkText("Edit Customer")).click();
		String actheading = driver.findElement(By.xpath("//p[contains(text(),'Edit Customer Form')]")).getText();
		System.out.println("page heading is " + actheading);
		Assert.assertTrue(actheading.contains("Edit Customer"), "Edit Customer page validation is failed");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
