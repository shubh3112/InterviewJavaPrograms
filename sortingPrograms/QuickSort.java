package sortingPrograms;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {21,34,89,34,56,767,23,65};
		int length = a.length;
		
		QuickSort quickSort = new QuickSort();
		quickSort.qucikSortRecursion(a,length-1,0);
		quickSort.printArray(a);
		
	}
		 void qucikSortRecursion(int[]arr, int high,int low) {
			int pi = Partion(arr, high, low);
			
			if(low<pi-1)
			{
				qucikSortRecursion(arr, pi-1, low);
			}
			if(pi<high)
			{
				qucikSortRecursion(arr, high, pi);
			}
		 }
			void printArray(int[]arr)
			{
				for(int i :arr)
				{
					System.out.println(i);
				}
			}
			
		int Partion(int arr[], int high,int low) {
			
			int pivot = arr[(low+high)/2];
			
			while(low<=high)
			{
			System.out.println("low  "+arr[low]);
			while(arr[low]<pivot)
			{
				low++;
			}
			System.out.println("high "+ arr[high]);
			while(arr[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp = arr[low];
				arr[low] = arr[high];
				System.out.println("low  "+arr[low]);
				arr[high]= temp;
				System.out.println("high "+ arr[high]);
				high--;
				low++;
			}
			}
			
			return low;
		}

}