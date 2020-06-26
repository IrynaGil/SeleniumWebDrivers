package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BrokenImagesPageTest extends BaseTest {
    private BrokenImagesPage page;

    @Test
    public void checkImageStatus() {
        page = new BrokenImagesPage(getDriver());
        page.openURL("http://the-internet.herokuapp.com/broken_images");

        WebElement image1 = page.getImage1();
        assertTrue(page.isImageBroken(image1), "Image 1 is not broken");

        WebElement image2 = page.getImage2();
        assertTrue(page.isImageBroken(image2), "Image 2 is not broken");

        WebElement image3 = page.getImage3();
        assertFalse(page.isImageBroken(image3), "Image 3 is broken");
    }
}