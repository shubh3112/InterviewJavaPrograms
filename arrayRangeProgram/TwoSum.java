package arrayRangeProgram;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int a[] = {3,3};
		int[] numsRoReturn=new int[2];
		int target  = 6;
		numsRoReturn = twoSum(a,target);
		System.out.println(numsRoReturn.toString());

	}
	 public static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
		    int len = nums.length;
		      
		    for(int i=0; i<len;i++){
		        
		        int sum = target - nums[i];
		        if(a.containsKey(sum)){
		            return new int[]{a.get(sum),i};
		        }
		        a.put(nums[i],i);
		    }
		    throw new IllegalArgumentException("No two sum solution");
	 }

}
