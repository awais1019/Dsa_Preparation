import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findIntersection(int[] arr1, int[] arr2) {
        int firstArray = 0;
        int secondArray = 0;
        List<Integer> list = new ArrayList<>();

        while (firstArray < arr1.length && secondArray < arr2.length) {
            if (arr1[firstArray] < arr2[secondArray]) {
                firstArray++;
            } else if (arr2[secondArray] < arr1[firstArray]) {
                secondArray++;
            } else {
                list.add(arr1[firstArray]);
                firstArray++;
                secondArray++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8};

        List<Integer> result = solution.findIntersection(arr1, arr2);

        System.out.println("Intersection: " + result);
    }
}
