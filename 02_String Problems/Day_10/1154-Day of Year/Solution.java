class Solution {
    public int dayOfYear(String date) {
      String[] mydate=date.split("-");
      int year=Integer.parseInt(mydate[0]);
      int monthNumber=Integer.parseInt(mydate[1]);
      int days=Integer.parseInt(mydate[2]);
      int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
      
      if(isLeapYear(year))
      arr[1]=29;
      int dayNumber=days;
      for (int i=0;i<monthNumber-1;i++)
      dayNumber+=arr[i];
      
      return dayNumber;
    }

    private boolean isLeapYear(int year) {
    if (year % 400 == 0) return true;
    if (year % 100 == 0) return false;
    return year % 4 == 0;
}
    
}