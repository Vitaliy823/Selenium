package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title + " " + url);
        driver.quit();

    }
}
