package com.maggioni.cssselectors.demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo1 {

    public static void main(String[] args) {

        WebDriver driver = setupWebDriver();

        //List<WebElement> findElements = driver.findElements(By.className("od-home-content-search"));
        //List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='od-home-content-search']"));
        // //*[@id="departure-autocomplete0"]/div[2]/div[3]/div[1]/div[2]/input
        List<WebElement> findElements1 = driver.findElements(By.cssSelector("div.od-airportselector.airportselector_root input[class='airportselector_input']"));
        List<WebElement> findElements2 = driver.findElements(By.cssSelector("div[class='od-airportselector airportselector_root'] input[class='airportselector_input']"));

        System.out.println(" elemets equals : " + (findElements1.size() == findElements2.size()));
        
        System.out.println("total :" + findElements2.size());
        findElements2.forEach(a -> System.out.println("tag name : " + a.getTagName() + " class : " + a.getAttribute("class")));
        driver.close();
    }

    private static WebDriver setupWebDriver() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angelo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maggioni\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opodo.de/");
        return driver;
    }

}
