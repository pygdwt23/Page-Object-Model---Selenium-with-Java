import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegisterTest {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", TestData.CHROME_PATH);
        driver.manage().window().maximize();
        driver.get(TestData.BASE_URL);
    }

    @Test(testName = "Register Success" )
    public static void testRegisterSuccess(){
//     Load Homepage Object
    HomePage homepage = new HomePage(driver);

//    Click Sign in from Homepage
        homepage.signIn();

//        Load Auth Page Object
        AuthPage auth = new AuthPage(driver);

//        Execute Register Success
        auth.registerSuccess();

//        Assertion
        String infoAccount = auth.getText(Locators.REG_ALERT_SUCCESS);
        Assert.assertEquals(infoAccount, TestData.ALERT_REGISTER_SUCCESS);
    }

    @Test(testName = "Register Failed")
    public static void testRegisterFailed(){
//     Load Homepage Object
        HomePage homepage = new HomePage(driver);

//    Click Sign in from Homepage
        homepage.signIn();

//        Load Auth Page Object
        AuthPage auth = new AuthPage(driver);

//        Execute Register Success
        auth.registerFailed();

//        Assertion
        String infoAccount = auth.getText(Locators.REG_ALERT_FAILED);
        Assert.assertEquals(infoAccount, TestData.ALERT_REGISTER_FAILED);
    }

    @Test(testName = "Already Registered")
    public static void testAlreadyRegistered(){
//     Load Homepage Object
        HomePage homepage = new HomePage(driver);

//    Click Sign in from Homepage
        homepage.signIn();

//        Load Auth Page Object
        AuthPage auth = new AuthPage(driver);

//        Execute Register Success
        auth.alreadyRegister();

//        Assertion
        String infoAccount = auth.getText(Locators.REG_ALERT_ALREADY_REGISTERED);
        Assert.assertEquals(infoAccount, TestData.ALERT_ALREADY_REGISTERED);
    }

    @AfterSuite
    public static void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
