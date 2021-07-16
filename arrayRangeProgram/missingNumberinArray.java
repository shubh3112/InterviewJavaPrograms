package arrayRangeProgram;

import java.util.Arrays;

public class missingNumberinArray {

	public static void main(String[] args) {
		int[] arr = {3, 4,5,1, 2, 6,8,9,10};
		Arrays.sort(arr);
		int n = arr.length+1;
		int sum_elements =n * (n + 1) / 2;
		int sum = 0;
		for(int j=0; j<arr.length;j++)
		{
			sum= sum+arr[j];
		}
		System.out.println(sum_elements-sum);
//		for(int i=0;i<arr.length;i++)
//		{
//			if(i+1 != arr[i])
//			{
//				System.out.println(i+1);
//				break;
//			}
//		}

	}

}
