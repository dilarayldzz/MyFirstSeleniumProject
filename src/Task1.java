import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void loginToMB (WebDriver driver) throws InterruptedException {
        /* enter username */
        WebElement username = driver.findElement(By.name("usernameOrEmailAddress"));
        username.sendKeys("NorthCarolina");
        Thread.sleep(1000);

        /* enter password */
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("test");
        Thread.sleep(1000);

        /* click on login button */
        WebElement loginButton = driver.findElement(By.id("LoginButton"));
        loginButton.click();
        Thread.sleep(2000);
    }
}
