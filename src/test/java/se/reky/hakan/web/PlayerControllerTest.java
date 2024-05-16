package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
class PlayerControllerTest {

    private WebDriver driver;

    @BeforeAll
    public static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }

    @Test
    public void testAmountOfPlayers() {
        driver.get("http://localhost:8080/players");
        List<WebElement> amountOfPlayers = driver.findElements(By.tagName("li"));
        Assertions.assertEquals(2, amountOfPlayers.size());

    }

    @Test
    public void verifyNameDisplayOnPlayer() {
        driver.get("http://localhost:8080/players");
        WebElement element = driver.findElement(By.tagName("li"));
        assertTrue(element.isDisplayed());

    }

    @Test
    public void testWebSiteTitle() {
       driver.get("http://localhost:8080/players");
        Assertions.assertEquals("Players List", driver.getTitle());
    }

    @Test
    public void testButtonText() {
        driver.get("http://localhost:8080/players");
        Assertions.assertEquals("Logga in", driver.findElement(By.tagName("button")).getText());
    }

    @Test
    public void testNewEndPoint() {
        driver.get("http://localhost:8080/players");
        driver.findElement(By.cssSelector("ul li a")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement playerNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("player-name")));
        String playerName = playerNameElement.getText();
        Assertions.assertEquals("Tove", playerName);
    }





}