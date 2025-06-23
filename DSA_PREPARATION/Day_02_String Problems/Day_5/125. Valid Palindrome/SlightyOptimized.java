class Solution {
    public boolean isPalindrome(String s) {
        String cleaned =cleanString(s); 
        int left=0;
        int right=cleaned.length()-1;
        while (left<right)
        {
            if(cleaned.charAt(left)!=cleaned.charAt(right))
            {
                return false;
            }
            right--;
            left++;
        }  
    
        return true;
    }
    private String cleanString(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
        if ((c >= '0' && c <= '9') || 
            (c >= 'A' && c <= 'Z') || 
            (c >= 'a' && c <= 'z')) {
            sb.append(Character.toLowerCase(c));
        }
    }
        return sb.toString();
   }
}