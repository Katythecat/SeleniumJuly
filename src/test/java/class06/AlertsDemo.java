package class06;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement clickbt = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        clickbt.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement button2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        button2.click();
        alert.dismiss();

        WebElement button3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        button3.click();
        alert.sendKeys("I love java");
        alert.accept();


    }
}
