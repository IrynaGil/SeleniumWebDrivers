package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenImagesPage extends BasePage {

    public BrokenImagesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/img[1]")
    private WebElement image1;

    @FindBy(xpath = "/html/body/div[2]/div/div/img[2]")
    private WebElement image2;

    @FindBy(xpath = "/html/body/div[2]/div/div/img[3]")
    private WebElement image3;

    public WebElement getImage1() {
        return image1;
    }

    public WebElement getImage2() {
        return image2;
    }

    public WebElement getImage3() {
        return image3;
    }
}
