class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] postMax = new int[n];
        postMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            postMax[i] = Math.max(postMax[i + 1], height[i]);
        }
        int leftMax=height[0];
        int rightMax = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            leftMax = Math.max(leftMax, height[i]);;
            rightMax = postMax[i];
            if (height[i] < leftMax && height[i] < rightMax)
                total += Math.min(leftMax, rightMax) - height[i];
        }
        return total;

    }
}
