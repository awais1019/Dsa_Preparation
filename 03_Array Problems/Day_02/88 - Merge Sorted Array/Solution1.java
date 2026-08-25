class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;

        int[] temp = new int[m];
        for (int t = 0; t < m; t++) {
            temp[t] = nums1[t]; 
        }

        int i = 0;  
        int j = 0;  
        int index = 0;  

        while (i < m && j < n) {
            if (temp[i] <= nums2[j]) {
                nums1[index++] = temp[i++];
            } else {
                nums1[index++] = nums2[j++];
            }
        }

        while (i < m) {
            nums1[index++] = temp[i++];
        }

        while (j < n) {
            nums1[index++] = nums2[j++];
        }
    }
}