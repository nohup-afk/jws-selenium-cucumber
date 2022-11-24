package test.pom.test;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pom.page.CartPage;
import test.pom.page.MenPage;
public class step {
	public WebDriver  driver;
	public MenPage men;
	public CartPage cart;
	
	@Given("Alice open marketplace")
	public void open_marketplace() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/");
		men = new MenPage(driver);
	}
	
	@Given("she buy men jacket")
	public void add_men_jacket() {
		men.addMenJacket();
		
	}
	
	@Given("she add men yoga pant")
	public void she_add_men_yoga_pant() {
		men.addMenBottom();
		
	}
	
	@Given("she click go to cart")
	public void she_click_go_to_cart() throws InterruptedException {
		cart = new CartPage(driver);
		cart.gotToCart();
	}
	
	@Given("she input email {string}  address")
	public void she_input_email_address(String email) {
		cart.customerEmail(email);
	}
	@Given("she input customer {string} and {string}")
	public void she_customer_name(String name,String lastname) {
		cart.customerName(name);
		cart.customerLastname(lastname);
	}
	
	@Given("she input company credential for shipping address")
	public void input_credential() {
		cart.companyName("JWS");
		cart.streetAddr("Jakarta Pusat");
		cart.customerCity("Jakarta");
		cart.regionId("Alaska");
		cart.postalCode("15000");
		cart.phoneNumber("0210000011");
		
	}
	
	@Given("she select shipping fee")
	public void she_select_shipping_fee() {
		cart.shippingFee();
	}
	
	@When("she click check out order")
	public void she_click_check_out_order() throws InterruptedException {
		cart.nextBtn();
		cart.checkoutOrder();
	}
	
	@Then("she should validated purchasing order")
	public void she_should_validated_purchasing_order() throws InterruptedException {
		assertEquals("Thank you for your purchase!", cart.confirmationHeader());
	}
	
	
	
	
	

}
