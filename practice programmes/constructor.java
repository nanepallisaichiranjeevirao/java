package csm240;

public class Construct {
	 int employeeId;
	 String name;  
	 float salary;
	 
	public Construct(int a, String b ,float c) { 
		this.employeeId=a;
		this.name=b;  
		this.salary=c;
	}
	
	public void sample() {
	System.out.println("Testing ");
	System.out.println("employee id is: " + this.employeeId);
	System.out.println("Name is: " + this.name);
	System.out.println("salary is: " + this.salary);
	}


	
	public static void main(String[] args) {
		
		
		Construct ct= new Construct( 240,"chiru",46579.8F);
			ct.sample();
			
			
		
	}

}
