package day1.week1;

public class IsPrime {

	public static void main(String[] args) {
		int n=29;
		boolean cond = false;
		
		for(int i=2;i<=n/2;++i)
		{
			if(n%i==0)
			{
				cond = true;
				break;
			}
		}
		if(cond!=true)
		{
			System.out.println(n + "is prime number");
		}
		else
		{
			System.out.println(n + "is not prime number");
		}
	}
}