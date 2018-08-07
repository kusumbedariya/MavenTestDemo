package mavendemo;

import static org.junit.Assert.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

  WebDriver driver=null;
 
// @BeforeClass
//  public static void setupClass() {
//
//  }
    
  @Before
  public void setUp() {
  	        WebDriverManager.chromedriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "C:\\JAVASE8Workspace\\chromedriver_win32 (1)\\chromedriver.exe");
//	  ChromeDriverManager.getInstance().setup();
	  driver = new ChromeDriver();
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void testScript() {
    HomePage homePage = new HomePage(driver);
    homePage.open();
    assertTrue(homePage.isTitleCorrect());
  }
  


}

