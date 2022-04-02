package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02a {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).sendKeys("1000 Main st.");
        driver.findElement(By.id("customer.address.city")).sendKeys("NYC");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("10001");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9801234567");
        driver.findElement(By.id("customer.ssn")).sendKeys("001-002-0003");
        driver.findElement(By.id("customer.username")).sendKeys("user");
        driver.findElement(By.id("customer.password")).sendKeys("12345678");
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345678");
        driver.findElement(By.className("button")).click();
        driver.quit();


      }
}
