package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSReal {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        driver.findElement(By.cssSelector("#profileID")).sendKeys("Cat");
        driver.findElement(By.cssSelector("#profileBox")).sendKeys("Dump");
        driver.findElement(By.cssSelector(".form-control.feedbackBox1")).sendKeys("Lisa");


    }
}
