import org.openqa.selenium.WebDriver;

public class AuthPage extends BasePage{

    public AuthPage(WebDriver driver) {
        super(driver);
    }

    public void registerSuccess(){
//        Objek untuk memanggil non static variabel
     TestData callfaker = new TestData();

//     Type Email
        enterText(Locators.REG_EMAIL_FIELD, callfaker.VALID_EMAIL);

//        Click create an account button
        click(Locators.SUBMIT_CREATE_ACCOUNT);

//        Select Gender
        click(Locators.REG_RADIO_GENDER_1);

//        Type First Name
        enterText(Locators.REG_FIRST_NAME, callfaker.VALID_FIRST_NAME);

//        Type Last Name
        enterText(Locators.REG_LAST_NAME, callfaker.VALID_LAST_NAME);

//        Type Password
        enterText(Locators.REG_PASSWORD, callfaker.VALID_PASSWORD);

//        Select Date of Birth
        selectDropdownByValueId(Locators.REG_DROP_DAYS, TestData.VALID_DAY);
        selectDropdownByValueId(Locators.REG_DROP_MONTHS, TestData.VALID_MONTH);
        selectDropdownByValueId(Locators.REG_DROP_YEARS, TestData.VALID_YEAR);

//        Type Company
        enterText(Locators.REG_COMPANY, callfaker.VALID_COMPANY);

//        Type Address
        enterText(Locators.REG_ADDRESS1, callfaker.VALID_ADDRESS);

//        Type City
        enterText(Locators.REG_CITY, callfaker.VALID_CITY);

//        Select State
        selectDropdownByVisibleTextId(Locators.REG_STATE, TestData.VALID_STATE);

//        Type Post Code
        enterText(Locators.REG_POSTAL_CODE, callfaker.VALID_POSTCODE);

//        Select Country
        selectDropdownByVisibleTextId(Locators.REG_COUNTRY, TestData.VALID_COUNTRY);

//        Type Additional Info
        enterText(Locators.REG_ADDITIONAL_INFO, callfaker.VALID_ADDITIONAL_INFO);

//        Type Mobile Phone
        enterText(Locators.REG_MOBILE_PHONE, callfaker.VALID_PHONE_NUMBER);

//        Type Address Alias
        clearText(Locators.REG_ADDRESS_ALIAS);
        enterText(Locators.REG_ADDRESS_ALIAS, callfaker.VALID_ADDRESS_ALIAS);

//        Click Register Button
        click(Locators.REG_SUBMIT_REGISTER);

//        Wait for Element Visible
        isVisible(Locators.REG_ALERT_SUCCESS);
    }

    public void registerFailed(){
//        Objek untuk membaca variabel non static
        TestData callfaker = new TestData();

//        Type Email
        enterText(Locators.REG_EMAIL_FIELD, callfaker.INVALID_EMAIL);

//        Click Create an account button
        click(Locators.SUBMIT_CREATE_ACCOUNT);

//        Select Gender
        click(Locators.REG_RADIO_GENDER_1);

//        Type First Name
        enterText(Locators.REG_FIRST_NAME, TestData.INVALID_FIRST_NAME);

//        Type Last Name
        enterText(Locators.REG_LAST_NAME, TestData.INVALID_LAST_NAME);

//        Type Password
        enterText(Locators.REG_PASSWORD, TestData.INVALID_PASSWORD);

//        Select date of birth
        selectDropdownByValueId(Locators.REG_DROP_DAYS, TestData.INVALID_DAY);
        selectDropdownByValueId(Locators.REG_DROP_MONTHS, TestData.INVALID_MONTH);
        selectDropdownByValueId(Locators.REG_DROP_YEARS, TestData.INVALID_YEAR);

//        Type Company
        enterText(Locators.REG_COMPANY, TestData.INVALID_COMPANY);

//        Type Address
        enterText(Locators.REG_ADDRESS1, TestData.INVALID_ADDRESS);

//        Type City
        enterText(Locators.REG_CITY, TestData.INVALID_CITY);

//        Select State
        selectDropdownByVisibleTextId(Locators.REG_STATE, TestData.VALID_STATE);

//        Type Post Code
        enterText(Locators.REG_POSTAL_CODE, TestData.INVALID_POSTCODE);

//        Select Country
        selectDropdownByVisibleTextId(Locators.REG_COUNTRY, TestData.VALID_COUNTRY);

//        Type Additional Info
        enterText(Locators.REG_ADDITIONAL_INFO, TestData.INVALID_ADDITIONAL_INFO);

//        Type Mobile Phone
        enterText(Locators.REG_MOBILE_PHONE, TestData.INVALID_PHONE_NUMBER);

//        Type Address Alias
        clearText(Locators.REG_ADDRESS_ALIAS);
        enterText(Locators.REG_ADDRESS_ALIAS, TestData.INVALID_ADDRESS_ALIAS);

//        Click Submit Button
        click(Locators.REG_SUBMIT_REGISTER);

//        Wait For Element Visible
        isVisible(Locators.REG_ALERT_FAILED);
    }

    public void alreadyRegister(){
//        Type Email
        enterText(Locators.REG_EMAIL_FIELD, TestData.EMAIL_ALREADY_REGISTERED);

//        Click create an account button
        click(Locators.SUBMIT_CREATE_ACCOUNT);

//        Wait for visible element
        isVisible(Locators.REG_ALERT_ALREADY_REGISTERED);
    }
}
