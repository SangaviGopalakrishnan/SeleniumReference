package week1.day1;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int operation = 3,a=5,b=2,c;
		
		switch (operation) {
		case 1:
			c=a+b;
			System.out.println("Sum value is "+ c);
			break;
		case 2:
			c=a-b;
			System.out.println("Subtraction value is "+ c);
			break;
		case 3:
			c=a*b;
			System.out.println("Multiplication value is "+ c);
			break;
		case 4:
			c=a-b;
			System.out.println("Divided value is "+ c);
			break;
		default:
			System.out.println("Enter operations from 1 to 4");
			break;
		}
	}

}
