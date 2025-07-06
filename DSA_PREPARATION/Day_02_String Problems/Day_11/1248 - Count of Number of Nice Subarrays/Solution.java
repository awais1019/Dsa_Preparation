class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
      return atMost(nums, k) - atMost(nums, k-1);
    }

    private int atMost(int[] nums, int k)
    {
        if(k<0)
        return 0;
        int count=0;
        int left=0;
        int odd=0;
        for(int rigth=0;rigth<nums.length;rigth++)
        {
           if(nums[rigth]%2!=0)
           odd++;

           while(odd>k)
           {
             if(nums[left]%2!=0)
             odd--;
             left++;
           }
           count+=(rigth-left+1);

        }
        return count;
    }

}