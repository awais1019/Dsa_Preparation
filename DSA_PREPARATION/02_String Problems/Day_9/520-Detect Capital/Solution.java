class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length()==1)
        return true;
        if(checkFirstLetter(word.charAt(0)))
        {
          return checkCapital(word) || 
          checkRemainingLower(word,1);
        }
        else {
           return checkLowerCase(word);
        }
    }
    private boolean checkLowerCase(String s)
    {
      for(char ch:s.toCharArray())
      {
        if(ch<'a'||ch>'z')
        return false;
      }
      return true;
    }
    
    private boolean checkCapital(String s)
    {
     for(char ch:s.toCharArray())
      {
        if(ch<'A'||ch>'Z')
        return false;
      }
      return true;
    }
     private boolean checkFirstLetter(char c)
    {
        return c >= 'A' && c <= 'Z';
    } 
    private boolean checkRemainingLower(String s,int start)
    {
       for (int i = start; i < s.length(); i++) 
      {
        char ch = s.charAt(i);
        if (ch < 'a' || ch > 'z') return false;
      }
      return true;
    }
}
    