package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AddRemoveElementPageTest extends BaseTest {
    private AddRemoveElementPage page;

    @Test
    public void clickOnDeleteButtonShouldAddAndRemoveDeleteButton() {
        page = new AddRemoveElementPage(getDriver());
        page.openURL("http://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = page.getAddButton();
        assertTrue(page.isElementVisible(addButton), "No add button found");

        page.clickOnElement(addButton);

        WebElement deleteButton = page.getDeleteButton();
        assertTrue(page.isElementVisible(deleteButton), "No delete button found");

        page.clickOnElement(deleteButton);

        assertFalse(page.isElementVisible(deleteButton), "Delete button still present");
    }
}
