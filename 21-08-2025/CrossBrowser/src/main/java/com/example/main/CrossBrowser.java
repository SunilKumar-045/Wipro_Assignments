package com.example.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {
    public static WebDriver driver;

    public static void main(String[] args) {
        String browser = "firefox";

        switch (browser.toLowerCase()){
            case "chrome":{
                driver = new ChromeDriver();
                break;
            }
            case "edge":{
                System.setProperty("webdriver", "E:\\edgedriver_win64\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            }
            case "firefox":{
                System.setProperty("webdriver", "E:\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            }
            default:{

                System.out.println("Browser Not Supported....");
            }
        }

        driver.get("https://www.google.com");
        System.out.println("Title:"+driver.getTitle());
        driver.quit();
    }
}
