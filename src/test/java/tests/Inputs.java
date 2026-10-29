package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Inputs extends BaseTest {

    @Test
    public void inputs() {

        driver.get("https://the-internet.herokuapp.com/inputs");

        WebElement inputInt = driver.findElement(By.xpath("//input[@type='number']"));
        inputInt.sendKeys("1");
        String valuetInt = inputInt.getAttribute("value");


    }
}
