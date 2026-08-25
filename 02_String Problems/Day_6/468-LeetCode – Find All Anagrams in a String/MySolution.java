import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result=new ArrayList<>();
        if(p.length()>s.length())
        {
            return result;
        }
        HashMap<Character, Integer> putAnagrams = new HashMap<>();
        int secondStringLength=p.length()-1;
        StringBuilder str=new StringBuilder();
        boolean contains=false;
        for(int left=0,right=secondStringLength;
        right<s.length();left++,right++) 
        {
          
             str.append(s.substring(left, right + 1));
             for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                putAnagrams.put(c, putAnagrams.getOrDefault(c, 0) + 1);
            }
           int j=0;
           contains = true;
           while(j<p.length())
           {
            char c=p.charAt(j);
            if(putAnagrams.containsKey(c))
            {
                putAnagrams.put(c, putAnagrams.get(c) - 1);
                if(putAnagrams.get(c)==0)
                {
                    putAnagrams.remove(c);
                }
                j++;
               
            }
            else {
                contains=false;
                break;
            }
           }
         
           if(contains)
           {
            result.add(left);
            
           
           }
           str.setLength(0);
           putAnagrams.clear();
        }
        
        return result;
    }
} 