class Solution {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[cnt++] = nums[i];
            }
        }
        while (cnt < nums.length) {
            nums[cnt++] = 0;
        }
    }
}