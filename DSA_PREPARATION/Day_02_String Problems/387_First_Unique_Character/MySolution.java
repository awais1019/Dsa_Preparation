import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
      HashMap<Character,Integer>hash=new HashMap<>();
      for(int i =0; i<s.length();i++)
      {
        char c=s.charAt(i);
        if(hash.containsKey(c))
        {
            int value=hash.get(c);
            hash.put(c,value+1);
        }
        else {
            hash.put(c,1);
        }
      }
        for(int i =0; i<s.length();i++)
        {
            if(hash.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }
}