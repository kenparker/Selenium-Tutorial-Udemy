package com.maggioni.cssselectors.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorNavigateFromToFields {

    private static WebDriver driver;
    
    public static void main(String[] args) throws InterruptedException {

        setupWebDriver();

        final String cssSelectorFromAirport = "div.od-airportselector.airportselector_root input[tabindex='11']";
        WebElement fromAirportElement = findElement(cssSelectorFromAirport);
        
        fromAirportElement.clear();
        fromAirportElement.sendKeys("München");
        
        final String cssSelectorFromAiportSelector1 = "div.od-airportselector-suggestions li[data-iata='MUC']";
        WebElement fromAirportSelectorElement = findElement(cssSelectorFromAiportSelector1);
        
        fromAirportSelectorElement.click();
        
        final String cssSelectorToAirport = "div.od-airportselector.airportselector_root input[tabindex='13']";
        WebElement toAirportElement = findElement(cssSelectorToAirport);
        
        toAirportElement.clear();
        toAirportElement.sendKeys("TFS");
        
        final String cssSelectorToAirportSelector2=  "div.od-airportselector-suggestions li[data-iata='TFS']";
        WebElement toAirportSelectorElement = findElement(cssSelectorToAirportSelector2);
        toAirportSelectorElement.click();
    }

    private static WebElement findElement(final String cssSelectorToAirport) throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.cssSelector(cssSelectorToAirport));
   
    }

    private static void setupWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angelo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maggioni\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.opodo.de/");
    }

}
