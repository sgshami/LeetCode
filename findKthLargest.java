class Solution {

  public int findKthLargest(int[] nums, int k) {
    return 5;
  }

  public int[] binarySort(int[] arr) {
    int[] sorted = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Insert number: " + arr[i]);
      int index = helper(sorted, arr[i], 0, i / 2, i);
      System.out.println("Insert Index: " + index);
      sorted = inserter(sorted, index, arr[i]);
      for (int x : sorted) {
        System.out.print(x + " ");
      }
      System.out.println("\n");
    }
    return sorted;
  }

  public int[] inserter(int[] arr, int index, int n) {
    for (int i = arr.length - 1; i > index; i--) {
      arr[i] = arr[i - 1];
    }
    arr[index] = n;
    return arr;
  }

  public int helper(int[] arr, int n, int low, int mid, int high) {
    if (n < arr[mid] && low != high) {
      System.out.println("Low: " + low + " " + mid + " " + high);
      helper(arr, n, low, mid / 2, mid);
      return low;
    } else if (n > arr[mid] && low <= mid) {
      System.out.println("High: " + low + " " + mid + " " + high);
      helper(arr, n, mid + 1, high / 2 + 1, high);
      return high;
    }
    return mid;
  }

  public static void main(String[] args) {
    Solution number = new Solution();
    int[] arr1 = { 3, 2, 1, 5, 6, 4 };
    int[] arr2 = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
    int[] arr3 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    int[] arr4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] arr5 = { 1, 2, 3, 4 };

    //Test Binary Sort Function
    number.binarySort(arr4);
    System.out.println("\n\n\n -------------------------------------- \n\n\n");
    number.binarySort(arr3);
    //number.binarySort(arr1);
    // for (int x : arr) {
    //     System.out.print(x);
    // }

    //System.out.println(number.findKthLargest(arr1, 2));  // 5
    //System.out.println(number.findKthLargest(arr2, 4));   // 4
  }
}
// 215. Kth Largest Element in an Array
// Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.
// You must solve it in O(n) time complexity.
//  
// Example 1:
// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5
// Example 2:
// Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
// Output: 4
//  
// Constraints:
//     1 <= k <= nums.length <= 105
//     -104 <= nums[i] <= 104
