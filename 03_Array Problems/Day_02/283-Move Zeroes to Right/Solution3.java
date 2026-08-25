class Solution {

    public void moveZeroes(int[] nums) {
        int left = 0;

        while (left < nums.length && nums[left] != 0) {
            left++;
        }

        for (int right = left + 1; right < nums.length; right++) {
            if (nums[right] != 0) {

                nums[left++] = nums[right];
                nums[right] = 0;
            }
        }
    }
}
