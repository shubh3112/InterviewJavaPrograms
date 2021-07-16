package stringPrograms;

import java.util.HashSet;

public class DuplicateCharacterString {

	public static void main(String[] args) {

		String s = "aaabbbccc";
		char[] ch = s.toCharArray();
		HashSet<Character> hashset =  new HashSet<>();
		StringBuilder builder = new StringBuilder();
		for(Character c : ch)
		{
			hashset.add(c);
		}
		for(Character chNew :hashset)
		{
			builder.append(chNew);
		}
		System.out.println(builder.toString());
	}

}
