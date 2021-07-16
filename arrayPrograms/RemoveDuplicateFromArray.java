package arrayPrograms;

import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {

		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		 if(nums.length == 0)
			 System.out.println(0);
	        int temp = nums[0];
	        int j = 1;
	        for(int i=1;i<nums.length;i++){
	            if(nums[i] == temp)
	                continue;
	            nums[j++] = nums[i];
	            temp = nums[i];
	        }
	        System.out.println(j);
		
		
		
	}

}
