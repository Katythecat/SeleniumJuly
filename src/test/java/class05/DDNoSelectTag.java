package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DDNoSelectTag {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");
        driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']")).click();
        List<WebElement> ddOption = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for (WebElement dd : ddOption) {
            String country = dd.getText();
            if (country.equals("Peru")) {
                dd.click();
                break;
            }
        }
    }
}