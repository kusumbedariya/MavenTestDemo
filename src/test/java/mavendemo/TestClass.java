package mavendemo;

import static org.junit.Assert.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

  WebDriver driver;
 
 @BeforeClass
  public static void setupClass() 
  {
		System.out.println("@BeforeClass - SetupClass()");
	 	  WebDriverManager.chromedriver().setup();
  }
    
  @Before
  public void setUp() {
	System.out.println("@Before - setUp()");
	 // System.setProperty("webdriver.chrome.driver", "C:\\JAVASE8Workspace\\chromedriver_win32 (1)\\chromedriver.exe");
// ChromeDriverManager.getInstance().setup();
	 driver = new ChromeDriver();
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

