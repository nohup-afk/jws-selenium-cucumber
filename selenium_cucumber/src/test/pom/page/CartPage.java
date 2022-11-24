package test.pom.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends BasePage {
	
	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath ="//*[contains(@href,'https://magento.softwaretestingboard.com/checkout/cart/')]")
	private WebElement carticon;
	
	@FindBy(id = "top-cart-btn-checkout")
	private WebElement check_out;
	
	@FindBy(id = "customer-email")
	private WebElement email_addr;
	
	@FindBy(name = "firstname")
	private WebElement first_name;
	
	@FindBy(name = "lastname")
	private WebElement last_name;
	
	@FindBy(name = "company")
	private WebElement company;
	
	@FindBy(name = "street[0]")
	private WebElement street_addr;
	
	@FindBy(name = "city")
	private WebElement city;
	
	@FindBy(name = "region_id")
	private WebElement state;
	
	@FindBy(name = "postcode")
	private WebElement postcode;
	
	@FindBy(name = "country_id")
	private WebElement country;
	
	@FindBy(name = "telephone")
	private WebElement phone_number;
	
	@FindBy(name = "ko_unique_1")
	private WebElement shipping_fee_$5;
	
	@FindBy(css = "#shipping-method-buttons-container > div > button")
	private WebElement btn_next;
	
	@FindBy(css = ".checkout" )
	private WebElement checkout;
	
    @FindBy(tagName = "h1")
    private WebElement header;
	
	public void gotToCart() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(carticon));
		this.carticon.click();
		this.check_out.click();
	}
	
	public void customerEmail(String email) {
		wait.until(ExpectedConditions.elementToBeClickable(email_addr));
		this.email_addr.sendKeys(email);	
	}
	
	public void customerName(String name) {
		this.first_name.sendKeys(name);	
	}
	
	public void customerLastname(String lastname) {
		this.last_name.sendKeys(lastname);	
	}
	
	public void companyName(String company) {
		this.company.sendKeys(company);	
	}
	
	public void streetAddr(String streetaddr) {
		this.street_addr.sendKeys(streetaddr);	
	}
	
	public void customerCity(String city) {
		this.city.sendKeys(city);	
	}
	
	public void regionId(String region) {
		Select regionid = new Select(state);
		regionid.selectByVisibleText(region);
	}
	
	public void postalCode(String postal) {
		this.postcode.sendKeys(postal);
	}

	public void phoneNumber(String phone) {
		this.phone_number.sendKeys(phone);
	}
	
	public void shippingFee() {	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", shipping_fee_$5);
		this.shipping_fee_$5.click();
	}
	
	public void nextBtn() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btn_next));
		this.btn_next.click();
	}
	
	public void checkoutOrder() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(checkout));
		this.checkout.click();
	}
	
    public String confirmationHeader() throws InterruptedException{
    	Thread.sleep(3000);
        return header.getText();
    }
	
}
