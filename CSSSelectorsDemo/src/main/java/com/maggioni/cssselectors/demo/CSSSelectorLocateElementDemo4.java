package com.maggioni.cssselectors.demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorLocateElementDemo4 {

    private static WebDriver driver;
    
    public static void main(String[] args) throws InterruptedException {

        driver = setupWebDriver();
        final String cssSelector = "div.od-flightsManager-cell.pax_selector .od-moreoptions-arrow.ficon.collapsed";

        WebElement element = driver.findElement(By.cssSelector(cssSelector));
        System.out.println(" " +  element.getAttribute("class") + " " +  element.isDisplayed());

        Thread.sleep(1000);
        
        element.click();
        //driver.close();
    }

    private static WebDriver setupWebDriver() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angelo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maggioni\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opodo.de/");
        return driver;
    }

}
