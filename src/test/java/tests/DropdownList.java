package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class DropdownList extends BaseTest {

    @Test
    public void dropdownList() {

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdownMenu = driver.findElement(By.id("dropdown"));
        dropdownMenu.click();
        Select select = new Select(dropdownMenu);
        List<WebElement> options =  select.getOptions();
        assertEquals(options.size(), 3, "Количество элементов не совпадает с ожидаемым");
        select.selectByIndex(1);
        assertTrue(options.get(1).isSelected());
        select.selectByIndex(2);
        assertTrue(options.get(2).isSelected());
        assertFalse(options.get(1).isSelected());
    }
}