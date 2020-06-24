package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageTest extends BaseTest {
    private HomePage page;

    @Test
    public void testGetWelcomeHeading() {
        page = new HomePage(getDriver());
        page.openURL("http://the-internet.herokuapp.com/");

        WebElement welcomeHeading = page.getWelcomeHeading();

        assertTrue(page.isElementVisible(welcomeHeading), "No welcome heading element found");
        assertEquals("Welcome to the-internet", welcomeHeading.getText());
    }
}
