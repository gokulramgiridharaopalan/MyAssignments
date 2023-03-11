package day2.week1;

public class ArrayIntersection {

	public static void main(String[] args) {
		
		int [] num = {3,2,11,4,6,7};
		int [] num1 = {1,2,8,4,9,7};
		int len1 = num.length;
		int len2 = num1.length;
		
		System.out.println("Intersection of two arrays are :");
		
		for (int i =0;i<len1;i++)
		{
			
			for(int j=0;j<len2;j++)
			{
				
				if(num[i]==num1[j])
				{
					System.out.println(num1[j]);
			}
		}

	}

}
	
}

