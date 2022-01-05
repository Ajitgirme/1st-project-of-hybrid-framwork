import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.orangehrm.hybridframe_2021.utility.ConfigDataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver = null;
	public static ConfigDataProvider configDataProvider = null;
	
	
	@BeforeSuite
	public void init() {
		
	 configDataProvider = new ConfigDataProvider();
	}
	
	@BeforeTest
	@Parameters({"Browser"})
	public void setUP(@Optional("Chrome")String browser)  {
		
		if(browser.equals("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("IE")) {
			//System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		else {
			System.out.println("Browser does not match with expected browser launch");
			}
		
		driver.manage().window().maximize();
		driver.get(configDataProvider.getUrl());
		
		}
		@AfterTest
		public void tearDown() {
		driver.quit();
		
	}
	
}
