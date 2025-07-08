class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int[] freq = new int[]{-1, -1, -1};
        int n=s.length();
        for(int right=0;right<n;right++)
        {  
                freq[s.charAt(right)-'a']=right;
                if(freq[0]!=-1&&freq[1]!=-1&&freq[2]!=-1)
                {
                  count+=1 
                  + Math.min(freq[0], Math.min(freq[1], freq[2]));
                }
       
        }
                return count;

    }
    

}