package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class AddRemoveElements extends BaseTest {

    @Test
    public void addRemoveElements() {


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement buttonAddRemove = driver.findElement(By.xpath("//button[text()='Add Element']"));
        buttonAddRemove.click();
        buttonAddRemove.click();
        List<WebElement> checkButtonDelete = driver.findElements(By.xpath("//button[text()='Delete']"));
        assertEquals(checkButtonDelete.size(), 2, "Количество элементов не совпадает с ожидаемым");
        WebElement buttonsDelete = driver.findElement(By.xpath("//button[text()='Delete']"));
        buttonsDelete.click();
        List<WebElement> checkButtonDeleteAfterRemove = driver.findElements
                (By.xpath("//button[text()='Delete']"));

        assertEquals(checkButtonDeleteAfterRemove.size()
                , 1, "Количество элементов не совпадает с ожидаемым");
    }
}
