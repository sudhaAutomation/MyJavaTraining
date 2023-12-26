package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCourse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize();// maximize the window
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("/html/body/div/section/div/div/aside/nav/ul[1]/li[3]/a/span")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[1]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText()+" Yes");
		alert.accept();
		
		String actMessage=driver.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]")).getText();
	if (actMessage.contains("delete")) {
		System.out.println("Course Deleted Successfully");
	} else {
		System.out.println("Course not Deleted Successfully");

	}
	driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[1]")).click();
	System.out.println(alert.getText()+" No");
	alert.dismiss();
	driver.close();
	}

}
