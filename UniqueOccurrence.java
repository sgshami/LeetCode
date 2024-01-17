//Written & Tested on LeetCode
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occ = new HashMap<Integer, Integer>();
        
        //Loop through array. Add to HashMap or increment tally.
        for(int x : arr){
            if(!occ.containsKey(x)){
                occ.put(x, 1);
            }else{
                occ.put(x, occ.get(x) + 1);
            }
        }

        HashMap<Integer, Integer> occ1 = new HashMap<Integer, Integer>(occ);

        for(int i : occ.keySet()){
            int value = occ.get(i);
            occ1.remove(i);
            if(occ1.containsValue(value)){
                return false;
            }
        }
        return true;  
    }
}
