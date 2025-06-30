class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int startIndex=windowStartIndex(nums,-1);
        if(startIndex==-1)
        return 0;
        int maxNum=1; int prevNum=0;
        int left=startIndex;
        int rigth=left+1;
        while(rigth<nums.length)
        {
            if(nums[left]==nums[rigth])
            {
               maxNum+=1;
               rigth++;
            }
            else{
                prevNum=Math.max(prevNum,maxNum);
                left=windowStartIndex(nums,rigth);
                if(left==-1)
                return prevNum;
                maxNum=1;
                rigth=left+1;
            }
           
        }
        return Math.max(prevNum,maxNum);

    }

    private int windowStartIndex(int[] nums,int start)
    {
        for(int i=start+1;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                return i;
            }
        }
        return -1;
    }
}