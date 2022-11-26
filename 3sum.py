from itertools import combinations
class Solution:
    def threeSum(self, nums):
        comb = combinations(nums)
        ans = []
        for i in list(comb):
            #print(i)
            if(sum(i) == 0):
                ans.append(i)
        return ans

solution = Solution()
print(solution.threeSum([-1,0,1,2,-1,-4]))
print(solution.threeSum([0,1,1]))
print(solution.threeSum([0,0,0]))