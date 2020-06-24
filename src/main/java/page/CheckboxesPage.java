package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage extends BasePage {

    public CheckboxesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/form/input[1]")
    private WebElement checkBox1;

    @FindBy(xpath = "/html/body/div[2]/div/div/form/input[2]")
    private WebElement checkBox2;

    public WebElement getCheckBox1() {
        return checkBox1;
    }

    public WebElement getCheckBox2() {
        return checkBox2;
    }
}
