import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://dev-mb.yoll.io/Account/Login");

        Task1.loginToMB(driver);

        WebElement expensesTabLink = driver.findElement(By.xpath("//*[contains(text(),'Expenses')]"));
        expensesTabLink.click();
        Thread.sleep(1000);

        boolean isBowlingPresent = driver.findElements(By.xpath("//*[contains(text(),'Bowling')]")).size() > 0;
        System.out.println("Is Bowling expense displayed: " + isBowlingPresent);

        WebElement entireRowTwoElement = driver.findElement(By.xpath("//*[@id='expenses-table']/tbody/tr[2]"));
        String entireRowTwoText = entireRowTwoElement.getText();
        System.out.println(entireRowTwoText);



    }
}
