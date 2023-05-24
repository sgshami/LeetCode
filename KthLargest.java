/* add Method uses Homemade quicksort method. Too slow to pass Leetcode */

import java.util.*;

public class KthLargest {
    int k;
    int[] arr;
    List<Integer> arrList = new ArrayList<Integer>();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        arr = nums;
        for (int x : nums) {
            arrList.add(x);
        }
    }
    
    public int addList(int val) {
        arrList.add(val);
        Collections.sort(arrList);
        return arrList.get((arrList.size()-k));
    }

    //Uses Java's built in copy and sort methods
    public int addS(int val) {
        int[] arr2 = new int[(arr.length+1)];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[arr.length] = val;
        //System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        //System.out.println(Arrays.toString(arr2));
        //System.out.println("Number is: " + String.valueOf((arr2.length - k)));
        arr = arr2.clone();
        return arr2[(arr2.length-k)];
    }

    //Use this method to my quickSort
    public int add(int val) {
        int[] temp = arr;
        arr = new int[temp.length + 1];
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        arr[arr.length - 1] = val;
        quickSort(0, arr.length - 1);
        printer(arr);
        //System.out.println("Number is: " + String.valueOf(k));
        return arr[(arr.length - k)];
    }

    public void quickSort(int start, int end) {
        if (start <= end) {
            int partitionIndex = partition(start, end); //The index that the partition/pivot is

            //Sort the left and right side of the array with recursion
            quickSort(start, partitionIndex - 1);
            quickSort(partitionIndex + 1, end);
        }
    }

    private int partition(int start, int end){
        int pivot = arr[end]; //Choose the pivot to be at the end
        int smaller = start - 1; //The index of the element that is the largest smaller element
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) { //Check to see if the element is smaller than the pivot. Swap if yes
                smaller++;
                swapper(smaller, i);
            }
        }
        swapper(smaller + 1, end);
        return (smaller + 1);
    }

    //Allows you to swap to elements
    private void swapper(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private void printer(int[] arrs) {
        System.out.print("The array is: ");
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr1 = {4,5,8,2};
        KthLargest obj1 = new KthLargest(3, arr1);
        //int param1 = obj1.add(5);
        int param2 = obj1.addS(5);
        int param3 = obj1.addList(5);
        //System.out.println(param1);
        System.out.println(param2);
        System.out.println(param3);
    }
}
