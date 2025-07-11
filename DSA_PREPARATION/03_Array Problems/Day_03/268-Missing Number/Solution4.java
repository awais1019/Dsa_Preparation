class Solution {
    public int missingNumber(int[] nums) {
        int xorIndex = 0;
        int xorNums = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            xorIndex ^= i;       
            xorNums ^= nums[i];  
        }
        xorIndex ^= n;  
        return xorIndex ^ xorNums;  
    }
}
