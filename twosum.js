/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
 var twoSum = function(nums, target) {
     var i = 0;
     while (i < nums.length - 1)
     {
         var j = nums.indexOf(target - nums[i], i + 1);
         if (j != -1)
             //return Array.from(i, j);
             return [i, j];
         i++;
     }
};

const arr1 = new Array(2,7,11,15);
const arr2 = new Array(3,2,4);
const arr3 = new Array(3, 3);

console.log(twoSum(arr1, 9)); //[0,1]
console.log(twoSum(arr2, 6)); //[1,2]
console.log(twoSum(arr3, 6)); //[0,1]


/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/