class Solution {
    public int[] nextGreaterElements(int[] nums1) {
        int n1 = nums1.length;
        int[] ans = new int[n1];
        for (int i = 0; i < n1; i++) {
            int nge = -1;
            for (int j = i + 1; j < n1  + i; j++) {
                if (nums1[j % n1] > nums1[i]) {
                    nge = nums1[j % n1];
                    break;
                }
            }
            ans[i] = nge;
        }
        return ans;

    }
}
