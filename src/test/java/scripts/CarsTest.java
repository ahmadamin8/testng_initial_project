package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarsTest extends Base{
    @Test(priority = 1, description = "Validate Cars.com Sign in page form")
    public void validateCarsSignIn(){
        driver.get("https://www.cars.com/");
        homePage.signInButton.click();
        Assert.assertTrue(signInPage.h1.isDisplayed() && signInPage.h1.getText().equals("Sign in"));
        Assert.assertTrue(signInPage.paragraph.isDisplayed() && signInPage.paragraph.getText().equals("New to Cars.com? Sign up. Are you a dealer?"));
        Assert.assertTrue(signInPage.passwordWarning.isDisplayed() && signInPage.passwordWarning.getText().equals("Minimum of eight characters"));
        Assert.assertTrue(signInPage.forgotPassword.isDisplayed() && signInPage.forgotPassword.isEnabled());
        Assert.assertEquals(signInPage.forgotPassword.getText(), "Forgot password?");
        Assert.assertTrue(signInPage.signInWarning.isDisplayed() && signInPage.signInWarning.getText().equals("By signing in to your profile, you agree to our  Privacy Statement  and  Terms of Service."));
        Assert.assertTrue(signInPage.signButton.isDisplayed());

    }

    @Test(priority = 2, description = "Validate Cars.com Sign in page social media section")
    public void testSocialMedia(){
        driver.get("https://www.cars.com/");
        homePage.signInButton.click();
        Assert.assertTrue(signInPage.h3.isDisplayed() && signInPage.h3.getText().equals("Connect with social"));
        for (int i = 0; i < 2; i++) {
            Assert.assertTrue(signInPage.allSocialMedia.get(0).isDisplayed() && signInPage.allSocialMedia.get(0).isEnabled() && signInPage.allSocialMedia.get(0).getText().equals("Sign in with Facebook"));
            Assert.assertTrue(signInPage.allSocialMedia.get(1).isDisplayed() && signInPage.allSocialMedia.get(1).isEnabled() && signInPage.allSocialMedia.get(1).getText().equals("Sign in with Apple"));
        }
        Assert.assertTrue(signInPage.signWithGoogle.isDisplayed() && signInPage.signWithGoogle.getText().equals("Sign in with Google"));
    }

    @Test(priority = 3, description = "Va;idate user cannot sign in to Cars.com with invalid credentials")
    public void testInvalidCredentials(){
        driver.get("https://www.cars.com/");
        homePage.signInButton.click();
        signInPage.emailBox.sendKeys("johndoe@gmail.com" + Keys.RETURN);
        signInPage.passwordBox.sendKeys("abcd1234" + Keys.RETURN);
        signInPage.signButton.click();
        Assert.assertTrue(signInPage.passwordErrorMessage.isDisplayed() && signInPage.passwordErrorMessage.getText().equals("We were unable to sign you in.\n" +
                "Your email or password was not recognized. Try again soon." ));
    }
}
