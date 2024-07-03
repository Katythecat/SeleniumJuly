package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Radio {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        List<WebElement> btns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for(WebElement bt:btns){
            String eahcBt=bt.getAttribute("value");
                if(eahcBt.equals("15 - 50")){
                    if(!bt.isSelected()){
                        bt.click();
                        break;
                    }
                }
            }
        driver.findElement(By.xpath("//button[@onclick='getValues();']")).click();
        }
    }

