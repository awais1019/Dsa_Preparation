import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxLen = 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        for (int right = 0; right < n; right++) {
            int num=fruits[right];
            map.put(num,right);
            if(map.size()>2) 
            {  
                int minIndex = Collections.min(map.values());
                map.values().remove(minIndex);
                left = minIndex + 1;
            }
            maxLen = Math.max(maxLen, right- left+1);
          

        
        }

        return maxLen;
    }
}
