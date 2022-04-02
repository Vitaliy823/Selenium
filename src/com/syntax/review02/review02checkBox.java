package com.syntax.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class review02checkBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //        check the check box
        WebElement checkbox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("the checkbox is selected" + checkbox1.isSelected());
//        select the checkbox
        checkbox1.click();
        Thread.sleep(3000);
//        deselect the checkbox
        checkbox1.click();
    }

}
