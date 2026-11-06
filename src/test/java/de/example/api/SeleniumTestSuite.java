package de.example.api;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SeleniumTestSuite {

    private final String url = "https://lennard-langenbruch.github.io/wetterstation/";
    private final Integer fiveSecondWaitTime = 5000;

    @Test
    public void checkAllLinksHttpStatus() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get(url);

            List<String> hrefs = new ArrayList<>();
            for (WebElement link : driver.findElements(By.cssSelector("a[href]"))) {
                hrefs.add(link.getAttribute("href"));
            }

            for (String href : hrefs) {
                driver.navigate().to(href);
                Thread.sleep(fiveSecondWaitTime);
            }
        } finally {
            driver.quit();
        }
    }
}