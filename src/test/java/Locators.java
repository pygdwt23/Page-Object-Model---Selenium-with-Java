import org.openqa.selenium.By;

public class Locators {

//    Homepage Locators

    final static By SIGN_IN_BUTTON = By.cssSelector("a.login");
    final static  String PRODUCT_CARD = "//*[@id='homefeatured']/li[2]";
    final static  String PRODUCT_CARD_DRESS = "//*[@'id=homefeatured']/li[7]";
    final static  String PRODUCT_CARD_PRINTED_DRESS ="//*[@id='homefeatured']/li[4]/div";
    final static By MORE_BUTTON = By.xpath("//*[@id=homefeatured]/li[2]/div/div[2]/div[2]/a[2]/span");
    final static By ADD_TO_CART_BUTTON = By.xpath("//*[@'id=homefeatured']/li[7]/div/div[2]/div[2]/a[1]/span");
    final static By QUICKVIEW_BUTTON = By.xpath("//*[@'id=homefeatured']/li[2]/div/div[1]/div/a[2]/span");
    final static By CATEGORIES_WOMEN_BUTTON = By.xpath("//*[@'id=footer']/div/section[2]/div/div/ul/li/a");
    final static By SEARCH_FIELD = By.id("search_query_top");
    final static By SEARCH_SUBMIT = By.name("submit_search");
    final static By LOGO_URL = By.xpath("//*[@'id=header_logo']/a/img");
    final static By ADD_FROM_HOME_STATUS = By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2");

//     PRODUCT POP UP
    final static By PROCEED_TO_CHECKOUT_BTN_POP = By.xpath("//*[@'id=layer_cart']/div[1]/div[2]/div[4]/a/span");

//    AUTH PAGE
    final static By REG_EMAIL_FIELD = By.id("email_create");
    final static By SUBMIT_CREATE_ACCOUNT = By.id("SubmitCreate");
    final static By SIGN_IN_EMAIL_FIELD = By.id("email");
    final static By SIGN_IN_PASSWORD_FIELD = By.id("passwd");
    final static By SUBMIT_SIGN_IN = By.id("SubmitLogin");

//    REGISTRATION PAGE
    final static By REG_RADIO_GENDER_1 = By.id("id_gender1");
    final static By REG_RADIO_GENDER_2 = By.id("id_gender2");
    final static By REG_FIRST_NAME = By.id("customer_firstname");
    final static By REG_LAST_NAME = By.id("customer_lastname");
    final static By REG_PASSWORD = By.id("passwd");
    final static String REG_DROP_DAYS = "days";
    final static String REG_DROP_MONTHS = "months";
    final static String REG_DROP_YEARS = "years";
    final static By REG_COMPANY = By.id("company");
    final static By REG_ADDRESS1 = By.id("address1");
    final static By REG_CITY = By.id("city");
    final static String REG_STATE = "id_state";
    final static By REG_POSTAL_CODE = By.id("postcode");
    final static String REG_COUNTRY = "id_country";
    final static By REG_ADDITIONAL_INFO = By.id("other");
    final static By REG_MOBILE_PHONE = By.id("phone_mobile");
    final static By REG_ADDRESS_ALIAS = By.id("alias");
    final static By REG_SUBMIT_REGISTER = By.id("submitAccount");

    final static By REG_ALERT_SUCCESS = By.cssSelector("p.info-account");
    final static By REG_ALERT_FAILED = By.xpath("//*[@id='center_column']/div/p");
    final static By REG_ALERT_ALREADY_REGISTERED = By.xpath("//*[@id='create_account_error']/ol/li");
}