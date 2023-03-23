package org.example;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTestCase {
    private WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }


    @Test
    @Description("Some detailed test description")
    public void firstTestCase() throws IOException {
        driver.get("https://www.google.ru/");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.className("gLFyf"));
        search.sendKeys(new CharSequence[]{"youtube"});
        search.sendKeys(Keys.ENTER);


    }
}
