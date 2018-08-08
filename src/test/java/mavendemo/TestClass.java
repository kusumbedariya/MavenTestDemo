package mavendemo;

import static org.junit.Assert.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestClass {


  public static final String USERNAME = "kusumbedariya";
  public static final String ACCESS_KEY = "bb1f0c41-cae7-435d-849f-7b9658979977";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
   WebDriver driver;
   
 @BeforeClass
  public static void setupClass() 
  {
		System.out.println("@BeforeClass - SetupClass()");
//	 	WebDriverManager.chromedriver().setup();
  }
    
  @Before
  public void setUp() {
	System.out.println("@Before - setUp()");
	 // System.setProperty("webdriver.chrome.driver", "C:\\JAVASE8Workspace\\chromedriver_win32 (1)\\chromedriver.exe");
	// ChromeDriverManager.getInstance().setup();
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	 caps.setCapability("platform", "Windows 10");
	    caps.setCapability("version", "latest");
	 
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	 System.out.println("driver is "+driver);
	//driver = new ChromeDriver();
  }

  @After
  public void tearDown() {
  	System.out.println("@After - tearDown()");
  	//System.out.println("Driver - tear down : "+driver);
    //driver.quit();
  }

  @Test
  public void testScript() {
 System.out.println("@Test - testScript");
//    HomePage homePage = new HomePage(driver);
// 	homePage.open();
//    assertTrue(homePage.isTitleCorrect());
  }
  


}

