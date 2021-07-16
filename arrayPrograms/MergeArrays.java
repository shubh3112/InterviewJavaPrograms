import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MergeArrays {
	// Driver Code
    public static void main (String[] args)
    {
        int a[] = {1,1}, b[] = {1,2};
        int size = a.length;
        int size1 = b.length;
        
        // Function call
       Integer arr1[] = mergeArrays(a, b, size, size1);
       
       System.out.print(Arrays.toString(arr1) + " ");
       System.out.println(takeMiddleOfArr(arr1)); //Prints outout
    }
    
	static Integer[] mergeArrays(int a[], int b[], int n, int m)
    {
       
        // Declaring a map.
        // using map as a inbuilt tool
        // to store elements in sorted order.
        HashMap<Integer,Boolean> mp = new HashMap<Integer,Boolean>();
       
        List<Integer> arrlist= new ArrayList<Integer>();

       
        // Inserting values to a map.
        for(int i = 0; i < n; i++)
        {
            mp.put(a[i], true);
        }
        for(int i = 0;i < m;i++)
        {
            mp.put(b[i], true);
        }
       
        // Printing keys of the map.
        for (Map.Entry<Integer,Boolean> me1 : mp.entrySet())
        {
//            System.out.print(me.getKey() + " ");
        	
            arrlist.add(me1.getKey());
        }
        Integer newarr[] = new Integer[arrlist.size()];
        newarr = arrlist.toArray(newarr);
		return newarr;
		
    }
	public static double takeMiddleOfArr(Integer[] arr1) {
		 double output = 0;
		
        //Initialize output
        if(arr1.length % 2 != 0) { //See if the array is even or odd
            output = arr1[(int)Math.floor(arr1.length/2)]; //If odd just output middle element
        } else {
            double mid = arr1.length/2.0; //Finds middle element of array
            output = (arr1[(int)(mid-1)]+arr1[(int)(mid)])/2.0 ; //If even take avg of middle elements
        }
        
		return output;
	}

}
