import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegisterTest {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void startSession() {
        System.setProperty("webdriver.chrome.driver", TestData.CHROME_PATH);
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public static void setUp(){
        driver.get(TestData.BASE_URL);
    }

    @Test(testName = "Register Success", priority = 0)
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

    @Test(testName = "Register Failed", priority = 1)
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

    @Test(testName = "Already Registered", priority = 2)
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

    @AfterMethod
    public static void tearDown(){
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void terminateSession(){
        driver.close();
        driver.quit();
    }
}
