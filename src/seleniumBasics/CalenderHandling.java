package seleniumBasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize();// maximize the window
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(
				By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String ExpMonthYear = "November 2023";
		String expDate = "3";
		boolean isnext = false;
		while (true) {
			String Actmonthyear = driver.findElement(By.className("ui-datepicker-title")).getText();
			if (ExpMonthYear.equals(Actmonthyear)) {
				driver.findElement(By.xpath("//a[contains(text(),'" + expDate + "')]")).click();
			} else if (isnext) {
				driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			} else {
				driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			}
			TakeScreenShotBySelenium.getScreen(driver, "jqqqq");	
		}
	}

}
