package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrpitUtilitYSyntaxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize();// maximize the window
		// driver.get("https://jqueryui.com/datepicker/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://jqueryui.com/datepicker/'");
		// js.executeScript("alert('url launched successfully')");
		driver.switchTo().frame(driver.findElement(
				By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
		js.executeScript("arguments[0].style.border='solid 3px red'",
				driver.findElement(By.xpath("//input[@id='datepicker']")));
		driver.switchTo().parentFrame();

		js.executeScript("arguments[0].scrollIntoView()",
				driver.findElement(By.xpath("//a[contains(text(),'Add Class')]")));
		//js.executeScript("arguments[0].scrollTo(0,document.body.scrollHeight)");
	
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//js.executeScript("arguments[0].scrollTo(0,200)");

	}

}
