import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class TestApp {
    private WebDriver driver;

    public TestApp() {
    }

    @BeforeEach
    public void openApp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://mts.by");
        if (driver.findElement(By.xpath("//div[@class='cookie__wrapper']")).isDisplayed()) {
            driver.findElement(By.xpath("//button[@id='cookie-agree']")).click();
        }

    }

    @AfterEach
    public void closeApp() {
        this.driver.close();
        this.driver.quit();
    }

    @Test
    public void testBlockOnlinePayText() {
        WebElement blockOnlinePay = driver.findElement(By.xpath("//div[@class='pay__wrapper']//h2"));
        String text = blockOnlinePay.getText();
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", text);
    }

    @Test
    public void testPresenceOfPaymentSystemLogos() {
        List<WebElement> listLogo = driver.findElements(By.xpath("//div[@class='pay__partners']//img"));
        for (WebElement logo : listLogo) {
            String logoText = logo.getAttribute("alt");
            Assertions.assertTrue(logo.isDisplayed()&
                    (logoText.equals("Visa")||logoText.equals("Verified By Visa")||logoText.equals("MasterCard")
                            ||logoText.equals("MasterCard Secure Code")||logoText.equals("Белкарт")),
                    "Логотип не отобразился : " + logo.getAttribute("alt"));
        }
    }

    @Test
    public void testCurrentUrl() {
        driver.findElement(By.xpath("//div[@class='pay__wrapper']/a[text()='Подробнее о сервисе']")).click();
        String currentTitle = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertTrue(Objects.equals(currentUrl, "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/")
                & Objects.equals(currentTitle, "Порядок оплаты и безопасность интернет платежей"), "Ссылка неверна");

    }

    @Test
    public void testButtonContinueOperation() {
        WebElement phoneInput = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        phoneInput.click();
        phoneInput.sendKeys("297777777");
        WebElement sum = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        sum.click();
        sum.sendKeys("10");
        driver.findElement(By.xpath("//section[@class='pay']//button[text()='Продолжить']")).click();
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(iframe);
        WebElement payElement = driver.findElement(By.xpath("//div[@class='pay-description__text']//span"));
        String text = payElement.getAttribute("innerText");
        Assertions.assertEquals("Оплата: Услуги связи Номер:375297777777", text);
    }
}
