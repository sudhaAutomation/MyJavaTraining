package seleniumBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize();// maximize the window
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<String> urls = new ArrayList<>(
				Arrays.asList("https://www.swhizz.com", "https://www.facebook.com", "https://www.amazon.com"));
		List<String> handlers = new ArrayList<>();
		for (String ul : urls) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.open('" + ul + "')");
			//handlers.add(driver.getWindowHandle());
		}

		driver.switchTo().window(handlers.get(3));
		System.out.println(handlers);
	}

}
