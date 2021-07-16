package otherPrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 1534236469;
		 int num1 = reverseInt(num);
		 System.out.println(num1);
				 
		
		

	}

	private static int reverseInt(int num) {
		
		long reverseNumber = 0, remainder=0;
		while(num!=0)
		{
			remainder = num%10;
			reverseNumber = reverseNumber*10+remainder;
			num = num/10;
		}
		if(reverseNumber > Integer.MAX_VALUE || reverseNumber< Integer.MIN_VALUE)
		{
			return 0;
		}
		return  (int) reverseNumber;
	}

}
