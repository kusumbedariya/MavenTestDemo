//package mavendemo;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class HomePage {
//  WebDriver driver;
//  String url = "https://www.google.com/";
//  String title = "Google";
//
//  public HomePage(WebDriver driver) {
//    this.driver = driver;
// System.out.println(driver);  
//  	
//  }
//
//  public void open()  {
////    driver.get(url);
//    System.out.println("---Open Method()");
//  }
//
//  public Boolean isTitleCorrect() 
//  {
//  	System.out.println("---isTitleCorrect()---"+driver.getTitle().equals(title));
//  	
//  return driver.getTitle().equals(title);
//  }
//
// public static void main(String[] args){
//	  System.out.println("This is MavenTestDemo Project");
// }
//  
//}