public class Main {
   
   
public static void main(String[] args) {
    
class first{
	int x = 40;
	
	float calc_si(float p, int t, float r) {
		float s = (p*t*r)/100;
		return s;
	}
}

class second extends first {
	
	@Override
	float calc_si(float p, int t, float r) {
		float s = (p*t*r)/10;
		return s;
	}
     void acess(){
         
        float result = calc_si(50000,4,3.15f);
        system.out.println("simple intrest is "+result);
     }
