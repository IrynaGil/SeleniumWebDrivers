package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FormAuthenticationPageTest extends BaseTest {
    private FormAuthenticationPage page;

    @Test
    public void ErrorMessageDisplayedWhenLogInWithInvalidCredentials() {
        page = new FormAuthenticationPage(getDriver());
        page.openURL("http://the-internet.herokuapp.com/login");

        WebElement userNameField = page.getUserNameField();
        assertTrue(page.isElementVisible(userNameField), "Username text field is not found");

        page.enterInputValue(userNameField, "anyname");

        WebElement passWordField = page.getPassWordField();
        assertTrue(page.isElementVisible(passWordField), "Password text field is not found");

        page.enterInputValue(passWordField, "anypass");

        WebElement submitButton = page.getSubmitButton();
        assertTrue(page.isElementVisible(submitButton), "Submit button is not found");

        page.submitForm(submitButton);

        WebElement flashBanner = page.getFlashBanner();
        assertEquals(flashBanner.getAttribute("class"), "flash error", "No error banner");
    }

    @Test
    public void ErrorMessageDisplayedWhenLogInWithEmptyFields() {
        page = new FormAuthenticationPage(getDriver());
        page.openURL("http://the-internet.herokuapp.com/login");

        WebElement userNameField = page.getUserNameField();
        assertTrue(page.isElementVisible(userNameField), "Username text field is not found");

        WebElement passWordField = page.getPassWordField();
        assertTrue(page.isElementVisible(passWordField), "Password text field is not found");

        WebElement submitButton = page.getSubmitButton();
        assertTrue(page.isElementVisible(submitButton), "Submit button is not found");

        page.submitForm(submitButton);

        WebElement flashBanner = page.getFlashBanner();
        assertEquals(flashBanner.getAttribute("class"), "flash error", "No error banner");
    }

    @Test
    public void SuccessMessageDisplayedWhenLogInWithValidCredentials() {
        page = new FormAuthenticationPage(getDriver());
        page.openURL("http://the-internet.herokuapp.com/login");

        WebElement userNameField = page.getUserNameField();
        assertTrue(page.isElementVisible(userNameField), "Username text field is not found");

        page.enterInputValue(userNameField, "tomsmith");

        WebElement passWordField = page.getPassWordField();
        assertTrue(page.isElementVisible(passWordField), "Password text field is not found");

        page.enterInputValue(passWordField, "SuperSecretPassword!");

        WebElement submitButton = page.getSubmitButton();
        assertTrue(page.isElementVisible(submitButton), "Submit button is not found");

        page.submitForm(submitButton);

        WebElement flashBanner = page.getFlashBanner();
        assertEquals(flashBanner.getAttribute("class"), "flash success", "No success banner");
    }
}