package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bbc.PageObjectDemo.BrowserUtil;
import com.bbc.PageObjectDemo.HomePageObject;

public class NewTest {
	HomePageObject page =new HomePageObject();
    BrowserUtil browser = new BrowserUtil();
    WebDriver drivers;
    
    
  @Test
  public void test_baidu() throws Exception {
      page.click_Search_Bar(drivers);
      page.input_Search_Box(drivers,"PageObject设计模式");
      Thread.sleep(10000);
      page.click_Search_Button(drivers);
  }
  @BeforeMethod
  public void beforeMethod() {
      System.out.println("Before method success....");
     
  }

  @AfterMethod
  public void afterMethod() {
      System.out.println("After Method success....");
  }

  @BeforeClass
  public void beforeClass() {
      System.out.println("Before Class success....");
  }

  @AfterClass
  public void afterClass() {
      System.out.println("After Class success....");
  }

  @BeforeTest
  public void beforeTest() {
      System.out.println("Before Test success....");
  }

  @AfterTest
  public void afterTest() {
      System.out.println("After Test success....");
  }

  @BeforeSuite
  public void beforeSuite() {
      drivers = browser.setupChrome("http://www.baidu.com/");
      System.out.println("Before Suite success....");
  }

  @AfterSuite
  public void afterSuite() {
      browser.teardownBrowser();
      System.out.println("After Suite success....");
  }

}
