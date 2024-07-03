package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiDD {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        Select select = new Select(driver.findElement(By.id("multi-select")));
        System.out.println("This select is Multiple : "+select.isMultiple());
        select.selectByIndex(0);
        driver.findElement(By.id("printMe")).click();
        select.deselectByIndex(0);

        List<WebElement> selectOption = select.getOptions();

        for(WebElement options:selectOption){
            String getOption=options.getText();
            System.out.println(getOption);
        }

        select.selectByValue("Florida");
        select.selectByVisibleText("Texas");
        select.selectByIndex(7);
        driver.findElement(By.id("printAll")).click();



    }
}
