package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Go to https://syntaxprojects.com/javascript-alert-box-demo.php
click on each button and handle the alert accordingly*/
public class HW {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement alert1 = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        alert1.click();
        Thread.sleep(1000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        Thread.sleep(500);

        WebElement alert2 = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        alert2.click();
        Thread.sleep(1000);
        Alert confirmBox = driver.switchTo().alert();
        simpleAlert.accept();
        Thread.sleep(500);

        WebElement alert3 = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        alert3.click();
        Thread.sleep(1000);
        Alert promptBox = driver.switchTo().alert();
        Thread.sleep(1000);
        promptBox.sendKeys("HW done!");
        //promptmBox.accept();
        Thread.sleep(500);
    }
}
