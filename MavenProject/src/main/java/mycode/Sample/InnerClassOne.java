package comdevmode;
public class InnerClassOne extends ParentClass{
	private static int count2;
	
	public InnerClassOne(int count, int count1,int count2) {
		super(count, count1);
	    this.count2=count2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int countcalculation() {
		// TODO Auto-generated method stub
		
		System.out.print("hai");
		System.out.print(count2 + "  count2 \n");
		return getcount() * count2 ;

	}


}






