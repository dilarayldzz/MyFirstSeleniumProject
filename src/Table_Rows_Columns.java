import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Rows_Columns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement element = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[2]"));
        System.out.println("The author name is: " + element.getText());

    }
}
