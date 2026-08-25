
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        result.deleteCharAt(result.length() - 1);  //to delete last white space
        return result.toString();
    }
}
