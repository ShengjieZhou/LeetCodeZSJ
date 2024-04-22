package Arrary;

//https://leetcode.cn/problems/remove-element/
//import java.util.Arrays;
//数组删除元素
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int target = 2;
        System.out.println(remove(nums,target));
    }

    public static int remove(int[] nums, int val){
        //快慢指针
        int slow = 0;
        for ( int fast = 0; fast < nums.length; fast++ ){
            if ( nums[fast] != val ){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
//        return Arrays.stream(nums)
//                .filter(num -> num != val)
//                .toArray();
//
    }
}
