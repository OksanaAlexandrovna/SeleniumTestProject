package org.example;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
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

public class FirstScriptTest {
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

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @Description("Some detailed test description")
    public void firstTestCase() throws IOException {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = driver.getTitle();
        assertEquals("Web form", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        textBox.sendKeys("Selenium");

        InputStream targetStream = new FileInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
        Allure.addAttachment("ResultScreen", targetStream);

        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        assertEquals("Received!", value);
    }

    @Test
    public void homeWorkTest() {
        Artifact TARDIS = new Artifact();
        Artifact Dinosaur = new Artifact("aztek");
        Artifact Papyrus = new Artifact("yegipet", 3);
    }
}
