import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
       driver.findElement(By.xpath("//a[@href='Products.aspx']")).click();
     //  driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();

//View all products

        String expectedSelected = "selected";
        String actualSelected = driver.findElement(By.xpath("//ul[@id='ctl00_menu']/li[2]")).getAttribute("class");
        if (expectedSelected.equals(actualSelected)){
            System.out.println("List of Products IS selected");
        } else {
            System.out.println("List of Products IS NOT selected");
        }


        String expectedHeader = "List of Products";
        String actualHeader = driver.findElement(By.xpath("//h2")).getText();
        if (expectedHeader.equals(actualHeader)){
            System.out.println("List of Products IS selected");
        } else {
            System.out.println("List of Products IS NOT selected");
        }
        String expectedURL = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Products.aspx";
        String actualURL = driver.getCurrentUrl();
        if (expectedURL.equals(actualURL)){
            System.out.println("The URL DOES includes 'Project'");
        } else {
            System.out.println("The URL DOES NOT include 'Project'");
        }
    }
}
