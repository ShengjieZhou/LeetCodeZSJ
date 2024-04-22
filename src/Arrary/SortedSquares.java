package Arrary;//https://leetcode.cn/problems/squares-of-a-sorted-array/
//有序数组的平方

import java.util.Vector;

import static java.lang.Math.abs;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] result = sort(nums);
        System.out.println(result.toString());
    }

    public static int[] sort(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        int[] result = new int[nums.length];
        while ( i <= j ){
            if ( nums[i]*nums[i] >= nums[j]*nums[j]){
                result[k] = nums[i]*nums[i];
                i++;
            }else{
                result[k] = nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return result;
    }
}
