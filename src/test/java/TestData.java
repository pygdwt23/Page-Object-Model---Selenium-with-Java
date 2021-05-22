import com.github.javafaker.Faker;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

import java.util.Locale;

public class TestData {
    // Web Driver
    final static String CHROME_PATH = "chromedriver";

    // Faker
    Faker faker = new Faker(new Locale("id_ID"));

    // Fairy
//    Fairy fairy = Fairy.create();
//    Person person = fairy.person();

    // URL
    final static String BASE_URL = "http://automationpractice.com/index.php";

    // AUTH DATA
    final static String EMAIL_ALREADY_REGISTERED = "narto@konoha.com";

    // VALID DATA
    String VALID_FIRST_NAME = faker.name().firstName();
    String VALID_LAST_NAME = faker.name().lastName();
    String VALID_EMAIL = faker.internet().emailAddress();
    String VALID_PASSWORD = faker.internet().password();
    final static String VALID_DAY = "20";
    final static String VALID_MONTH = "3";
    final static String VALID_YEAR = "2003";
    String VALID_COMPANY = faker.company().name();
    String VALID_ADDRESS = faker.address().fullAddress();
    String VALID_CITY = faker.address().city();
    final static String VALID_STATE = "California";
    String VALID_POSTCODE = faker.address().zipCode();
    final static String VALID_COUNTRY = "United States";
    String VALID_ADDITIONAL_INFO = faker.lorem().paragraph();
    String VALID_PHONE_NUMBER = faker.phoneNumber().phoneNumber();
    String VALID_ADDRESS_ALIAS = "Apt No." +faker.address().buildingNumber();

    //INVALID DATA
    final static String INVALID_FIRST_NAME = "M!ch4el";
    final static String INVALID_LAST_NAME = "K4t@l0n";
    String INVALID_EMAIL = faker.internet().emailAddress();
    final static String INVALID_PASSWORD = "P@5$";
    final static String INVALID_DAY = "";
    final static String INVALID_MONTH = "";
    final static String INVALID_YEAR = "";
    final static String INVALID_COMPANY = "K0MP@NY";
    final static String INVALID_ADDRESS = "ALAMAT PALSU";
    final static String INVALID_CITY = "C@LIURAN6";
    final static String INVALID_STATE = "";
    final static String INVALID_POSTCODE = "POBOX911";
    final static String INVALID_COUNTRY = "";
    final static String INVALID_ADDITIONAL_INFO = "L0R3M!";
    final static String INVALID_PHONE_NUMBER = "OB!0989999";
    final static String INVALID_ADDRESS_ALIAS = "H0M3!";

    // SEARCH DATA
    final static String SEARCH_VALUE = "dress";

    // ALERT REGISTER
    final static String ALERT_REGISTER_SUCCESS = "Welcome to your account. Here you can manage all of your personal information and orders.";
    final static String ALERT_REGISTER_FAILED = "There are 6 errors";
    final static String ALERT_ALREADY_REGISTERED = "An account using this email address has already been registered. Please enter a valid password or request a new one.";

}