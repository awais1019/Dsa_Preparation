class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];

        for (int i = 0; i < n1; i++) {
            int nge=-1;
            for (int j = n2 - 1; j >= 0; j--) {
                if (nums1[i] == nums2[j])
                    break;
                if (nums2[j] > nums1[i])
                   nge=nums2[j];
            }
            ans[i] = nge;
        }
        return ans;

    }
}
