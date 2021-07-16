package otherPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String  s = "abcd";
		String s1 = "bdca";
		int sum1=0,sum2 = 0 ;
	    char[] ch1 =  s.toCharArray();
	    char[] ch2 = s1.toCharArray();
	    for(int i=0; i<ch1.length; i++)
	    {
	    	sum1 = sum1+ ch1[i];
	    }
	    for(int i=0; i<ch2.length; i++)
	    {
	    	sum2 = sum2+ ch2[i];
	    }
	    if(sum1 == sum2)
	    {
	    	System.out.println("Anagram");
	    }
	    else
	    {
	    	System.out.println("Not Anagram");
	    }
		

	}

}
