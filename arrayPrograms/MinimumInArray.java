package arrayPrograms;

public class MinimumInArray {

	public static void main(String[] args) {
		int  arr [] = {31,15,27,69,101,22,90,102};
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);

	}

}
