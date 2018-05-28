package come.GooglePOs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class initializeBrowser {
	public static WebDriver driver;

	public static Properties properties;

	// constructor of the class
	public initializeBrowser() {

		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Farhad Ahmadzai\\Documents\\QA Engineering\\eclipse\\Workspace\\com.Google\\src\\main\\java\\properties\\file.properties");
			properties.load(fis);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void initialize() {
		String browser=properties.getProperty("browser");

	if(browser.equalsIgnoreCase("ie")){
		System.setProperty("webdriver.ie.driver",
	"C:\\Users\\Farhad Ahmadzai\\Documents\\QA Engineering\\Drivers\\MicrosoftWebDriver.exe");
		driver = new InternetExplorerDriver();
		
	}else if(browser.equalsIgnoreCase("chrome"))
			{

		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\Farhad Ahmadzai\\Documents\\QA Engineering\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	}

	public static void navigateToSite() throws InterruptedException {
//		driver.navigate().to("https://www.google.com");
		driver.navigate().to(properties.getProperty("url"));
		// driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'gbw\']/div/div/div[2]/div[4]/div/div/div[2]/div/a[1]")).click();

	}
}
