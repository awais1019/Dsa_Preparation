public class ArrayUtils {

    public static boolean isSortedAscending(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}; // true
        int[] b = {5, 4, 3, 2, 1}; // false
        int[] c = {1, 1, 2, 2, 3}; // true

        System.out.println(isSortedAscending(a)); // true
        System.out.println(isSortedAscending(b)); // false
        System.out.println(isSortedAscending(c)); // true
    }
}
