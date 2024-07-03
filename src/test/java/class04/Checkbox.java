package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkbox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement box = driver.findElement(By.id("isAgeSelected"));
        if(!box.isSelected()){
            box.click();
        }

        List<WebElement> multipleBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement boxes:multipleBoxes){
            String chBox=boxes.getAttribute("value");
            if(chBox.equals("Option-3")){
                if(!boxes.isSelected()){
                    boxes.click();
                }
            }


        }
    }
}
