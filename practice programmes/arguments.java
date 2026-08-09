package csm240;
public class Methods {
   
   public int add(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        Methods obj = new Methods();
        int sum = obj.add(10, 20);

        System.out.println("Sum = " + sum);
    }
}
*/
package csm240; 

public class Methods {
	void cheak() {
		System.out.println("method cheak 1");
	}
	void nextCheak () {
		System.out.println("2nd method cheak");
	}
	
	public static void main(String[] args) {
		int a = 176453, b= 2; 
	int c = a+b;
		System.out.println("result is" + c);
		Methods md= new Methods();
		md.cheak();
		md.nextCheak();
	}
}

*/

public class Methods {
 
    // Method without parameters and without return value
    void parameters() {
        System.out.println("chiru");
    }

    public static void main(String[] args) {
        Methods pr = new Methods();
        pr.parameters();
    }
}

*/
