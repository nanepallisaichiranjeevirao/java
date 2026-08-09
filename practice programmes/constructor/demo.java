package javacore;

public class ConDemo {
// class or instance variables
	int rollNo;
    String name;
    float fee;
	
	// constructor 
	public ConDemo() { 
	 this.rollNo = 240;
	 this.name= "chiru";
	 this.due= 60999F;
	}
	void sample(){
		System.out.println("ROLL NO is:" + this.rollNo);
		System.out.println("NAME is:" + this.name);
		System.out.println("DUE is:" + this.due);
	}
	void example() {
		System.out.println("some other method named example");
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method..!");
		ConDemo cd = new ConDemo();
		cd.sample();
		cd.example();
	}
		
	}
