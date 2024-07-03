package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IframeDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe.php");
        // handle iframe with switch to frame
//        1. byIndex
//        2. nameorID
//        3. webElement
//        driver.switchTo().frame(0); //by index

//        driver.switchTo().frame("textfield-iframe"); by name
        driver.switchTo().frame("textfieldIframe"); // by id
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("Iframe");

        driver.switchTo().frame("checkboxIframe");
        driver.findElement(By.xpath("//input[@class='cb1-element']")).click();

//        we will deal with another iframe, so we need to switch back to main
        driver.switchTo().defaultContent();

        driver.switchTo().frame("dropdownIframe");
        Select select=new Select(driver.findElement(By.id("animals")));
        select.selectByIndex(0);

        driver.switchTo().defaultContent();

        // want to go back to nested frame by inner frame

        // 1.we need to switch to outer frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Text Field']")));
        // 2. then switch to inner frame
        driver.switchTo().frame("checkboxIframe");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();


    }
}
