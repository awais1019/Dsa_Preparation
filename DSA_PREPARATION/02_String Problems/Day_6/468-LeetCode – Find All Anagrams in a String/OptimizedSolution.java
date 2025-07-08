import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result=new ArrayList<>();
        if(p.length()>s.length())
        {
            return result;
        }
       int sFrequency[]=new int[26];
       int pFrequency[]=new int[26];
       for(char c:p.toCharArray())
       {
         pFrequency[c-'a']++;
       }
       for(int i=0;i<p.length();i++)
       {
         sFrequency[s.charAt(i)-'a']++;
       }
       if(Arrays.equals(pFrequency,sFrequency)) result.add(0);
       int left=0;
       int right=p.length();
       while(right<s.length())
       {
         sFrequency[s.charAt(right)-'a']++;
         sFrequency[s.charAt(left)-'a']--;
        
        
         if(Arrays.equals(sFrequency,pFrequency)) result.add(left+1);
         left++;
         right++;
       }
        
        return result;
    }
} 
    

