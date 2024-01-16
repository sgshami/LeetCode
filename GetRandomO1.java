//#380 in LeetCode. Program created and tested in LeetCode. 

import java.lang.Math;

class GetRandomO1 {
    ArrayList<Integer> nums;
    public RandomizedSet() {
        nums = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(nums.contains(val)){
            return false;
        }else{
            nums.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(nums.contains(val)){
            nums.remove(Integer.valueOf(val));
            return true;
        }else{
            return false;
        }
    }
    
    public int getRandom() {
        return (nums.get((int)(Math.random() * nums.size())));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
