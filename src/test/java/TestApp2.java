import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;
import static org.testng.Assert.*;


public class TestApp2 {

    private WebDriver driver;
    private static final String[][] CHECK_ELEMENTS =
                    {{"Номер телефона", "Сумма", "E-mail для отправки чека"},
                    {"Номер абонента", "Сумма", "E-mail для отправки чека"},
                    {"Номер счета на 44", "Сумма", "E-mail для отправки чека"},
                    {"Номер счета на 2073", "Сумма", "E-mail для отправки чека"}};
    private static final String CHECK_SUM = "10.00";
    private static final String CHECK_NUMBER = "297777777";
    private static final String[] CHECK_PLACEHOLDERS = {"Номер карты", "Срок действия", "CVC",
            "Имя держателя (как на карте)"};
    private static final String[] CHECK_LOGO = {"mastercard", "visa", "belkart"};


    @BeforeMethod
    public void openApp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://mts.by");
        if (!driver.findElements(By.xpath("//div[@class='cookie__wrapper']")).isEmpty() &&
                driver.findElement(By.xpath("//div[@class='cookie__wrapper']")).isDisplayed()) {
            driver.findElement(By.xpath("//button[@id='cookie-agree']")).click();
        }
    }

    @AfterMethod
    public void closeApp() {
        this.driver.close();
        this.driver.quit();
    }

    @Test(priority = 1)
    public void checkFields() {
        Actions builder = new Actions(driver);
        builder
                .moveToElement(driver.findElement(By.xpath("//section[@class = 'pay']//button[@class = 'select__header']")))
                .click()
                .build()
                .perform();
        List<WebElement> liElements = driver.findElements(By.xpath("//section[@class='pay']//ul[@class='select__list']//li"));
        for (int i = 0; i < liElements.size(); i++) {
            liElements.get(i).click();
            List<WebElement> inputElements = driver.findElements(By.xpath("//form[@class='pay-form opened']//input"));
            for (int j = 0; j < inputElements.size(); j++) {
                assertEquals(inputElements.get(j).getAttribute("placeholder"), CHECK_ELEMENTS[i][j]);
            }
            builder
                    .moveToElement(driver.findElement(By.xpath("//section[@class='pay']//button[@class='select__header']")))
                    .click()
                    .build()
                    .perform();
        }
    }

    @Test(priority = 2)
    public void checkSumInForm() {
        filling();
        WebElement sumSpan = driver.findElement(By.xpath("//div[@class='pay-description__cost']/span"));
        String textInSpan = sumSpan.getAttribute("innerText");
        WebElement sumButton = driver.findElement(By.xpath("//button[@class = 'colored disabled']"));
        String textInButton = sumButton.getAttribute("innerText");
        boolean sumContain = textInButton.contains(CHECK_SUM) && textInSpan.contains(CHECK_SUM);
        assertTrue(sumContain);
    }

    public void filling() {
        Actions builder = new Actions(driver);
        builder
                .moveToElement(driver.findElement(By.xpath("//section[@class = 'pay']//button[@class = 'select__header']")))
                .click()
                .moveToElement(driver.findElement(By.xpath("//ul[@class = 'select__list']/li//p[text()='Услуги связи']")))
                .click()
                .pause(Duration.ofSeconds(3))
                .moveToElement(driver.findElement(By.xpath("//input[@id = 'connection-phone']")))
                .click()
                .sendKeys(CHECK_NUMBER)
                .moveToElement(driver.findElement(By.xpath("//input[@id = 'connection-sum']")))
                .click()
                .sendKeys(CHECK_SUM)
                .moveToElement(driver.findElement(By.xpath("//section[@class = 'pay']//button[text()='Продолжить']")))
                .click()
                .build()
                .perform();
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(iframe);
    }

    @Test(priority = 3)
    public void checkNumberInForm(){
        filling();
        WebElement divElement = driver.findElement(By.xpath("//div[@class='pay-description__text']"));
        String divElementText = divElement.getAttribute("innerText");
        String actualPhoneNumber = divElementText.substring(divElementText.length() - CHECK_NUMBER.length());
        assertEquals(actualPhoneNumber, CHECK_NUMBER);
    }

    @Test(priority = 4)
    public void checkPlaceholderInForm(){
        filling();
        List<WebElement> labels = driver.findElements(By.xpath("//app-card-input//label"));
        labels.remove(labels.size() - 1);
        for (int i = 0; i < labels.size(); i++) {
            assertEquals(labels.get(i).getAttribute("innerText"), CHECK_PLACEHOLDERS[i]);
        }
    }
    @Test(priority = 5)
    public void checkIcons() {
        filling();
        List<WebElement> icons = driver.findElements(By.xpath("//div[contains(@class,'cards-brands__container')]/img"));
        for (int i = 0; i < icons.size(); i++) {
            assertTrue(icons.get(0).isEnabled() && icons.get(i).getAttribute("src").contains(CHECK_LOGO[i]));
        }
    }
}


