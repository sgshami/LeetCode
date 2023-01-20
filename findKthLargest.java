class Solution {

  private int[] arr;

  public int findKthLargest(int[] nums, int k) {
    arr = nums;
    System.out.print("Unsorted Array: ");
    printer(arr);
    quickSort(0, nums.length - 1);
    System.out.print("Sorted Array:   ");
    printer(arr);
    return arr[arr.length - k];
  }

  private void quickSort(int p, int q) {
    int j;
    if (p < q) {
      j = partition(p, q);
      if (p != j) {
        swap(p, j);
      }
      quickSort(p, j - 1);
      quickSort(j + 1, q);
    }
  }

  private int partition(int p, int q) {
    int pivot, i, j;
    pivot = arr[p];
    j = p;
    for (i = j + 1; i <= q; i++) {
      if (arr[i] <= pivot) {
        j++;
        swap(j, i);
      }
    }
    return j;
  }

  private void swap(int j, int k) {
    int tmp = arr[j];
    arr[j] = arr[k];
    arr[k] = tmp;
  }

  private void printer(int[] arr) {
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
    int[] arr5 = { -1, 2, 0 };

    System.out.println(number.findKthLargest(arr4, 1) + " \n"); //9
    System.out.println(number.findKthLargest(arr3, 1) + " \n"); //9
    System.out.println(number.findKthLargest(arr1, 2) + " \n"); //5
    System.out.println(number.findKthLargest(arr2, 4) + " \n"); //4
    System.out.println(number.findKthLargest(arr5, 2) + " \n"); //0
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
