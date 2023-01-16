class Solution {

  public int findKthLargest(int[] nums, int k) {
    int[] nums_sorted = binarySort(nums);
    return nums_sorted[nums_sorted.length - k];
  }

  public int[] binarySort(int[] arr) {
    int[] sorted = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      //System.out.println("Insert number: " + arr[i]);
      int index = helper(sorted, arr[i], 0, i / 2, i);
      //System.out.println("Insert Index: " + index);
      sorted = inserter(sorted, index, arr[i]);
      //printer(sorted);
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
    if (low >= high) {
      //System.out.println("Index to insert is: " + mid + " " + low + mid + high);
      return low;
    } else if (n < arr[mid]) {
      //System.out.println("Low: " + low + " " + mid + " " + high);
      return helper(arr, n, low, mid / 2, mid - 1);
    } else {
      //System.out.println("High: " + low + " " + mid + " " + high);
      return helper(arr, n, mid + 1, ((high + mid) / 2), high);
    }
  }

  public void printer(int[] arr) {
    for (int x : arr) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Solution number = new Solution();
    int[] arr1 = { 3, 2, 1, 5, 6, 4 };
    int[] arr2 = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
    int[] arr3 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    int[] arr4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] arr5 = { 1, 2, 3, 4 };
    int[] arr6 = { -1, 2, 0 };

    //Test Binary Sort Function
    // System.out.print("Original Array: ");
    // number.printer(arr2);
    // System.out.print("Sorted Array:   ");
    // number.printer(number.binarySort(arr2));

    //System.out.println(number.findKthLargest(arr1, 2)); // 5
    //System.out.println(number.findKthLargest(arr2, 4)); // 4
    number.printer(number.binarySort(arr6));
    System.out.println(number.findKthLargest(arr6, 2)); // 0
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
