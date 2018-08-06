package mavendemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

  WebDriver driver=null;
  
  @Before
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\JAVASE8Workspace\\chromedriver_win32 (1)\\chromedriver.exe");
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

