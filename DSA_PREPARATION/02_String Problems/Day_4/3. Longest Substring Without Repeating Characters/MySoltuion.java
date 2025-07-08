import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<String,Integer>map=new HashMap<>();
        if(s.length()<=0)
        {
            return 0;
        }
        int length=1;
        StringBuilder str=new StringBuilder();
        str.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
           str.append(s.charAt(i));
           if(checkValidSubstring(str.toString()))
           {
             map.put(str.toString(),str.length());
           }
           else {
              str.deleteCharAt(0);
           }
        }
        if(!map.isEmpty())
        {
         length= Collections.max(map.values()); 
        }
        
        return length;
    }
    private boolean checkValidSubstring(String s)
    {
           HashMap<Character,Integer>map=new HashMap<>();
           for (char ch:s.toCharArray())
           {
            map.put(ch,map.getOrDefault(ch,0)+1);
           }
           if (map.isEmpty()) return true;
         
           return Collections.max(map.values())<=1;
    }
}