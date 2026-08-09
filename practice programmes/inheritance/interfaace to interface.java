interface I1 {
    int a=10;
    
    void method1();
    
}

interface I2 extends I1 {
    int b=20;

    void method2();
    
}

public class Interface1 implements I2 {
        @Override
        public void method1(){
            System.out.println("this is medhod 1 :");
        }

         @Override
        public void method2(){
            System.out.println("this is medhod 2 :");
        }

         public int add(int x ,int y){
            return(x+y);
        }
        public static void main(String[] args){
            Interface1 obj = new Interface1();
            obj.method1();
            obj.method2();
            System.out.println("Result =" + obj.add(a, b));
        }
}
