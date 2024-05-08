package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Disabled
class PlayerControllerTest {

    private WebDriver driver;

    @BeforeAll
    public static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
        //ersätt ev med din aktuella driver
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }

    public void test() {
       driver.get("http://localhost:8080/players");

    }




}