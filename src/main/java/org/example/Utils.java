package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;



public class Utils extends BasePage
{
    public static String getTimeStamp()
    {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
    }

    // Creating method for click on any elements
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    // Creating method for entering any field
    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    // Creating method for getting line or textline
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    // Creating method for wait some time duration click on elements
    public static void waitForElementToBeClickable(By by, int duration) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // Creating method for wait some time duration click on url
    public static void waitForUrlToBe(String url, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));

    }

    // Creating method for selecting visible text
    public static void selectFromDropDownByVisibleText(By by, String txt) {

        Select text = new Select(driver.findElement(by));
        text.selectByVisibleText(txt);
    }

    // Creating method for selecting value
    public static void selectFromDropDownByValue(By by, String value)
    {
        Select selectValue = new Select(driver.findElement(by));
        selectValue.selectByValue(value);
    }

    //  Creating method for selecting index
    public static void selectFromDropDownByIndex(By by, int i) {

        Select selectIndex = new Select(driver.findElement(by));
        selectIndex.selectByIndex(i);
    }

}
