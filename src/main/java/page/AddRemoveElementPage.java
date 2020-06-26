package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementPage extends BasePage {
    private final String xPathAddButton = "/html/body/div[2]/div/div/button";
    private final String xPathDeleteButton = "/html/body/div[2]/div/div/div/button[1]";

    public AddRemoveElementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = xPathAddButton)
    private WebElement addButton;

    @FindBy(xpath = xPathDeleteButton)
    private WebElement deleteButton;

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }
}
