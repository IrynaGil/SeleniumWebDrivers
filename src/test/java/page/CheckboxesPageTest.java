package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckboxesPageTest extends BaseTest {
    private CheckboxesPage page;

    @Test
    public void CheckBoxIsMarkedAndUnmarkedAfterClick() {
        page = new CheckboxesPage(getDriver());
        page.openURL("http://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox1 = page.getCheckBox1();
        assertTrue(page.isElementVisible(checkBox1), "Check box 1 is not found");

        page.clickOnElement(checkBox1);
        assertTrue(page.isElementSelected(checkBox1),"Check box 1 is not marked");

        WebElement checkBox2 = page.getCheckBox2();
        assertTrue(page.isElementVisible(checkBox2), "Check box 2 is not found");

        page.clickOnElement(checkBox2);
        assertFalse(page.isElementSelected(checkBox2),"Check box 2 is still marked");
    }
}