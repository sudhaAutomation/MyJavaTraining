package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.get("https://jqueryui.com/menu/");// launch the url
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(
				By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
		// driver.findElement(By.id("ui-id-4")).click();
		// driver.findElement(By.xpath("/html/body/ul/li[4]/div")).click();
		driver.findElement(By.xpath("//div[@id='ui-id-4']")).click();

	}

}
