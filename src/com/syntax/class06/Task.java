package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Navigate to https://syntaxprojects.com/bootstrap-iframe.php
verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
verify enroll today button is enabled*/
public class Task {
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement headElement = driver.findElement(By.xpath("//span[text()='AUTOMATION TESTING PLATFORM BY SYNTAX']"));
       if (headElement.isDisplayed()) {
           System.out.println("header text is displayed");
       }else{
           System.out.println("header text is not displayed");
       }
       driver.switchTo().frame("FrameTwo");
       WebElement enrollButton = driver.findElement(By.linkText("Enroll today"));
       if (enrollButton.isEnabled()) {
           System.out.println("Enroll today button is enabled");
       }else{
           System.out.println("Enroll today button is not enabled");
       }
       driver.quit();
    }
}
