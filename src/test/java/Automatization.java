import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.List;


public class Automatization
{
    private WebDriver driver;
    private WebDriverWait wait;
    public String target;
    public String secondTarget;


    public void one ()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Program files\\Tools\\chromedriver.exe");
        driver = new ChromeDriver();
        String baseURL = "http://www.google.com";
        driver.manage().window().maximize();
        driver.get(baseURL);
        wait = new WebDriverWait(driver, 10);

        driver.get("http://www.yandex.ru");
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
    }

    public void click(String res )
    {
        driver.findElement(By.linkText(res)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickX( String xPath )
    {
        driver.findElement(By.xpath(xPath)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void send ( String id, String cost)
    {
        driver.findElement( By.id(id)).sendKeys(cost);
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
    }

    public void search ()
    {
        List<WebElement> spisok = driver.findElements(By.xpath("//div[contains(@data-id, 'model-')]"));
        WebElement first= spisok.get(0);
        WebElement title= first.findElement(By.xpath(".//div[contains(@class, 'title')]/a"));
        this.target = title.getText();
        System.out.println(target);
    }

    public void targetSearch ()
    {
        driver.findElement( By.id("header-search")).sendKeys(target);
    }

    public void searchSecond ()
    {
        List<WebElement> spisok = driver.findElements(By.xpath("//div[contains(@data-id, 'model-')]"));
        WebElement first= spisok.get(0);
        WebElement title= first.findElement(By.xpath(".//div[contains(@class, 'title')]/a"));
        this.secondTarget = title.getText();
        System.out.println(secondTarget);
    }

    public void equals()
    {
        if ( target.equals(secondTarget) )
        {
            System.out.println( "Тест выполнен успешно" );
        }
        else
        {
            System.err.println( "Тест выполнен не успешно" );
        }
    }


    public void close ()
    {
        driver.close();
        driver= null;
    }




}