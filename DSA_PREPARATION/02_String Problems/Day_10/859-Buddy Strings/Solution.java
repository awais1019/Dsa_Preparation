import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        if (s.equals(goal)) {
            return hasDuplicateCharIfEqual(s);
        } else {
            return canSwapToMatch(s, goal);
        }
    }

    private boolean hasDuplicateCharIfEqual(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
            if (count[c - 'a'] > 1) return true;
        }
        return false;
    }

    private boolean canSwapToMatch(String s, String goal) {
        List<Integer> mismatchIndexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                mismatchIndexes.add(i);
            }
        }

        if (mismatchIndexes.size() == 2) {
            int i = mismatchIndexes.get(0);
            int j = mismatchIndexes.get(1);

            return s.charAt(i) == goal.charAt(j) && 
            s.charAt(j) == goal.charAt(i);
        }
        return false;
    }
}
