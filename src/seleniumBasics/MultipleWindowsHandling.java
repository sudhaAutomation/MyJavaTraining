package seleniumBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize();// maximize the window
		driver.get("https://www.keralartc.com/main.html");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'E-Ticketing')]")).click();// eticketing
		// driver.findElement(By.xpath("//a[contains(text(),'City
		// Circular')]")).click();// city circular
		driver.findElement(By.xpath("//a[contains(text(),'Notifications')]")).click();// eticketing

		System.out.println(driver.getWindowHandle());
		Set<String> windows = driver.getWindowHandles();
		// driver.switchTo().window(windows.toArray()[1].toString());
		Iterator<String> it = windows.iterator();
		System.out.println(it.hasNext());
		// System.out.println(it.next());

		System.out.println(it.hasNext());
		System.out.println(it.next());

		System.out.println(it.hasNext());
		String notifyId = it.next();
		System.out.println(notifyId);

		System.out.println(it.hasNext());
		driver.switchTo().window(notifyId);
		driver.findElement(By.xpath("//span[contains(text(),'Tenders')]")).click();
		// driver.quit();
	}

}
