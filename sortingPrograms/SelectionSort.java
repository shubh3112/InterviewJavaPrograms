package sortingPrograms;

public class SelectionSort {

	public static void main(String[] args) {
      int a[] = {12,43,34,54,1};
       int n = a.length;
      for(int i=0; i<n;i++)
      {
    	  int min = i;
    	  for(int j=i+1; j<n;j++)
    	  {
    		  if(a[j]<a[min])
    		  {
    			 min = j;
    		  }
    		  int temp  = a[min];
    		  a[min] = a[i];
    		  a[i]= temp;
     	  }
      }
      for(int i=0;i<a.length;i++)
      {
    	  System.out.println(a[i]);
      }
	}

}
