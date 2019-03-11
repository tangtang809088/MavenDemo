package com.bbc.PageObjectDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	public WebDriver driver;    
	     
	     public WebDriver setupChrome(String test_url){     
	    System.setProperty("webdriver.chrome.driver", System.getenv("DRIVER_HOME")+"\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get(test_url);
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     return driver;
	     }
	     //启动火狐浏览器(需要最新geckodriver.exe,放到firfox的根目录)
	     public WebDriver setupFirfox(String test_url){
	         driver = new FirefoxDriver();
	         driver.get(test_url);
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         return driver;
	    }
	     public void teardownBrowser(){
	    	        // driver.close();    
	    	     }  

}
