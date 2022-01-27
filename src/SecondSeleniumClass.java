import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
        //task
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://dev-mb.yoll.io/Account/Login");

        /* enter username */
        WebElement username = driver.findElement(By.name("usernameOrEmailAddress"));
        username.sendKeys("invalidUsernameAddress");
        Thread.sleep(5000);

        /* enter password */
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("invalidPassword");
        Thread.sleep(5000);

        /* click on login button */
        WebElement loginButton = driver.findElement(By.id("LoginButton"));
        loginButton.click();
        Thread.sleep(5000);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        //Does Source code conains Forgot password?
        boolean doesContains = pageSource.contains("Forgot password?");
        System.out.println(doesContains);
        driver.close();

         //*[@class='dt-buttons']/a[2]
        //a[contains(@class,‘buttons-print’)]
        //a[contains(@class,‘buttons-print’)] vs //*[text()=' Print’] vs //*[contains(text(),‘Print’)]
        //a[starts-with(@class,‘dt-button’)] ==> 6 elements will be found
        //a[contains(@class,'pdf') and @aria-controls='expenses-table']
    }
}
