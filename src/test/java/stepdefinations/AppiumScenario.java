package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Hook;

import static java.time.Duration.ofSeconds;


public class AppiumScenario {

	private WebDriver driver;



	public AppiumScenario() {
		this.driver = Hook.getDriver();

	}

	//Scenario 1

	@Given("^I open the application$")
	public void i_open_the_application() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Enterprise']")).isDisplayed());
	}

	@When("^I tap on Entreprise$")
	public void i_tap_on_Entreprise() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Enterprise']")).click();
	}

	@Then("^I select button Next$")
	public void i_select_button_Next() throws Throwable {
		driver.findElement(By.xpath("//*[@text='Next']")).click();
	}

	//Scenario 2

	@Given("^I validate username textfield$")
	public void i_validate_username_textfield() throws Throwable {
		Assert.assertTrue(driver.findElement(By.id("com.motorolasolutions.wave:id/activitymain_edit_username")).isDisplayed());
	}

	@When("^I tap on username field$")
	public void i_tap_on_username_field() throws Throwable {
		driver.findElement(By.id("com.motorolasolutions.wave:id/activitymain_edit_username")).click();
	}

	@Then("^I type username$")
	public void i_type_username() throws Throwable {
		driver.findElement(By.id("com.motorolasolutions.wave:id/activitymain_edit_username")).sendKeys("testdev1@latvia");
	}

	//Scenario 3

	@Given("^I validate password textfield$")
	public void i_validate_password_textfield() throws Throwable {
		Assert.assertTrue(driver.findElement(By.id("com.motorolasolutions.wave:id/activitymain_edit_password")).isDisplayed());
	}

	@When("^I tap on password field$")
	public void i_tap_on_password_field() throws Throwable {
		driver.findElement(By.id("com.motorolasolutions.wave:id/activitymain_edit_password")).click();
	}

	@Then("^I type password$")
	public void i_type_password() throws Throwable {
		driver.findElement(By.id("com.motorolasolutions.wave:id/activitymain_edit_password")).sendKeys("latvia12#");
	}

	//Scenario 4

	@Given("^I scroll down to validate server textfield$")
	public void i_scroll_down_to_validate_server_textfield() throws Throwable {

		//driver.findElement(By.id("com.motorolasolutions.wave:id/activitymain_edit_server")).click();

		new TouchAction((PerformsTouchActions) driver).press(1153, 1303).waitAction(ofSeconds(1)).moveTo(1130, 1100).release().perform();


	}

		@When("^I tap on server field$")
		public void i_tap_on_server_field () throws Throwable {
			driver.findElement(By.id("com.motorolasolutions.wave:id/activitymain_edit_server")).click();
		}

		@Then("^I type server address$")
		public void i_type_server_address () throws Throwable {
			driver.findElement(By.id("com.motorolasolutions.wave:id/activitymain_edit_server")).sendKeys("wave5000.com");
		}

	@Then("^I scroll down to validate Sign in button$")
	public void i_scroll_down_to_validate_Sign_in_button() throws Throwable {
		//pirmās koordinātes ir beigu - otrās ir sākuma
		new TouchAction((PerformsTouchActions) driver).press(1189, 1370).waitAction(ofSeconds(1)).moveTo(1146, 722).release().perform();
	}

		@Then("^I select Sign In$")
		public void i_select_Sign_In () throws Throwable {
			driver.findElement(By.id("com.motorolasolutions.wave:id/activitymain_button_sign_in")).click();
		}
	}





