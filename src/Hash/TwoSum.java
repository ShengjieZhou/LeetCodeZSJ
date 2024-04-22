package Hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }

        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i=0 ; i< nums.length ; i++){
            int temp = target - nums[i];
            if ( numMap.containsKey(temp) ){
                res[0] = i;
                res[1] = numMap.get(temp);
                return res;
            }else{
                numMap.put(nums[i],i);
            }
        }
        return res;
    }


}
