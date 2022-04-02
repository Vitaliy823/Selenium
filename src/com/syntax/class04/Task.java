package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    /*Open chrome browser
    Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    Enter valid username and password (username - Admin, password - Hum@nhrm123)
    Click on login button
    Then verify Syntax Logo is displayed.*/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.name("Submit")).click();
        //System.out.println(driver.findElement(By.cssSelector("img[src*='syntax.png']")).isDisplayed());
        if (driver.findElement(By.cssSelector("img[src*='syntax.png']")).isDisplayed()){
            System.out.println("Logo is displayed");
        }else{
            System.out.println("Logo is not displayed");
        }
    }
}
