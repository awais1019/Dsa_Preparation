import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int[] ans = new int[n1];
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int num:nums2) {
          
          while(!stack.isEmpty()&&num>stack.peek())
          {
            map.put(stack.pop(),num);
          }
          stack.push(num);
          
        }
        int index=0;
        for(int num:nums1)
        {
            ans[index++]=map.getOrDefault(num,-1);
        }
        return ans;

    }
}