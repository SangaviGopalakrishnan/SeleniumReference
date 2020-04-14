package comdevmode;
public abstract class ParentClass{
	private static int count;
	private static int count1;

	public ParentClass(int count,int count1){
		this.count=count;
		this.count1=count1;	
	}	
       

	public int getcount() {
		System.out.print(count);
		return count;
	}
	public int getcount1() {
		return count1;
	}
	public int setcount(int count) {
		return this.count= count;
	}
	public int setcount1(int count1) {
		return this.count1= count1;
	}
	
	
	
	
	public abstract int countcalculation();
}



	


