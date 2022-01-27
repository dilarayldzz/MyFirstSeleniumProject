import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    /**
     * This class practices getAttribute Method
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement firstNameTextBox = driver.findElement(By.name("firstName"));
        String attrValue = firstNameTextBox.getAttribute("maxlength");
        System.out.println("Attribute value of maxlength is: " + attrValue);
        System.out.println("First name text box element value is: " + firstNameTextBox.getText());
    }
}