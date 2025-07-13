import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
           if(map.get(nums[i])>(nums.length/2))
           return nums[i];
        }
         return -1;
    }
}