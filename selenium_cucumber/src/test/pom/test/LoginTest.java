package test.pom.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import test.pom.page.CartPage;
import test.pom.page.FunctionalTest;
import test.pom.page.MenPage;

public class LoginTest extends FunctionalTest {
	@Test
	public void OrderMenClothes() throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/");
		MenPage men = new MenPage(driver);
		men.addMenJacket();
		men.addMenBottom();
		
		CartPage cart = new CartPage(driver);
		cart.gotToCart();
		cart.customerEmail("aaaaa@mail.com");
		cart.customerName("JWS");
		cart.customerLastname("JWS");
		cart.companyName("JWS");
		cart.streetAddr("Jakarta Pusat");
		cart.customerCity("Jakarta");
		cart.regionId("Alaska");
		cart.postalCode("15000");
		cart.phoneNumber("0210000011");
		cart.shippingFee();
		cart.nextBtn();
		cart.checkoutOrder();
		assertEquals("Thank you for your purchase!", cart.confirmationHeader());
	}
	

}
