package Hash;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] test = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(test));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for (int i=0 ; i< nums.length ; i++){
            if (nums[i]>0) break;
            if ( i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while ( left < right){
                if ( (nums[i] + nums[left] + nums[right]) == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    left++;
                    right--;
                } else if((nums[i] + nums[left] + nums[right]) < 0){
                    left++;
                }else if((nums[i] + nums[left] + nums[right]) > 0 ){
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }

}
