import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DD {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch the browser
		driver.get("http://integratedtoolingsystems.in/1swishzz_staging/admin");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.get("https://www.facebook.com/");
	}

	public static void openNewWindow(WebDriver driver) {
		
	}
}
