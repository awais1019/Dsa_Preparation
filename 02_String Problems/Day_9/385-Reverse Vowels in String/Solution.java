class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        boolean leftSide=false;
        boolean rightSide=false;
        StringBuilder str=new StringBuilder(s);
        char ch='a';
        while(left<right)
        {
            leftSide=checkVowel(s.charAt(left));
            rightSide=checkVowel(s.charAt(right));
            if(leftSide&&rightSide)
            {
              ch=s.charAt(left);
              str.setCharAt(left, s.charAt(right));
              str.setCharAt(right, ch);
               left++;
               right--;
            }
            else if(leftSide)
            {
                right--;
            }
           else if(rightSide)
            {
                left++;
            }
            else {
                left++;
                right--;
            }
        }
        return str.toString();
    }

    private boolean checkVowel(char ch)
    {
     return "aeiouAEIOU".indexOf(ch) != -1;
    }
}