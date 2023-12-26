package seleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotBySelenium {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize();// maximize the window
		driver.get("https://jqueryui.com/datepicker/");
		getScreen(driver,"jquery");
		driver.close();
	}

	public static void getScreen(WebDriver driver,String fileName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File("C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\MyJavaTraining\\ScreenShots\\"+fileName+".png"));

	}
}
