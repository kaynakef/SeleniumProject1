import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin.net.protocol.jar.CachedJarURLConnection;

import java.util.ArrayList;
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


        String customerName="Techtorial Academy";
        String street="2200 E devon";
        String city="Des Plaines";
        String zip= "60018";
        String card="444993876233";


        WebElement name= driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName"));
        name.sendKeys(customerName);

        WebElement streetE= driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2"));
        streetE.sendKeys(street);

        WebElement cityE= driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3"));
        cityE.sendKeys(city);

        WebElement zipE= driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5"));
        zipE.sendKeys(zip);

        WebElement cardE= driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1"));
        cardE.click();

        WebElement cardid = driver.findElement((By.id("ctl00_MainContent_fmwOrder_TextBox6")));
        cardid.sendKeys(card);

        WebElement date= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        date.sendKeys("03/21");

        WebElement processBtn= driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processBtn.click();


        WebElement text= driver.findElement(By.xpath("//strong"));
        System.out.println(text.getText());


        WebElement viewOrders=driver.findElement(By.xpath("//a[@href='Default.aspx']"));
        viewOrders.click();

        List<WebElement> orderConfirm= driver.findElements(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td"));

        List<String> confirmation = new ArrayList<>();
        confirmation.add(customerName);
        confirmation.add("ScreenSaver");
        confirmation.add("5");
        confirmation.add(street);
        confirmation.add(city);
        confirmation.add(zip);
        confirmation.add("MasterCard");
        confirmation.add(card);
        confirmation.add("03/21");

        for (int i =1 ; i < orderConfirm.size() ; i++) {

          if ( orderConfirm.get(i).getText().equals(confirmation.get(i-1))){
              if(orderConfirm.get(i).getText().equals("05/17/2022")){
                  continue;
              }

              System.out.println("True");
          }
          else
              System.out.println("False");

        }




// ADDING VALIDATE PART HERE









    }
}
