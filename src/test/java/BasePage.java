import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;


public class BasePage {
    private static WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Fungsi klik locator
    public static void click(By locator) {
        new  WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    // Fungsi input teks
    public static void enterText(By locator, String teks) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(teks);
    }

    // Fungsi untuk hapus teks
    public static void clearText(By locator) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator)).clear();
    }

    // Fungsi untuk mengambil teks
    public static String getText(By locator) {
        String teks = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        return teks;
    }

    // Fungsi untuk mengecek elemen visible
    public static boolean isVisible(By locator) {
        try {
            WebElement element = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(locator));
            boolean visibilityElement = element.isDisplayed();
            return visibilityElement;
        }
        catch (TimeoutException timeoutException) {
            return false;
        }
    }

    // Fungsi select dropdown
    public static void selectDropdownByValueXpath(String locator, String item) {
        Select dropdown = new Select(driver.findElement(By.xpath(locator)));
        dropdown.selectByValue(item);
    }

    public static void selectDropdownByVisibleTextXpath(String locator, String item) {
        Select dropdown = new Select(driver.findElement(By.xpath(locator)));
        dropdown.selectByVisibleText(item);
    }

    public static void selectDropdownByValueId(String locator, String item) {
        Select dropdown = new Select(driver.findElement(By.id(locator)));
        dropdown.selectByValue(item);
    }

    public static void selectDropdownByVisibleTextId(String locator, String item) {
        Select dropdown = new Select(driver.findElement(By.id(locator)));
        dropdown.selectByVisibleText(item);
    }

    // Fungsi Hover
    public static void moveToElement(String locator) {
        Actions action = new Actions(driver);
//      Action act = action.build();
        WebElement hover = driver.findElement(By.xpath(locator));
        action.moveToElement(hover).perform();
    }
}
