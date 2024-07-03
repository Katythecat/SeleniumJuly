package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Handles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AaSxoQy4kLcUiWijJfCQzeB8s0Q3dSPHEksxxa7gW0_XR5Q7dFlndbXsquT2WHbojUDuIT7y7VgPvQ&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1072932938%3A1715445066972666&ddm=0");
        String window1 = driver.getWindowHandle();
        System.out.println("Window 1:"+window1);

        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();
        driver.findElement(By.linkText("Terms")).click();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Loop through all window handles
        for (String handle : allWindows) {
            // Switch to each window
            driver.switchTo().window(handle);

            // Check the title of the current window
            if (driver.getTitle().equals("Google Account Help")) {
                // Start working on the desired window
                WebElement searchBar = driver.findElement(By.name("q"));
                searchBar.sendKeys("How to reset password");
                searchBar.sendKeys(Keys.ENTER);
                break; // Exit the loop once the desired window is found and action is performed
            }
        }

        driver.switchTo().window(window1);
        if(driver.getTitle().equals("Gmail")){
            WebElement login = driver.findElement(By.name("identifier"));
            login.sendKeys("kk.wilasinee@gmail.com");
            login.sendKeys(Keys.ENTER);
        }




    }


    }

