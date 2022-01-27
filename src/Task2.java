import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
        /**
         * This test case is for registering a profile for Mercury Tours
         *
         * @param args
         * @throws Exception
         */
        public static void main(String[] args) throws Exception {
            System.setProperty("webdriver.chrome.driver", "./resources/chromedriver");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/test/newtours/");

            /* clicking on register tab */
            WebElement registerTab = driver.findElement(By.xpath("//a[text()='REGISTER']"));
            registerTab.click();
            Thread.sleep(5000);

            /* entering first name */
            WebElement firstNameTextField = driver.findElement(By.name("firstName"));
            firstNameTextField.sendKeys("Khadija");
            Thread.sleep(5000);

            /* entering last name */
            WebElement lastNameTextField = driver.findElement(By.name("lastName"));
            lastNameTextField.sendKeys("Nasirova");
            Thread.sleep(5000);

            /* entering user name */
            WebElement userNameTextField = driver.findElement(By.id("email"));
            userNameTextField.sendKeys("KN");
            Thread.sleep(5000);

            /* click on submit button */
            WebElement submitButton = driver.findElement(By.name("submit"));
            submitButton.click();
            Thread.sleep(5000);

        }
    }

