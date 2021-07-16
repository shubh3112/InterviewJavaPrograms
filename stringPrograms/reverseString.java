package stringPrograms;

public class reverseString {

	public static void main(String[] args) {
		String s = "shubham";
		char[] c = s.toCharArray();
		int clength = c.length;
		StringBuilder builder =  new StringBuilder();
		for(int i= clength-1; i>=0;i--)
		{
			builder.append(c[i]);
		}
		System.out.println(builder.toString());

	}

}
