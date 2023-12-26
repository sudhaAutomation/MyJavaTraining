package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CoursesList {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize();// maximize the window
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		/*
		 * 2 types of xpath we do have 1.absolute xpath..starts with '/' 2.relative
		 * xpath/customised xpath '//'
		 */
		driver.findElement(By.xpath("/html/body/div/section/div/div/aside/nav/ul[1]/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"right-panel\"]/header/div/div/div/a")).click();
		new Select(driver.findElement(By.xpath("//select[@name='category_id']"))).selectByVisibleText("MuleSoft");
		// category dropdown
		driver.findElement(By.id("first-name")).sendKeys("MuelSoft");
		Thread.sleep(2000);
		driver.findElement(By.name("course_slug")).sendKeys("www.mulesoft.com");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='TypeHere11_ifr']")));
		//driver.switchTo().frame(0);
		driver.findElement(By.id("tinymce")).sendKeys("This is the Mulesoft Course content description");
		System.out.println(driver.findElement(By.id("tinymce")).getText());
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		String actMessage = driver.findElement(By.xpath("/html/body/div/section/div/div/section/div/div/div[1]"))
				.getText();
		if (actMessage.contains("success")) {
			System.out.println("course added successfuly and message printed as " + actMessage);
		} else {
			System.out.println("Course not created");
		}
		driver.close();
	}

}
