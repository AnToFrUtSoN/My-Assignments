package week1.day3;

public class Calculator {
	public void additionTwoNumber(int a, int b) {
		int c=a+b;
		System.out.println(c);
		}
	
	public void subractionTwoNumber(int e, int f) {
		int d=e-f;
		System.out.println(d);
		}	
	
	public void multipleTwoNumbers(double i, double j) {
		double g=i*j;
		System.out.println(g);

		}
	public void divideTwoNumber(float x, float y) {
		float z=x/y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.additionTwoNumber(15, 15);
		calc.subractionTwoNumber(20, 10);
		calc.multipleTwoNumbers(6.5, 2.5);
		calc.divideTwoNumber(9.6f , 3.5f);
		
	}
}
