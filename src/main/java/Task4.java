import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin.net.protocol.jar.CachedJarURLConnection;

import java.util.List;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
      //  driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();

        WebElement order= driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        order.click();

        WebElement selectProduct= driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        selectProduct.sendKeys("Sc");

        WebElement quantity= driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
        quantity.sendKeys("5");

        WebElement name= driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName"));
        name.sendKeys("Techtorial Academy");

        WebElement street= driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2"));
        street.sendKeys("2200 E devon");

        WebElement city= driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3"));
        city.sendKeys("Des Plaines");

        WebElement zip= driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5"));
        zip.sendKeys("60018");

        WebElement card= driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1"));
        card.click();

        WebElement cardid = driver.findElement((By.id("ctl00_MainContent_fmwOrder_TextBox6")));
        cardid.sendKeys("444993876233");

        WebElement date= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        date.sendKeys("03/21");

        WebElement processBtn= driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processBtn.click();


        WebElement text= driver.findElement(By.xpath("//strong"));
        System.out.println(text.getText());


        WebElement viewOrders=driver.findElement(By.xpath("//a[@href='Default.aspx']"));
        viewOrders.click();

        List<WebElement> orderConfirm= driver.findElements(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]"));

        for (WebElement e: orderConfirm){
            System.out.println(e.getText());
        }

// ADDING VALIDATE PART HERE









    }
}
