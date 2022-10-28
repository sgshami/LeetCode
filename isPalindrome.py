from importlib.abc import InspectLoader
from operator import truediv


class Solution:
    def isPalindrome(self, x: int) -> bool:
        if(x < 0):
            return False
        reverseNum = int("".join(reversed(str(x))))
        if(reverseNum == x):
            return True
        return False


solution = Solution()

print(solution.isPalindrome(121))  # true
print(solution.isPalindrome(1))  # true
print(solution.isPalindrome(-121))  # false
print(solution.isPalindrome(112))  # false

# Given an integer x, return true if x is palindrome integer.
# An integer is a palindrome when it reads the same backward as forward.
