class Solution {
    public int strStr(String haystack, String needle) {
      if(needle.length()>haystack.length())
      {
        return -1;
      }
      int left=0;
      int right=needle.length();
      while(left<=haystack.length()-needle.length())
      {
        if(haystack.substring(left,right).equals(needle))
        {
            return left;
        }
        left++;
        right++;
      }
   
      return -1;
    }
}