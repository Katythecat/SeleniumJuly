package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandWebElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");
        WebElement textInput = driver.findElement(By.id("textInput"));
        textInput.clear();
        textInput.sendKeys("Where is my Coffee");

        //     check if the radio button1 is selected
//        if no click on it
//        and confirm if it is selected

        WebElement opt1 = driver.findElement(By.xpath("//input[@value='option1']"));
        if(!opt1.isSelected()){
            opt1.click();
        }
        //confirmation
        System.out.println("the radio button is selected "+ opt1.isSelected());

        //        comfirm that if the radiobutton2 is disabled , by printing out on the console

        WebElement opt2 = driver.findElement(By.xpath("//input[@value='option2']"));
        boolean statusOpt2=opt2.isEnabled();
        System.out.println("opt2 is Enable :"+statusOpt2);

        //        confirm that the radio button3 is not displayed
        WebElement opt3 = driver.findElement(By.xpath("//input[@value='option3']"));
        boolean statusOpt3 = opt3.isDisplayed();
        System.out.println("Option 3 is Displayed : "+ statusOpt3);

        String readingText=driver.findElement(By.id("textElement")).getText();
        System.out.println("we get this text :"+readingText);

        WebElement attribute = driver.findElement(By.id("attributeElement"));
        String att=attribute.getAttribute("data-custom-attribute");
        System.out.println("This is custom attribute :"+att);


    }
}
