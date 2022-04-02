package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC1 {
    /*TC 1: Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser*/
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(2000);
        WebElement monthDD = driver.findElement(By.name("birthday_month"));
        Select mDD =new Select(monthDD);
        List<WebElement> optionsMonth = mDD.getOptions();
        if (optionsMonth.size()==12) {
            System.out.println("month dd has 12 month options");
        }else{
            System.out.println("month dd hasn't 12 month options");
        }
        Thread.sleep(2000);
        WebElement dayhDD = driver.findElement(By.name("birthday_day"));
        Select dDD =new Select(monthDD);
        List<WebElement> optionsDay = dDD.getOptions();
        if (optionsDay.size()==31) {
            System.out.println("day dd has 31 day options");
        }else{
            System.out.println("day dd hasn't 31 day options");
        }
        Thread.sleep(2000);
        WebElement yearhDD = driver.findElement(By.name("birthday_year"));
        Select yDD =new Select(monthDD);
        List<WebElement> optionsYear = yDD.getOptions();
        if (optionsYear.size()==115) {
            System.out.println("year dd has 115 year options");
        }else{
            System.out.println("year dd hasn't 115 year options");
        }
        mDD.selectByValue("1");
        /*Thread.sleep(1000);
        dDD.selectByValue("1");
        Thread.sleep(1000);
        yDD.selectByVisibleText("2020");*/
        }

    }
