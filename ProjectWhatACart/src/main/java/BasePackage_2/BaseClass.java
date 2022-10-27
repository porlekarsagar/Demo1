	package BasePackage_2;
	
	import java.io.FileInputStream;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;
	
	import org.apache.log4j.Logger;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	
	import webPages_4.WishList_1;
	
	public class BaseClass {

	FileInputStream fis = null;
	public static WebDriver driver;
	
	public static ExtentReports report = null;
	public static ExtentTest test = null;
	public static ExtentSparkReporter spark = null;
	public static Logger log = Logger.getLogger("TestBase.class");
	
	// 1. method to read config.properties file
	public String readProperties(String key) {
		Properties pro = new Properties ();
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\resources\\config.properties");
			pro.load(fis);
				}
		catch(Exception e){
			
			e.printStackTrace();
		}
		return pro.getProperty(key);
		
	}
	
	// 2. to open website by URL and to set waits
	public void launchApplication() {
		
		driver.get(readProperties("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
	// 3. Browser and driver Initialization method
	// Also used to initialize the driver in the Test classes
	// driver = initialization()
	
	public WebDriver initialization() {
		
		log.info("Browser Initialization started");
		if (readProperties("browser").contains("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			launchApplication();
			return driver;
			}
		
		else {
			
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
			launchApplication();
			return driver;
			}
	}
	
	// method to initialize wishList object in WishListTest_1 class
	
	public WishList_1 loadWishListPage_1(){
		
		WishList_1 wl = new WishList_1(driver);
		return wl;
		
	}
	
	public void reportInit() {
		
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/target/ExtentReport.html");
		// ExtentSparkReporter - To provide path to ExtentReport to save
		report.attachReporter(spark);
		
	}
	
}
