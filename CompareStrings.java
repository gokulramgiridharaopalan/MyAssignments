package string;

public class CompareStrings {

	public static void main(String[] args) {
		String str = "Amazon";
		String str2 = "amazon";
		System.out.println("The Value available in the String is :"+ str);
		System.out.println("The Value available in the String is :"+ str2);
		str =str.toLowerCase();
		str2 =str2.toLowerCase();
		//compare
		boolean equal = str.equals(str2);
		System.out.println(equal);
		
}

}
