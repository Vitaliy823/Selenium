package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02b {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        //Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("fb@fb.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("fb@fb.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password");
        driver.findElement(By.name("websubmit")).click();
        //driver.findElement(By.id("u_o_9_G9")).click();
        //driver.quit();
    }
}
