import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

       WebDriver driver= new ChromeDriver();
       driver.navigate().to("https://www.amazon.com/");

       String title=driver.getTitle();
        System.out.println("the title of the page is "+title);

        String URL=driver.getTitle();
        System.out.println("the url of this page is "+URL);

        driver.close();


    }
}
