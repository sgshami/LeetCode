/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function (nums, k){
    var i = 0;
    while (i < nums.length - 1)
    {
         var j = nums.indexOf(nums[i], i + 1);
         if (j!= -1 && Math.abs(i - j) <= k)
         {
             return true;
        }
        i++;
     }
     return false;
};

const arr1 = new Array(1, 2, 3, 1);
const arr2 = new Array(1, 0, 1, 1);
const arr3 = new Array(1, 2, 3, 1, 2, 3);
const arr4 = new Array(99, 99);
const arr5 = new Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 9);
const arr6 = new Array(1, 2);

console.log(containsNearbyDuplicate(arr1, 3)); //true
console.log(containsNearbyDuplicate(arr2, 1)); //true
console.log(containsNearbyDuplicate(arr4, 2)); //true
console.log(containsNearbyDuplicate(arr5, 3)); //true
console.log(containsNearbyDuplicate(arr3, 2)); //false
console.log(containsNearbyDuplicate(arr6, 2)); //false

/*
 * TASK: Given an integer array nums and an integer k, return true if there are
 * two distinct indices i and j in the array such that nums[i] == nums[j] and
 * abs(i - j) <= k.
 */

/*
THIS IS MY ATTEMPT USING JAVA
import java.lang.Math;

class Solution {
    // TOO SLOW
    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    // for (int i = 0; i < nums.length - 1; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] == nums[j] & Math.abs(i - j) <= k)
    // return true;
    // }
    // }
    // return false;
    // }

    // DOES NOT PASS EVERY CASE
    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    // int i = 0;
    // int j = k;
    // if (nums.length == 2 && nums[0] == nums[nums.length - 1] && k >= 1) {
    // return true;
    // }
    // while (i < nums.length - k) {

    // while (i < j) {
    // if (nums[i] == nums[j])
    // return true;
    // j--;
    // }
    // i++;
    // j = i + k;
    // }
    // return false;
    // }

    //TOO SLOW
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j < i + 1 + k && j < nums.length; j++) {
                // System.out.println("i:" + i + " j:" + j);
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr1 = { 1, 2, 3, 1 };
        int[] arr2 = { 1, 0, 1, 1 };
        int[] arr3 = { 1, 2, 3, 1, 2, 3 };
        int[] arr4 = { 99, 99 };
        int[] arr5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
        System.out.println(obj.containsNearbyDuplicate(arr1, 3)); // true
        System.out.println(obj.containsNearbyDuplicate(arr2, 1)); // true
        System.out.println(obj.containsNearbyDuplicate(arr4, 2)); // true
        System.out.println(obj.containsNearbyDuplicate(arr5, 3)); // true
        System.out.println(obj.containsNearbyDuplicate(arr3, 2)); // false
    }
}
*/