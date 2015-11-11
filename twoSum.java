/*
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/


public class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
      
        HashMap<Integer,Integer> hmap =new HashMap<Integer,Integer>();
        
        for(int i=0 ; i<nums.length; i++)
        {
            int b = target - nums[i];
            
            if(hmap.containsKey(b))
            {
                int returnArray[] = {hmap.get(b)+1,i+1};
                return returnArray;
            }
            hmap.put(nums[i],i);
        }
        return null;
        
    }
}


/*
O(n) runtime, O(n) space – Hash table:

We could reduce the runtime complexity of looking up a value to O(1) using a hash map that maps a value to its index.
*/