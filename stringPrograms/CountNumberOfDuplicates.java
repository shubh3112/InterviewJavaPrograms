package stringPrograms;

import java.util.HashMap;

public class CountNumberOfDuplicates {

	public static void main(String[] args) {
		String s = "aaabbbcccdd";
		char[] c = s.toCharArray();
		HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
		for(Character ch : c)
		{
			if(hashMap.containsKey(ch))
			{
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			else
			{
				hashMap.put(ch, 1);
			}
		}
		
		for(Character c1 : hashMap.keySet())
		{
			System.out.println("Character" + " "+ c1 + "Times" + " " + hashMap.get(c1));;
		}

	}

}
