package com.angelo.selenium.udemy.howtoruntestchrome;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TUMOnlineAnmeldungDemo1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angelo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amaggioni.com");
        //driver.get("https://campusquality.tum.de/QSYSTEM_TUM/webnav.ini");
        /*driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[1]/a")).click();*/
//        driver.findElement(By.linkText("About")).click();
        //List<WebElement> findElements = driver.findElements(By.xpath("//a[@href='html/impressum.html']"));
        List<WebElement> findElements = driver.findElements(By.xpath("//a"));
        System.out.println("elements size :" + findElements.size());
        findElements.forEach(a -> System.out.println(a.getTagName() + " " + a.getText() +  " " + a.isDisplayed()));
        /* driver.findElement(By.linkText("Informationen und Anleitungen zu TUMonline")).click();*/
//<a href="anmeldung.durchfuehren" target="detail" id="menue_frame_key_icon" accesskey="l" title="Anmeldung" onclick="if ( (parent.detail.location.href.indexOf('wbAev.init') == -1) &amp;&amp; (parent.detail.location.href.indexOf('willkommen') == -1) &amp;&amp; (parent.detail.location.href.indexOf('anmeldung.durchfuehren') == -1) ) { parent.detail.location = 'wbanmeldung.durchfuehren?cUrl=' + escape(parent.detail.location.href.substr(parent.detail.location.href.lastIndexOf('/')+1 , parent.detail.location.href.length - parent.detail.location.href.lastIndexOf('/') -1 ) ) } else { parent.detail.location = 'wbanmeldung.durchfuehren' }; return false;"><img src="https://campusquality.tum.de/qtum/img/icon_key_normal_tumprod.png?20160914063439" name="key" title="Anmeldung" onmouseover="changeImgHover('key');" onmouseout="changeImgNormal('key');" alt="Anmeldung"></a>
/*driver.findElement(By.xpath("//*[@id=\"pageContent\"]/table[1]/tbody/tr[8]/td/h2/b/a")).click();  */              
// <a href="/docs/configuration">App Configuration</a>
        // webDriver.findElement(By.xpath("//a[@href='/docs/configuration']")).click();
        
        driver.close();

    }

}
