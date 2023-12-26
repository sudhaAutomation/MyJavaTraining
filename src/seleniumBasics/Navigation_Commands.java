package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize();// maximize the window
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);//dynamic waits
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("/html/body/div/section/div/div/aside/nav/ul[1]/li[3]/a/span")).click();
		//driver.close();
		driver.navigate().back();
		Thread.sleep(2000);//static wait..this will cease the code ,the time what we mention
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//driver.navigate().to("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
	}

}
