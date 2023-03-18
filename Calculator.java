package methodOverloading;

public class Calculator {
	
	public void caladd(int a, int b) {
		System.out.println(a+b);
		}
	
	public void caladd(int a, int b,int c) {
		System.out.println(a+b+c);
		}

	public void calmul(int a, double b,double c) {
		System.out.println(a*b*c);
		}
	
	public void calmul(int a, double b) {
		System.out.println(a*b);
		}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.caladd(10, 10);
		cal.caladd(15,190,100);
		cal.calmul(10, 19.9898,23.8989);
		cal.calmul(10, 14.9982);

	}

}
