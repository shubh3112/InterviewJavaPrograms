package arrayPrograms;

public class MaximumInArray {

	public static void main(String[] args) {
		int  arr [] = {31,15,27,69,101,22,90,102};
		int max = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
