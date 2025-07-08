import java.util.Arrays;

public class SecondLargest {

    // Brute Force: O(n log n)
    static int secondLargestElementBruteForce(int[] nums) {
        Arrays.sort(nums); // sort the array
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1]; 
            }
        }
        return -1; 
    }

    // Two Passes: O(2n)
    static int secondLargestElement2n(int[] nums) {
        int firstLargest = nums[0];
        int secondLargest = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstLargest) {
                firstLargest = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondLargest && nums[i] < firstLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest;
    }

    // Optimized: O(n)
    static int secondLargestElementn(int[] nums) {
        int firstLargest = nums[0];
        int secondLargest = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = nums[i];
            } else if (nums[i] < firstLargest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 6, 3, 8};

        System.out.println("Brute Force → " + secondLargestElementBruteForce(arr.clone()));
        System.out.println("Two Passes  → " + secondLargestElement2n(arr.clone()));
        System.out.println("Optimized   → " + secondLargestElementn(arr.clone()));
    }
}
