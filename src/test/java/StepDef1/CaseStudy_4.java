package StepDef1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaseStudy_4 {
	WebDriver driver=null;
	  @Given("^url pages is opened$")
	  public void url_pages_is_opened()  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser Drivers_DP\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.manage().window().maximize();
}


	  @Then("^user logins to the page$")
	  public void user_logins_to_the_page() throws Throwable {
	   driver.findElement(By.linkText("SignIn")).click();
	   driver.findElement(By.id("userName")).sendKeys("Lalitha");
	   driver.findElement(By.name("password")).sendKeys("password123"); 
	   driver.findElement(By.xpath("//input[@value='Login']")).click();
	   WebElement search =driver.findElement(By.name("products"));
	   Actions act=new Actions(driver);
	   act.sendKeys(search,"carp");
	   Thread.sleep(2000);
	   act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	   Thread.sleep(2000);
	  }


       @Then("^user makes payment before adding to the cart$")
       public void user_makes_payment_before_adding_to_the_cart() throws Throwable {
	
	     try 
	     {
	      driver.findElement(By.linkText("Cart"));
	     } 
	     catch (Exception e) 
	     {
	     driver.findElement(By.linkText("SignOut")).click();
	     System.out.println("Payment is not possible as the item is not added to cart");
	     }
	   
	}
}
