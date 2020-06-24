package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuthenticationPage extends BasePage {

    public FormAuthenticationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "username")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passWordField;

    @FindBy(xpath = "/html/body/div[2]/div/div/form/button/i")
    private WebElement submitButton;

    @FindBy(id = "flash")
    private WebElement flashBanner;

    public WebElement getUserNameField() {
        return userNameField;
    }

    public WebElement getPassWordField() {
        return passWordField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getFlashBanner() {
        return flashBanner;
    }
}
