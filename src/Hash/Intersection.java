package Hash;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> result = new HashSet<Integer>();
        for (int i : nums1){
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                result.add(i);
            }
        }

        return result
                .stream()
                .mapToInt(x -> x)
                .toArray();

    }



}
