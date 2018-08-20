package mavendemo;

import static org.junit.Assert.assertEquals;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SampleSauceTest {
	WebDriver driver;

	 public static final String USERNAME = "kusum2560";
	  public static final String ACCESS_KEY = "85204798-74de-474a-840c-b79174e5499e";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	  
	  @Before
		public void setUp() throws MalformedURLException{
		System.out.println("-- Setup() BEGIN --");
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setCapability("platform", "LINUX");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "SampleSauceTest");
		driver = new RemoteWebDriver(new URL(URL), caps);
		System.out.println("Driver is : "+driver);
		System.out.println("-- Setup() END --");
	  }
	  
	  @Test
	  public void testScript() {
		System.out.println("-- testScript() BEGIN --");
		driver.get("https://saucelabs.com/test/guinea-pig");
		System.out.println("title of page is: " + driver.getTitle());	 	
	 	assertEquals("I am a page title - Sauce Labs", driver.getTitle());
	    driver.quit();
		System.out.println("-- testScript() END --");
	  }
	 

}



