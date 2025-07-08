class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder str=new StringBuilder();
        int end=s.length()-1;
        while(end>=0)
        {
           char ch=s.charAt(end);
          if(Character.isLetter(ch))
          {
            str.append(ch);
          }
          else if(str.length()>=1)
          {
            break;
          }
          end--;
        }
        return str.length();
    }
}