package StepDef1;




	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class CaseStudy_2 {
		 WebDriver driver=null;
		
		@Given("^the Login page is opened$")
		public void the_Login_page_is_opened()  {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers_DP\\chromedriver.exe");
			   driver= new ChromeDriver();
			   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			   driver.manage().window().maximize();
		}

		@When("^users click on signin link$")
		public void users_click_on_signin_link()  {
			driver.findElement(By.linkText("SignIn")).click();
			   System.out.println("the title of the page is"+driver.getTitle());
		}

		@When("^users enters \"([^\"]*)\" and \"([^\"]*)\"$")
		public void users_enters_and(String username, String password) {
			driver.findElement(By.name("userName")).sendKeys(username);
			   driver.findElement(By.id("password")).sendKeys(password);
			   driver.findElement(By.name("Login")).click();
			   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		@Then("^messages displayed Login Successfully$")
		public void messages_displayed_Login_Successfully()  {
			 System.out.println("login success ");
		}
	
}
