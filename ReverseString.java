package string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Amazon";
		//String str2 = "TestLeaf"
		System.out.println("The Value available in the String is :"+ str);
		char [] st = str.toCharArray();
		
		for(int i=st.length-1;i>=0;i--)
				{
					System.out.print(st[i]);
				}

	}
}
		