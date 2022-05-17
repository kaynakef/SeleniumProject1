import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
        String expectedTitle1 = "Web Orders Login";
        String actualTitle1 = driver.getTitle();
        if (expectedTitle1.equals(actualTitle1)){
            System.out.println("Title Passed");
        } else {
            System.out.println("Title Failed");
        }
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
        String expectedTitle2 = "Web Orders";
        String actualTitle2 = driver.getTitle();
        if (expectedTitle2.equals(actualTitle2)){
            System.out.println("Title Passed");
        } else {
            System.out.println("Title Failed");
        }
        String expectedHeader = "List of All Orders";
        String actualHeader = driver.findElement(By.xpath("//h2")).getText();
        if (expectedHeader.equals(actualHeader)){
            System.out.println("Header Passed");
        } else {
            System.out.println("Header Failed");
        }
        Thread.sleep(5000);
        driver.quit();


    }
}
