class Solution {
    public int[] rearrangeArray(int[] nums) {
        int length=nums.length/2;
        int[] positive=new int[length];
        int[] negative=new int[length];
        int index1=0;
        int index2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
              positive[index1++]=nums[i];
            else 
            negative[index2++]=nums[i];
        }
        int resultIndex = 0;
        for (int i = 0; i < length; i++) {
            nums[resultIndex++] = positive[i];
            nums[resultIndex++] = negative[i];
        }
        return nums;
    }
} 