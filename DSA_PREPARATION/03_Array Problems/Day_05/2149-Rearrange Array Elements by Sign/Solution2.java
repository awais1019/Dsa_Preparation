class Solution {
    public int[] rearrangeArray(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        int postive = 0;
        int negative = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                ans[postive] = nums[i];
                postive += 2;
            }
            else {
                ans[negative] = nums[i];
                negative += 2;
            }

        }
        return ans;
    }
}