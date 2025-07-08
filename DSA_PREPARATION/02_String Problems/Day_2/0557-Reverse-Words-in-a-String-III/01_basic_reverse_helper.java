class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseSingleWord(arr[i]);
        }
        return String.join(" ", arr);
    }

    private String reverseSingleWord(String word) {
        StringBuilder reverseWord = new StringBuilder();
        for (int j = word.length() - 1; j >= 0; j--) {
            reverseWord.append(word.charAt(j));
        }
        return reverseWord.toString();
    }
}
