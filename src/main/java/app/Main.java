package app;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static Map<String, String> URLs = new HashMap<String, String>();


    public static void main(String[] args) {
        URLs.put("Norte","http://freewaves.live/el-norte-mdq/");
        URLs.put("Chapa","http://freewaves.live/chapadmalal-mar-del-plata/");
        URLs.put("Windguru","https://www.windguru.cz/3640");
        System.setProperty("webdriver.chrome.driver","/home/marcos/IdeaProjects/surf/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = URLs.get("Chapa");
        driver.get(baseUrl);
        driver.manage().window().maximize();

        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(URLs.get("Windguru"));

        //driver.close();

    }

}