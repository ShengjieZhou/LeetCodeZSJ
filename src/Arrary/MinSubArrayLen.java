package Arrary;

import java.math.*;

 class MinSubArrayLen {

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(subArray(target,nums));
    }

    public static int subArray(int target, int[] nums){
        //滑动窗口
        int left = 0;
        int length = nums.length + 1;
        int sum = 0;
        for ( int right=0;right< nums.length;right++){
            sum += nums[right];
            while( sum >= target ){
                sum -= nums[left];
                length = Math.min(length,right-left);
                left ++;
            }
        }
        if (length>nums.length){
            return 0;
        }else{
            return length+1;
        }
    }
}
