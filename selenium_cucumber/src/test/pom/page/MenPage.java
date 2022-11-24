package test.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenPage extends BasePage {
	public MenPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@href='https://magento.softwaretestingboard.com/men.html']")
	private WebElement men_html;
	
	@FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/men/tops-men.html']")
	private WebElement top_men_html;
	
	@FindBy(xpath = "//*[text()='Category']")
	private WebElement category;
	
	@FindBy(xpath = "//a[contains(text(),'Jackets')]")
	private WebElement men_jacket;
	
	@FindBy(xpath = "//a[contains(text(),'Pants')]")
	private WebElement men_pants;
	
	@FindBy(xpath="//*[contains(text(),'Proteus Fitness Jackshirt')]")
	private	WebElement Proteus_Fitness_Jackshirt;
	
	@FindBy(xpath="//*[contains(text(),'Cronus Yoga Pant')]")
	private	WebElement Cronus_Yoga_Pant;
	
	@FindBy(xpath="//*[@option-tooltip-value='S']")
	private	WebElement size_s;
	
	@FindBy(xpath="//*[@option-tooltip-value='32']")
	private	WebElement size_32;
	
	@FindBy(xpath="//*[@option-tooltip-value='#000000']")
	private	WebElement color_black;
	
	@FindBy(id="product-addtocart-button")
	private	WebElement add_to_cart;
	
	public void addMenJacket() {
		wait.until(ExpectedConditions.elementToBeClickable(men_html));
		this.men_html.click();
		wait.until(ExpectedConditions.elementToBeClickable(men_jacket));
		this.men_jacket.click();	
		this.Proteus_Fitness_Jackshirt.click();
		wait.until(ExpectedConditions.elementToBeClickable(size_s));
		this.size_s.click();
		this.color_black.click();
		this.add_to_cart.click();	
	}
	
	
	public void addMenBottom() {
		wait.until(ExpectedConditions.elementToBeClickable(men_html));
		this.men_html.click();
		wait.until(ExpectedConditions.elementToBeClickable(men_pants));
		this.men_pants.click();	
		this.Cronus_Yoga_Pant.click();
		wait.until(ExpectedConditions.elementToBeClickable(size_32));
		this.size_32.click();
		this.color_black.click();
		this.add_to_cart.click();	
	}

}
