package testNGp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
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

	@Test(dataProvider = "testData")
	public void loginTestCaseInvalid3(String userId, String password, String results) {
		driver.findElement(By.name("uid")).sendKeys(userId);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		if (results.equals("Welcome")) {
			String successMessage = driver
					.findElement(By.xpath("//marquee[contains(text(),\"Welcome To Manager's Page of Guru99 Bank\")]"))
					.getText();
			Assert.assertTrue(successMessage.contains("Welcome"), "System login failed");

		} else {
			Alert alert = driver.switchTo().alert();
			String alertmessage = alert.getText();
			alert.accept();
			Assert.assertTrue(alertmessage.contains("not valid"), "System is logged in with invalid credentials");
		}
	}

	public Object[][] readData() throws IOException {
		XLUtility reader = new XLUtility(".\\excelsheets\\SwhizzPortlTestcases.xlsx");
		int rows = reader.getRowCount("gurusheet");
		int cols = reader.getCellCount("gurusheet", 1);
		Object[][] data = new Object[rows - 2][cols];
		for (int i = 2; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				data[i-2][j]=reader.getCellData("gurusheet", i, j);
			}

		}
		return data;

	}

	@DataProvider
	public Object[][] testData() throws IOException {
		return readData();
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		// Thread.sleep(1000);
		driver.close();
	}

}
