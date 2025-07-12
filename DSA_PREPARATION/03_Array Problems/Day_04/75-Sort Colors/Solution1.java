class Solution {
    public void sortColors(int[] nums) {
        int zeros=0;
        int ones=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            zeros++;
            else if(nums[i]==1)
            ones++;
        }
        int i=0;
        while(i<zeros)
        {
            nums[i++]=0;
        }
          while (i < zeros + ones)
        {
            nums[i++]=1;
        }
        while(i<nums.length)
        {
            nums[i++]=2;
        }
    }
}