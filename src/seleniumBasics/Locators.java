package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// 8 locators
		/*
		 * className -id -cssSelector -xpath -tagName -name -linkText -partialLinkText
		 */
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("flipkart login");
		// driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		// driver.findElement(By.cssSelector("body > div.L3eUgb >
		// div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf >
		// div.FPdoLc.lJ9FBc > center > input.gNO89b")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Imag")).click();
		
	}

}
