package com.devlab.core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


class DriverManager {


    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = getRequestedDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }


    private static WebDriver getRequestedDriver() {
        WebDriver _driver;
        String browser = Configs.BROWSER;
        _driver = switch (browser) {
            case "FIREFOX" -> getFirefoxDriver();
            case "SAFARI" -> getSafariDriver();
            default -> getChromeDriver();
        };
        return _driver;
    }


    private static WebDriver getSafariDriver() {
        return new SafariDriver();
    }

    private static WebDriver getFirefoxDriver() {
        return new FirefoxDriver();
    }

    private static WebDriver getChromeDriver() {
        return new ChromeDriver();
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}

