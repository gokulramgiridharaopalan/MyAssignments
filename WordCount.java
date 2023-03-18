package string;

public class WordCount {

	public static void main(String[] args) {
		String s1= "Gokulramg";
		//output - how many times g is occuring
        //expected character is g
		s1=s1.toLowerCase();
		char expchar = 'g';
		int count=0;
		char[] ch =s1.toCharArray();
		for (int i =0;i<ch.length;i++)
		{
			if(ch[i]==expchar)
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println("The letter G occuring int the String is :"+ count);
		}
	}

}
