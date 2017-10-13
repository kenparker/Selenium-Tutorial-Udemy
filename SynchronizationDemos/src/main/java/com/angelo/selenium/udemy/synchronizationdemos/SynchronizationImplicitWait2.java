package com.angelo.selenium.udemy.synchronizationdemos;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationImplicitWait2 {
    
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angelo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maggioni\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.opodo.de/");

        final String cssSelectorFromAirport = "div.od-airportselector.airportselector_root input[tabindex='11']";
        final By cssSelector = By.cssSelector(cssSelectorFromAirport);
        WebElement fromAirportElement = driver.findElement(cssSelector);


        System.out.println("-->> " + fromAirportElement.isDisplayed() + " " + fromAirportElement.isEnabled() + " " + fromAirportElement.isSelected());

        //fromAirportElement.clear();
        fromAirportElement.sendKeys("MUC");

    }

}
