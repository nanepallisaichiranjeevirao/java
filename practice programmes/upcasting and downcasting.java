class A{
 void showDetails(){
System.out.println("this is class a");
float F=23.45f;
int a=(int) F; //type casting (explicit)
int b=10;
double c=a;//(implicit)
System.out.println(b);
System.out.println(c);
System.out.println(F);
System.out.println(a);

}}
class B extends A{
    void showDetails2(){
        System.out.println("this is clas B");

    }
}

public class DownAndUpcasting {
    public static void main(String[] args) {
       A tv=new  B(); // or A tv=(A) new B(); UPCASTING


        tv.showDetails();
        B tv1= (B) tv; //DOWNCASTING
        tv1.showDetails2();
        
    }
    
}
