package framework.pages;

import org.openqa.selenium.By;

import framework.base.api.ProjectSpecificMethods;

public class ViewPage extends ProjectSpecificMethods{

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
