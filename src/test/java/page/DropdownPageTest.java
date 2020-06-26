package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownPageTest extends BaseTest {
    private DropdownPage page;

    @Test
    public void dropdownIsOpenedOnClick() {
        page = new DropdownPage(getDriver());
        page.openURL("http://the-internet.herokuapp.com/dropdown");

        WebElement selectorField = page.getSelectorField();
        assertTrue(page.isElementVisible(selectorField), "No selector found");

        Select options = new Select(selectorField);
        options.selectByVisibleText("Option 1");



    }
}