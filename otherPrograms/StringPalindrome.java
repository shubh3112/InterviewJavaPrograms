package otherPrograms;

public class StringPalindrome {

	public static void main(String[] args) {
		String s = "NitiN";
		char[] c = s.toCharArray();
		StringBuilder builder = new StringBuilder();
		for(int i= c.length-1; i>=0; i--)
		{
			builder.append(c[i]);
		}
		System.out.println(builder.toString());
		if(s.equalsIgnoreCase(builder.toString()))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		

	}

}
