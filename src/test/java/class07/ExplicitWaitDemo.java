package class07;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static <enabled> void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

        driver.findElement(By.id("show_alert")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        driver.findElement(By.id("changetext_button")).click();
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        String text=driver.findElement(By.xpath("//h2[@id='headingtext']")).getText();
        System.out.println("Retrieved text: " + text); // Debugging line to check the text

        if (text.equals("Ssyntaxtechs")) {
            System.out.println("we see a matching message");
        } else {
            System.out.println("Text does not match. Retrieved text: " + text);
        }


        driver.findElement(By.id("display_button")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Enabled']"))));
        String enabledText = driver.findElement(By.xpath("//button[text()='Enabled']")).getText();
        if(enabledText.equals("Enabled")){
            System.out.println("The hidden button is displayed");
        }else{
            System.out.println("Try again!!!");
        }

        driver.findElement(By.id("checkbox_button")).click();
        wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.id("checkbox"))));
        if(driver.findElement(By.id("checkbox")).isSelected()){
            System.out.println("You are on the right path");
        }else{
            System.out.println("Try again next time");
        }








    }
}
