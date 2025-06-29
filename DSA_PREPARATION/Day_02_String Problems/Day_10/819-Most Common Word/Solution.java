import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words=paragraph.toLowerCase().split("[^a-z]+");
        Set<String> set=new HashSet<>((Arrays.asList(banned)));
        Map<String,Integer> map=new HashMap<>();
        for (int i=0;i<words.length;i++)
        { 
            String word=words[i];
            if(!set.contains(word))
            {
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
       String res="";
       int max=0;
       for(Map.Entry<String,Integer> entry:map.entrySet())
       {
         if(entry.getValue()>max)
         {
           max=entry.getValue();
           res=entry.getKey();
         }
       }
    
    return res;
        


    }
}