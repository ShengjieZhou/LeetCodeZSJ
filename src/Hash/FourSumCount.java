package Hash;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> numMap = new HashMap<>();
        int count = 0;
        for (int num1 : nums1){
            for (int num2 :nums2){
                int sum = num1 + num2;
                if ( numMap.containsKey(sum) ){
                    numMap.put(sum,numMap.get(sum)+1);
                }else{
                    numMap.put(sum,1);
                }
            }
        }
        for (int num3 : nums3){
            for (int num4 :nums4) {
                int tempVal = -(num3+num4);
                if (numMap.containsKey(tempVal)){
                    count += numMap.get(tempVal);
                }

            }
        }
        return count;
    }
}
