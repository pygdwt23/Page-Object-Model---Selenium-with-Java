import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static void signIn(){
        // Fungsi klik tombol sign in di home page
        click(Locators.SIGN_IN_BUTTON);
        isVisible(Locators.REG_EMAIL_FIELD);
    }
}
