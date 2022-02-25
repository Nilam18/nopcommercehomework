import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class TestNG {
WebDriver driver;

 @Test(priority = 1)
   void OpenBrowser()  {
    System.out.println("User able to login");
    WebDriverManager.chromedriver().setup();
    driver =  new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/");

}
        @Test(priority = 2)
        void computer() throws InterruptedException {
    System.out.println("click on computer");
    driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
    Thread.sleep(200);
  ;
    }
        @Test(priority = 3)
        void desktop()throws InterruptedException {
    System.out.println("click on Desktop");
    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")).click();
            Thread.sleep(300);
        }
        @Test(priority = 4)
        void levono()  {
    System.out.println("user click on the computer");
    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
            ;
        }
        @Test(priority = 5)
        void quantity()  {
    System.out.println("type the quantity they want");
    driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_3\"]")).sendKeys("1");

    }
    @Test(priority = 6)
    void addToChart()  {
    System.out.println("Add to cart");
    driver.findElement(By.id("add-to-cart-button-3")).click();
    }

    @Test(priority = 7)
    void shoppingChart() {
    System.out.println("click on shopping cart");
    driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
    }
   @Test(priority = 8)
  void clear() throws InterruptedException {
       System.out.println("type 3 quantity");
       driver.findElement(By.xpath("//*[@id=\"itemquantity11249\"]")).clear();
       Thread.sleep(300);
   }
    @Test(priority = 9)
       void quantityT() {
           driver.findElement(By.xpath("//*[@id=\"itemquantity11249\"]")).sendKeys("3");
       }

    @Test(priority = 10)
    void update()  {
    System.out.println("update shopping chart");
    driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();

    }
   @Test(priority = 11)
    void checkbox() {
    System.out.println("user clicks on check box");
    driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
    }
   @Test (priority = 12)
   void checkout() throws InterruptedException {
    System.out.println("user clicks on checkout");
    driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    Thread.sleep(200);
   }
   @Test(priority = 13)
   void guestCheckout() {
       System.out.println("user checkout as Guest");
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
   }
    @Test(priority = 14)
       void gustDetails() {
        System.out.println("user enters Billing details");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]")).sendKeys("Nilam");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_LastName\"]")).sendKeys("Sharma");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Email\"]")).sendKeys("nsharma18@hotmail.com");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Company\"]")).sendKeys("sharmacompany");
        WebElement address_countryId = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select select = new Select(address_countryId);
        select.selectByVisibleText("United Kingdom");
        WebElement state = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        Select select1 = new Select(state);
        select1.selectByVisibleText("other");
    }
        @Test (priority = 15)
        void address() {
            driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Leicester");
        }
            @Test (priority = 16)
            void address1() {
                driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("123 blue street");
            }
                @Test (priority = 17)
                void address2() {
                    driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("leicester road");
                }
                    @Test (priority = 18)
                    void postcode() {
                        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("le4 6zz");
                    }
                        @Test (priority = 19)
                        void telephone() {
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("07789944561");
    }
    @Test (priority = 20)
    void Continue() {
     System.out.println("Continue");
     driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();

   }
    @Test (priority = 21)
    void shipping() {
        System.out.println("shipping");
        driver.findElement(By.className("button-1 shipping-method-next-step-button")).click();

    }




}

