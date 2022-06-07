package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[text()='Sign in']")
    public WebElement h1;

    @FindBy(xpath = "//p[@class='sds-page-section__title--sub signup-block']")
    public WebElement paragraph;

    @FindBy(xpath = "//label[text()='Email]")
    public WebElement emailBox;

    @FindBy(xpath = "//label[text()='Password]")
    public WebElement passwordBox;

    @FindBy(css = ".sds-helper-text")
    public WebElement passwordWarning;

    @FindBy(xpath = "//a[text()='Forgot password?']")
    public WebElement forgotPassword;

    @FindBy(xpath = "//div[@class='sds-disclaimer ']")
    public WebElement signInWarning;

    @FindBy(xpath = "//button[@class='sds-button']")
    public WebElement signButton;



}
