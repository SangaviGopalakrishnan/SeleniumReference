package week5.day2Attributes;

import org.testng.annotations.Test;

public class dependsOnMethods {

		// TODO Auto-generated method stub
		
		@Test
		public void createLead() {
			System.out.println("createLead");
		}
		
		@Test
		public void mergeLead() {
			System.out.println("mergeLead");
		}
		
		@Test(dependsOnMethods= {"editLead","createLead"})
		public void deleteLead() {
			System.out.println("deleteLead");
		}
		
		@Test(dependsOnMethods="createLead")
		public void editLead() {
			System.out.println("editLead");
		}


}
