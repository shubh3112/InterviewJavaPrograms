package otherPrograms;

public class IntegerPalindrome {

	public static void main(String[] args) {
		int num  = -151;
		int numNew = num;
		int  reverseNumber = 0,remainder=0;
		while(num!=0)
		{
			remainder = num%10;
			reverseNumber = reverseNumber*10+remainder;
			num = num/10;
			
		}
		if(reverseNumber == numNew)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		

	}

}
