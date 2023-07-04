package com.funnygorilla.learnbdd;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
    private static HelperClass helperClass;
    
    private static WebDriver driver;
    private static WebDriverWait wait;
    public final static int TIMEOUT = 10;
     
     private HelperClass() {         
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT).toSeconds(), TimeUnit.SECONDS);
        driver.manage().window().maximize();        
        wait = new WebDriverWait(driver, TIMEOUT);
     }      
             
    public static void openPage(String url) {
        driver.get(url);
    }
 
    public static WebDriver getDriver() {
        return driver;  
    }
     
    public static void setUpDriver() {
        if (helperClass == null) {
            helperClass = new HelperClass();
        }
    }
 
    public static void tearDown() {
       if(driver != null) {
           driver.close();
           driver.quit();
       }
       helperClass = null;
   }
    
	public static void getAWait(String xpath) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
    
    public static boolean isDisplayed(By locator) {  
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

}
