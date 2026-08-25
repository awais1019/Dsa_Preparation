import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxLen = 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        for (int right = 0; right < n; right++) {
            int num=fruits[right];
            map.put(num,map.getOrDefault(num,0)+1);
            while(map.size()>2) 
            {
                int leftnum=fruits[left];
                map.put(leftnum,map.get(leftnum)-1);
                if(map.get(leftnum)==0)
                map.remove(leftnum);
                left++;
            }
            maxLen = Math.max(maxLen, right- left+1);
        
        
        }

        return maxLen;
    }
}
