package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage {
  WebDriver driver;
  String url = "https://www.google.com/";
  String title = "Google";

  public HomePage(WebDriver driver) {
    this.driver = driver;
  }

  public void open()  {
    driver.get(url);
  }

  public Boolean isTitleCorrect() {
    return driver.getTitle().equals(title);
  }
  
  public static void main(String[] args){
	  System.setProperty("webdriver.chrome.driver", "C:\\JAVASE8Workspace\\chromedriver_win32 (1)\\chromedriver.exe");
	  //WebDriver driver = new ChromeDriver();

  }

}