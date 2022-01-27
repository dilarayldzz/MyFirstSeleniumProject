import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
    /**
     * This method practices isEnabled() method
     * @param args
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.wufoo.com/html5/disabled-attribute/?");

        WebElement textInputBox = driver.findElement(By.xpath("//input[contains(@value,'touch this')]"));
        WebElement textAreaBox = driver.findElement(By.xpath("//textarea[contains(text(),'or can you')]"));

        boolean isTextInputBoxEnabled = textInputBox.isEnabled();
        boolean isTextAreaBoxEnabled = textAreaBox.isEnabled();

        System.out.println("Is text input box enabled? " + isTextInputBoxEnabled);
        System.out.println("Is text area box enabled? " + isTextAreaBoxEnabled);
    }
}
