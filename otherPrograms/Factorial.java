package otherPrograms;

public class Factorial {

	public static void main(String[] args) {
		int number  = 5;
		int factorial =1;
		while(number!=0)
		{
			factorial = factorial *number;
			number--;
		}
		System.out.println(factorial);

	}

}
