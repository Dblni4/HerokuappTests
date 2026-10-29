package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Inputs extends BaseTest {

    @Test
    public void inputs() {

        driver.get("https://the-internet.herokuapp.com/inputs");

        WebElement inputInt = driver.findElement(By.xpath("//input[@type='number']"));

        inputInt.sendKeys("1");
        String valuetInt = inputInt.getAttribute("value");
        assertEquals(valuetInt, "1");

        inputInt.sendKeys(Keys.ARROW_UP);
        valuetInt = inputInt.getAttribute("value");
        assertEquals(valuetInt, "2");

        inputInt.clear();

        inputInt.sendKeys(Keys.ARROW_DOWN);
        valuetInt = inputInt.getAttribute("value");
        assertEquals(valuetInt, "-1");

        inputInt.clear();

        inputInt.sendKeys("abcd");
        valuetInt = inputInt.getAttribute("value");
        Assert.assertEquals(valuetInt,"","Введите целое число");
    }
}
