//#1662: Check If Two String Arrays are Equivalent
//Coded and Tested on LeetCode

class StringArraysEquiv {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "", s2 = "";
        
        for(int i=0; i<word1.length; i++){
            s1 += word1[i];
        }
        for(int i=0; i<word2.length; i++){
            s2 += word2[i];
        }

        return s1.equals(s2);
    }
}
