import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumJavaClass {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/downloads/");
        Thread.sleep(2000);

        String title = driver.getTitle();
        System.out.println(title);

        driver.close();
        /* this operation will maximize your window */
        driver.manage().window().maximize();
        /* this operation will get the title of your website */
        System.out.println("Website title is: " + driver.getTitle());
        /* this operation will get the URL of your website */
        System.out.println("Website URL is: " + driver.getCurrentUrl());
        /* this operation will close your browser */
        driver.close();





    }
}
