package csmd240;

abstract class A1 {
	int x;

	void Name() {
		System.out.println("my name is chiranjeevi");
	}

	abstract void Age();
}

public class A2 extends A1 {

	@Override
	void Age() {
		System.out.println("Age  is: 19 in A2");

	}

	public static void main(String[] args) {
		A2 ad = new A2();
		System.out.println(ad.x);
		ad.Name();
		ad.Age();
	}
}
