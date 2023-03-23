package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceLogin {
	
	public WebDriver driver;
	
	@When("user launch the browser")
	public void user_launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();

	}

	@Given("the salesforce url {string}")
	public void the_salesforce_url(String url) {
		driver.get(url);

	}

	@Then("user enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("Login")).click();
		
	}

}
