class Solution {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        int[] nums2=new int[length];
        k=k%length;
        for(int i=length-1;i>=0;i--)
        {
           nums2[(i+k)%length]=nums[i];
        }
        for(int i=0;i<length;i++)
        {
            nums[i]=nums2[i];
        }
    }
}