package otherPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int number = 153;
		int originalNumber = number;
		int sum=0;
		int i = 153%10;
		
		while(i!=0)
		{
			
			sum = sum + (i*i*i);
			number = number/10;
			i = number%10;
			
		}
        if(sum == originalNumber)
        {
        	System.out.println("Armstrong");
        }
        else
        {
        	System.out.println("Not Armstrong");
        }
	}

}
