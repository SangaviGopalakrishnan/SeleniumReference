package design;

import org.openqa.selenium.WebElement;

public interface Element {

	public String getWebElementText(WebElement ele);
	
	public void enterText(WebElement ele,String keyvalue);

	public WebElement locateElement(String locator,String locatorvalue);
	
	public void clickElement(WebElement ele);

}