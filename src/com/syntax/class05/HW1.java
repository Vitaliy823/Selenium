package com.syntax.class05;

        /*Go to facebook sign up page
        Fill out the whole form
        Click signup*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("JSmith@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("JSmith@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Smithpass123");
        WebElement monthDD = driver.findElement(By.xpath("//select[@id='month']"));
        Select mDD =new Select(monthDD);
        mDD.selectByValue("4");
        Thread.sleep(1000);
        WebElement dayhDD = driver.findElement(By.xpath("//select[@id='day']"));
        Select dDD =new Select(monthDD);
        dDD.selectByValue("3");

    }
}
