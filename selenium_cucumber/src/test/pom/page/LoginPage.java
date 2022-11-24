package test.pom.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage  {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath ="//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']")
	private WebElement  signIn;
	
	@FindBy(id = "email")
	private WebElement email_user;
	
	@FindBy(id = "pass")
	private WebElement password_usr;
	
	@FindBy(id = "send2")
	private WebElement btn_signIn;
	
	
	public void userSignIn(String email,String password_id) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Sign In']")));
		this.signIn.click();
		wait.until(ExpectedConditions.elementToBeClickable(btn_signIn));
		this.email_user.clear();
		this.email_user.sendKeys(email);
		
		this.password_usr.clear();
		this.password_usr.sendKeys(password_id);	
	}
	public void clickButtonSignIn() {
		this.btn_signIn.click();
	}

}
