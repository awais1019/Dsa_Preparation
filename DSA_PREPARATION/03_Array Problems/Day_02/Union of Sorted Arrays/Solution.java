import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }


        while (j < arr2.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {1, 2, 2, 4, 5, 6, 7,10,19};
        int[] arr2 = {2, 3, 4, 4, 6, 8};

        List<Integer> result = solution.findUnion(arr1, arr2);

        System.out.println("Union: " + result);
    }
}
