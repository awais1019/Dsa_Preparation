import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int lenght=0;
        boolean foundOdd=false;
        for (int count:map.values())
        {
           if(count%2==0)
           {
            lenght+=count;
           }
           else {
             lenght+=count-1;
             foundOdd=true;
           }
        }
        if(foundOdd)
        {
            lenght+=1;
        }
        return lenght;
    }
}