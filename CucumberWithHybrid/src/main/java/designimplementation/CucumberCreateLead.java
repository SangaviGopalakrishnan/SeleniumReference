package designimplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import design.Browser;
import design.Element;

public class CucumberCreateLead implements Element,Browser{

	public static RemoteWebDriver driver;

	public void launchBrowser(String browser, String url) {
		try {
			switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				break;
			}

		} catch (Exception e) {
			System.out.println("Browseralunch failed");
		}
	}

	public void getCurrentBrowserTitle() {
		driver.getTitle();
	}


	public String getWebElementText(WebElement ele) {
		
		return ele.getText();
	}

	public void enterText(WebElement ele, String keyvalue) {
		ele.sendKeys(keyvalue);
	}

	public WebElement locateElement(String locator, String locatorvalue) {
		try {
			switch (locator.toLowerCase()) {
			case "id": return driver.findElementById(locatorvalue);
			case "name" : return driver.findElementByName(locatorvalue);
			case "classname" : return driver.findElementByClassName(locatorvalue);
			case "linktext" : return driver.findElementByLinkText(locatorvalue);
			case "partiallinktext" : return driver.findElementByPartialLinkText(locatorvalue);
			case "tagname" : return driver.findElementByTagName(locatorvalue);
			case "xpath" : return driver.findElementByXPath(locatorvalue);
			case "cssselector" : return driver.findElementByCssSelector(locatorvalue);
			}

		} catch (Exception e) {
			System.out.println("locateElement done");
		}
		return null;
		
	}


	public void closeBrowser() {
		driver.close();
	}

	@Override
	public void clickElement(WebElement ele) {
		ele.click();
	}

}
