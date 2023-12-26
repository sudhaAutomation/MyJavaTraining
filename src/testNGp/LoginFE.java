package testNGp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFE {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize();// maximize the window
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(groups="Valid Login",invocationCount=1)
	public void loginTestCaseValid() {
		driver.findElement(By.name("uid")).sendKeys("mngr543366");
		driver.findElement(By.name("password")).sendKeys("tYbEnUj");
		driver.findElement(By.name("btnLogin")).click();
		String successMessage = driver
				.findElement(By.xpath("//marquee[contains(text(),\"Welcome To Manager's Page of Guru99 Bank\")]"))
				.getText();
		Assert.assertTrue(successMessage.contains("Welcome"), "System login failed");

	}

	@Test(priority=2,groups="Invalid Login")
	public void loginTestCaseInvalid1() {
		driver.findElement(By.name("uid")).sendKeys("manager");
		driver.findElement(By.name("password")).sendKeys("tYbEnUj");
		driver.findElement(By.name("btnLogin")).click();
		Alert alert = driver.switchTo().alert();
		String alertmessage = alert.getText();
		System.out.println(alertmessage);
		alert.accept();
		Assert.assertTrue(alertmessage.contains("not valid"), "System is logged in with invalid credentials");

	}

	@Test(priority=3,dependsOnMethods="loginTestCaseInvalid1",groups="Invalid Login")
	public void loginTestCaseInvalid2() {
		driver.findElement(By.name("uid")).sendKeys("manager");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("btnLogin")).click();
		Alert alert = driver.switchTo().alert();
		String alertmessage = alert.getText();
		alert.accept();
		Assert.assertTrue(alertmessage.contains("not valid"), "System is logged in with invalid credentials");

	}

	@Test(priority=4,dependsOnMethods="loginTestCaseInvalid1",groups="Invalid Login")
	public void loginTestCaseInvalid3()  {
		driver.findElement(By.name("uid")).sendKeys("mngr543366");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("btnLogin")).click();
		Alert alert = driver.switchTo().alert();
		String alertmessage = alert.getText();
		alert.accept();
		Assert.assertTrue(alertmessage.contains("not valid"), "System is logged in with invalid credentials");
		
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		//Thread.sleep(1000);
		driver.close();
	}

}
