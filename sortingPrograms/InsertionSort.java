package sortingPrograms;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 54,12, 43, 34, 35, 98, 1 };
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;

		}
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
