class Solution {
    public boolean isPalindrome(String s) {
        String cleaned =cleanString(s); 
        StringBuilder reverse=new StringBuilder(cleaned).reverse();
        for(int i=0;i<cleaned.length();i++)
        {
            if(cleaned.charAt(i)!=reverse.charAt(i))
            {
                return false;
            }
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