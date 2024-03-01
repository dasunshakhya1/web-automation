package com.devlab.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UIHandler {
    private static WebDriver webDriver;

    public static void openApplication() {
        webDriver = DriverManager.getDriver();
        webDriver.get(Configs.URL);
    }

    public static void quitDriver() {
        DriverManager.quitDriver();
    }


    public static WebElement findElement(By by) {
        return webDriver.findElement(by);
    }

    public static List<WebElement> findElements(By by) {
        return webDriver.findElements(by);
    }

    public static void type(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public static void type(WebElement element, String text) {
        element.sendKeys(text);
    }

    public static void click(By by) {
        findElement(by).click();
    }

    public static void click(WebElement element) {
        element.click();
    }
}
