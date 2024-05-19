package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1980x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 50000;

    }

    @AfterEach
    void closeWebDriver() {
        Selenide.closeWebDriver();
    }
}
