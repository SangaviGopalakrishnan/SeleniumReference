package week5.day2Attributes;

import org.testng.annotations.Test;

public class Priority {

		// TODO Auto-generated method stub
		
		@Test(priority=0)
		public void test1() {
			System.out.println("test1");
		}
		
		@Test(priority=-99)
		public void test2() {
			System.out.println("test2");
		}
		
		@Test
		public void test3() {
			System.out.println("test3");
		}
		
		@Test(priority=3)
		public void test0() {
			System.out.println("test0");
		}


}
