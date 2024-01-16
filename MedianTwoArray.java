//Code created and tested on LeetCode
import java.util.*;
class MedianTwoArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int index = 0; //to track current index on nums

        //Combine both arrays into 1
        for(int i = 0; i <nums1.length; i++){
            nums[index] = nums1[i];
            index++;
        }
        for(int i = 0; i <nums2.length; i++){
            nums[index] = nums2[i];
            index++;
        }
        Arrays.sort(nums);

        //Find the median
        if(nums.length%2 == 0){
            return (double)(nums[nums.length/2] + nums[(nums.length/2)-1])/2;
        }else{
            return (nums[nums.length/2]);
        }
    }
}
