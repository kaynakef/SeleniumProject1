import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
     //   driver.manage().window().maximize();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();

        String link1 = driver.findElement(By.xpath("//ul[@id='ctl00_menu']/li[1]/a")).getAttribute("href");
        System.out.println(link1);
        String expectedHrefValue1 = "Default.aspx";
        System.out.println(link1.contains(expectedHrefValue1) ? "HREF Passed" : "HREF Failed");

        String link2 = driver.findElement(By.xpath("//ul[@id='ctl00_menu']/li[2]/a")).getAttribute("href");
        System.out.println(link2);
        String expectedHrefValue2 = "Products.aspx";
        System.out.println(link2.contains(expectedHrefValue2) ? "HREF Passed" : "HREF Failed");

        String link3 = driver.findElement(By.xpath("//ul[@id='ctl00_menu']/li[3]/a")).getAttribute("href");
        System.out.println(link3);
        String expectedHrefValue3 = "Process.aspx";
        System.out.println(link3.contains(expectedHrefValue3) ? "HREF Passed" : "HREF Failed");

        Thread.sleep(3000);
        driver.quit();

    }
}
