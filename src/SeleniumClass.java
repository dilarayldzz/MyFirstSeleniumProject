import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {
    public static void main(String[] args) {
        //Homework

        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Go to google using navigate method
        driver.navigate().to("https://www.google.com/");
        //Go to uber.com
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("uber.com"+Keys.ENTER);
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("title = " + title);
        // back to previous webpage
        driver.navigate().back();
        //Print url
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        //pageMaximize the window
        driver.manage().window().maximize();
        //Close the browser
        driver.close();


//        driver.get("https://www.google.com/");
//        String title = driver.getTitle();
//        System.out.println("title = " + title);
//        // driver.findElement(By.xpath("//input[@name='q']")).sendKeys("dilara"+Keys.ENTER);
//        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
//       // searchBox.sendKeys("Dilara Yildiz"+ Keys.ENTER);
//        searchBox.sendKeys("Dilara");
//       // driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
//        WebElement searchClick = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
//        searchClick.click();
//
//        driver.manage().window().maximize();
//        driver.navigate().back();
//        driver.navigate().to("https://www.google.com/"); //same with driver.get
//        driver.navigate().refresh();
//        driver.navigate().forward();
//        driver.close();



    }
}
