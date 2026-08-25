import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums1) {
        int n = nums1.length;
        int[] ans = new int[n];
        Stack<Integer>stack=new Stack<>();
        for (int i= 2*n-1; i >= 0; i--) {
            while(!stack.isEmpty()&&stack.peek()<=nums1[i%n])
            {
               stack.pop();
            }
            if(i<n)
            {
                ans[i]=stack.isEmpty()?-1:stack.peek();
            }
            stack.push(nums1[i%n]);
           
        
        }
        return ans;

    }
}
