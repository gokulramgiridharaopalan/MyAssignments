package day1.week1;

public class Fibbinocci {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum = 0;
		int n = 11;
		for (int i=1;i<=n;i++)
		{
			 System.out.println(n1);
			sum = n1+n2;
			n1=n2;
			n2=sum ;
			 
		}
		
            
	}

}
