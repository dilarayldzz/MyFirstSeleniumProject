import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Go to website number 1 of your choice using get() method
           driver.get("https://codeboard.io/users/dilarayldz");


    }
}
