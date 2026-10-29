package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class Checkboxes extends BaseTest {


    @Test
    public void checkBoxes() {

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> checkBoxElements = driver.findElements(By.cssSelector("[type=checkbox]"));
        assertFalse(checkBoxElements.get(0).isSelected());
        checkBoxElements.get(0).click();
        assertTrue(checkBoxElements.get(0).isSelected());

        assertTrue(checkBoxElements.get(1).isSelected());
        checkBoxElements.get(1).click();
        assertFalse(checkBoxElements.get(1).isSelected());
    }
}
