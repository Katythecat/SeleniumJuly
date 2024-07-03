package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        Select select=new Select(driver.findElement(By.id("select-demo")));
        select.selectByValue("Sunday");
        Thread.sleep(1000);

        select.selectByVisibleText("Wednesday");
        Thread.sleep(1000);

        select.selectByIndex(2);


    }
}
