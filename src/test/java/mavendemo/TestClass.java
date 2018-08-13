package mavendemo;

import static org.junit.Assert.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.*;
import java.net.URL;

public class TestClass {


  public static final String USERNAME = "kusumbedariya";
  public static final String ACCESS_KEY = "bb1f0c41-cae7-435d-849f-7b9658979977";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
 //RemoteWebDriver driver;
 WebDriver driver;
   
 @BeforeClass
  public static void setupClass() throws Exception 
  {
		System.out.println("@BeforeClass - SetupClass()");
//	 	WebDriverManager.chromedriver().setup();
  }
    
  @Before
  public void setUp() throws Exception {
	System.out.println("@Before - setUp()");
	 // System.setProperty("webdriver.chrome.driver", "C:\\JAVASE8Workspace\\chromedriver_win32 (1)\\chromedriver.exe");
	// ChromeDriverManager.getInstance().setup();
	 DesiredCapabilities caps = DesiredCapabilities.chrome(); 
//	 ChromeOptions options = new ChromeOptions();
//	 options.addArguments("--lang=en");
//	 caps.setCapability(ChromeOptions.CAPABILITY, options);
	caps.setPlatform(Platform.LINUX);
//	caps.setVersion("65");
//	  caps.setCapability("platform", "WINDOWS");
	  caps.setCapability("version", "latest");
//	 caps.setCapability("extendedDebugging", "true");
//	 WebDriver driver = new ChromeDriver(options)

// 	 driver = new RemoteWebDriver(new URL(URL), caps);
// 	 driver = new RemoteWebDriver(caps);	 
	 driver = new ChromeDriver(caps);
	 System.out.println("driver is "+driver);
	 driver.get(new URL(URL));
	 System.out.println("title of page is: " + driver.getTitle());
  }

  @After
  public void tearDown() throws Exception {
  	System.out.println("@After - tearDown()");
  	//System.out.println("Driver - tear down : "+driver);
 	driver.quit();
  }

  @Test
  public void testScript() throws Exception {
 System.out.println("@Test - testScript");
//    HomePage homePage = new HomePage(driver);
// 	homePage.open();
  String test="Kusum";
  assertEquals("Kusum", test);

  }
  


}

