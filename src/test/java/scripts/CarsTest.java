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
        Assert.assertTrue(signInPage.passwordWarning.isDisplayed() && signInPage.passwordWarning.getText().equals("By signing in to your profile, you agree to our  Privacy Statement  and  Terms of Service."));
        Assert.assertTrue(signInPage.signButton.isDisplayed());

    }
}
