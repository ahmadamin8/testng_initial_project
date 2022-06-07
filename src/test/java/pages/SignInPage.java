package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SignInPage {
    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    public WebElement h1;

    @FindBy(css = "p[class='sds-page-section__title--sub signup-block']")
    public WebElement paragraph;

    @FindBy(css = "input[name='user[email]']")
    public WebElement emailBox;

    @FindBy(css = "input[name='user[password]']")
    public WebElement passwordBox;

    @FindBy(css = ".sds-helper-text")
    public WebElement passwordWarning;

    @FindBy(xpath = "//div[@class='password-help']//a")
    public WebElement forgotPassword;

    @FindBy(xpath = "//div[@class='sds-disclaimer ']")
    public WebElement signInWarning;

    @FindBy(xpath = "//div[@class='sds-field']//button")
    public WebElement signButton;

    @FindBy(css = "h3[class='social-title sds-heading--3']")
    public WebElement h3;

    @FindBy(xpath = "//li[@class='social-link']/a")
    public List<WebElement> allSocialMedia;

    @FindBy(css = "a[class='sds-button google-button']")
    public WebElement signWithGoogle;

    @FindBy(xpath = "//div[@class='sds-notification__content']")
    public WebElement passwordErrorMessage;







}
