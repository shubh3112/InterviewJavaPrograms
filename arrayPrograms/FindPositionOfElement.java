package arrayPrograms;

public class FindPositionOfElement {

	public static void main(String[] args) {
		int a[] = {25,26,87,66,3,6,98,12};
		int high = a.length-1;
		int low  = 0;
		int number = 66;
		System.out.println("findPostition of"+findPostion(high,low,number,a));

	}

	private static int findPostion(int high, int low, int number, int[] a) {
		int mid = 0;
		
		while(low<=high)
		{
			mid  = low+(high-low)/2;
			if(a[mid] == number)
			{
				return mid;
			}
			if(number>= a[mid])
			{
				if(a[low]>= number && number>a[mid])
				{
					high = mid-1;
				}
				else
				{
					low = mid+1;
				}
				
			}
			else {
				if(a[low]<= number && number<a[mid])
				{
					high = mid-1;
				}
				else
				{
					low = mid+1;
				}
				
			}
		}
		return mid;
	}

}
