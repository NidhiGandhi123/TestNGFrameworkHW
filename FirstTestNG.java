package FirstJavaTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FirstTestNG {
    WebDriver driver;
    @Test(priority = 1)
    void openBrowser() throws InterruptedException {
        System.out.println("Open Browser called");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\IdeaProjects\\testNGFrameworkHW\\src\\test\\resources\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        Thread.sleep(4000);
    // add to cart
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
   // open shopping cart
        Thread.sleep(4000);
        driver.findElement(By.xpath(" /html/body/div[6]/div[4]/div[1]/div[3]/ul/li[4]/a")).click();

        // click update cart
        Thread.sleep(4000);
        driver.findElement(By.id("updatecart")).click();

// check terms and condition
        Thread.sleep(4000);
        driver.findElement(By.id("termsofservice")).click();
      // click on checkout
        Thread.sleep(4000);
      driver.findElement(By.id("checkout")).click();

      // click on checkout as guest
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();

        Thread.sleep(4000);
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Nidhi");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Shah");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("Nidhijgandhi1@gmail.com");
        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Unify Testing LTD.");
      //  driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("233");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]/option[228]")).click();
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("London");
        Thread.sleep(4000);
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("99, xyz street");

        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("xyz pqr");

        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9999999999");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
      //  driver.findElement(By.name("paymentmethod")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();

        driver.findElement(By.id("CardholderName")).sendKeys("Nidhi Parv Shah");
        driver.findElement(By.id("CardNumber")).sendKeys("9999 9999 9999");
        driver.findElement(By.id("CardCode")).sendKeys("999");

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
    }
}

