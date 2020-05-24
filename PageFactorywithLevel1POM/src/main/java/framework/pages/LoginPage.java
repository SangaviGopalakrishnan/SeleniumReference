package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.base.api.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID,using ="username")
	WebElement eleUname;
	@FindBy(how = How.ID,using ="password")
	WebElement elepwd;
	@FindBy(how = How.CLASS_NAME,using ="decorativeSubmit")
	WebElement eleclickLogin;
	
	public LoginPage enterUsername(String uname) {
		eleUname.sendKeys(uname);
		return this;
	}

	public LoginPage enterPassword(String pwd) {
		elepwd.sendKeys(pwd);
		return this;
	}
	
	public HomePage clickLogin() {
		eleclickLogin.click();
		return new HomePage();
	}
}
