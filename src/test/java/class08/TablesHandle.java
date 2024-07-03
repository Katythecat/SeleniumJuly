package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
//
//        print all the row of the table without header
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        for(WebElement row:tableRows){
            System.out.println(row.getText());
        }
//        print all the row that have status in progress
//        print all the row of the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
//        we read through the row of the table specific to column 4 because we need to get status in progress
        int count =0;
        for(WebElement column : columns){
            if(column.getText().equals("in progress")){
                System.out.println("The row number is "+(count+1));
//                count + 1 is used because count is zero-based (it starts from 0), but row numbers in the table are typically one-based (start from 1).
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + (count+1) + "]"));
                System.out.println(row.getText());
            }
            count++;
        }
    }
}
