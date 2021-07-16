package arrayPrograms;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		int [] arr = {12,13,14,15};
		int [] intArray;
		intArray = new int[arr.length];
		for(int i = arr.length-1; i>=0; i--)
		{
			intArray[(arr.length-1)-i] = arr[i];
		}
		for(Integer i : intArray)
		{
			System.out.println(i);
		}
	}

}
