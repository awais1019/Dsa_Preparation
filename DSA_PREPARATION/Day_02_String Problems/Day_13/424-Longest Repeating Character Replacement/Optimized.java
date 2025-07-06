class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxLen=0;
        int left=0;
        int maxFre=0;
        int freq[]=new int[26];
        for(int right=0;right<n;right++)
        {
           int value=s.charAt(right)-'A';
           freq[value]++;
           maxFre=Math.max(maxFre,freq[value]);
          while((right-left+1)-maxFre>k)
           {
              freq[s.charAt(left)-'A']--;  
              left++;
           }
            maxLen=Math.max(maxLen,right-left+1);
        }
       
       return maxLen;
    }
}