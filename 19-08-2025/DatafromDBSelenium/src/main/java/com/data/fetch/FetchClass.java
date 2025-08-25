package com.data.fetch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.lang.Class.forName;

public class FetchClass {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        WebDriver driver = null;

        //Connect to db
        try {
            String url = "jdbc:mysql://localhost:3306/java_selenium";
            String username = "root";
            String password = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            st = con.createStatement();
            rs = st.executeQuery("select username,password from login where id=1");

            String dbusername = null;
            String dbpassword = null;
            while (rs.next()) {
                dbusername = rs.getString("username");
                dbpassword = rs.getString("password");
            }

            driver = new ChromeDriver();
            driver.get("e://html//login.html");

            WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
            WebElement pw = driver.findElement(By.xpath("//input[@id='password']"));
            WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
            un.sendKeys(dbusername);
            pw.sendKeys(dbpassword);
            loginBtn.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // JDBC cleanup
            try {
                if (rs != null) rs.close();
            } catch (Exception ignored) {
            }
            try {
                if (st != null) st.close();
            } catch (Exception ignored) {
            }
            try {
                if (con != null) con.close();
            } catch (Exception ignored) {
            }

            // Close browser
            if (driver != null) {
                driver.quit();
            }

        }
    }
}
