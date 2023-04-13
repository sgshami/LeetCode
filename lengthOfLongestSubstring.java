import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> letters = new ArrayList<Character>();
        int most = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (letters.contains(s.charAt(j))) {
                    break;
                } else {
                    letters.add(s.charAt(j));
                }
            }
            if (most < letters.size()) {
                most = letters.size();
            }
            letters.clear();
            if (s.length() - i < most) {
                break;
            }
        }
        return most;
    }

    public static void main(String[] args) {
        Solution repeat = new Solution();
        String s = "abcabcbb";
        System.out.println(repeat.lengthOfLongestSubstring(s)); //3
        s = "bbbbb";
        System.out.println(repeat.lengthOfLongestSubstring(s)); //1
        s = "pwwkew";
        System.out.println(repeat.lengthOfLongestSubstring(s)); //3
        s = "wobgrovw";
        System.out.println(repeat.lengthOfLongestSubstring(s)); //6
        s = "jbpnbwwd";
        System.out.println(repeat.lengthOfLongestSubstring(s)); //4
    }
}

// Given a string s, find the length of the longest
// substring
// without repeating characters.


// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


// Constraints:

//     0 <= s.length <= 5 * 104
//     s consists of English letters, digits, symbols and spaces.

