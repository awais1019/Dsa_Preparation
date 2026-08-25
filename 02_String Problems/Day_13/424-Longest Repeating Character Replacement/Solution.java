import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxLen=0;
        int left=0;
        int maxFre=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++)
        {
           map.put(s.charAt(right),
           map.getOrDefault(s.charAt(right),0)+1);
           maxFre=Math.max(maxFre,map.get(s.charAt(right)));
           if((right-left+1)-maxFre>k)
           {
              map.put(s.charAt(left),
              map.get(s.charAt(left))-1); 
              left++;
           }
           if((right-left+1)-maxFre<=k)
            maxLen=Math.max(maxLen,right-left+1);
        }
       
       return maxLen;
    }
}
