/* Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length. 
Do not allocate extra space for another array, you must do this in place with constant memory
Input:  [1,1,2]
Output: [1,2], length = 2 */

// Note that input array is sorted AND solve with costant memory 
// Don't use Set dummy! I know thats the first thing you thought about.  

public class removeDupes {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null )
            return 0;
      	int len = nums.length;
      	int count=1;
      	for (int i =1;i<len;i++){
      		if(nums[i] != nums[i-1])
      			nums[count++]=nums[i];
      		}	
      	return count;
    }

    public static void main (String args[]){
    	int[] arr = {1,2,2,2,3,4};
    	int output = removeDuplicates(arr);
    	System.out.println("Count ="+output);
    }
}