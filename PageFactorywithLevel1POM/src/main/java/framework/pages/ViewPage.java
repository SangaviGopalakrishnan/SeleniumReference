package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.base.api.ProjectSpecificMethods;

public class ViewPage extends ProjectSpecificMethods{

	public  ViewPage() {
		PageFactory.initElements(driver, this);
	}
	public ViewPage FNameCheck(String fname) {
		String text = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if (text.contains(fname)) {
			System.out.println("Created Lead");
		} else {
			System.out.println("Lead Not Created");
		}
		return this;
	} 

}
