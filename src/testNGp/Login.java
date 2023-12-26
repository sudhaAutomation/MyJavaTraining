package testNGp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Login {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();// launch the browser

		driver.manage().window().maximize();// maximize the window
		driver.get("https://www.swhizz.com/register-now");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void register() {
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/form/div[1]/div[1]/input"))
				.sendKeys("Raju");
		driver.findElement(By.xpath("//input[@id='ind_email']")).sendKeys("raju@gmail.com");
		boolean button = driver.findElement(By.xpath("//button[@id='submit-enquiry']")).isEnabled();
		System.out.println(button);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.ignoring(ElementClickInterceptedException.class).until(
				ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='submit-enquiry']"))))
				.click();

		// driver.findElement(By.xpath("//button[@id='submit-enquiry']")).click();

	}

	@AfterMethod
	public void tearDown() {
		 driver.close();
	}

}
