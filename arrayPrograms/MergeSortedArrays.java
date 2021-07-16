
public class MergeSortedArrays {

	public static void main(String[] args) {
		 int arr1[] = {3}, arr2[] = {-2,-1 };
		 double output = 0;
	     int n1 = arr1.length;
	     int n2 = arr2.length;
	     int[] arr3 = new int[n1+n2];
	        // Traverse both array
	     int i = 0, j = 0, k = 0;
	        while (i<n1 && j <n2)
	        {
	            // Check if current element of first
	            // array is smaller than current element
	            // of second array. If yes, store first
	            // array element and increment first array
	            // index. Otherwise do same with second array
	            if (arr1[i] < arr2[j])
	                arr3[k++] = arr1[i++];
	            else
	                arr3[k++] = arr2[j++];
	        }
	     
	        // Store remaining elements of first array
	        while (i < n1)
	            arr3[k++] = arr1[i++];
	     
	        // Store remaining elements of second array
	        while (j < n2)
	        {
	            arr3[k++] = arr2[j++];
	        }
	        if(arr3.length % 2 != 0) { //See if the array is even or odd
	            output = arr3[(int)Math.floor(arr3.length/2)]; //If odd just output middle element
	        } else {
	            double mid = arr3.length/2.0; //Finds middle element of array
	            output = (arr3[(int)(mid-1)]+arr3[(int)(mid)])/2.0 ; //If even take avg of middle elements
	        }
	         System.out.println(output);
	}
}
