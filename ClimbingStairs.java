//Written and Tested in LeetCode
class ClimbingStairs {
    public int climbStairs(int n) {
        int temp = 0;
        int num1 = 0;
        int num2 = 1;
        for(int i = 1; i < n; i++){
            temp = num1;
            num1 = num2;
            num2 = num1 + temp;
        }
        return num1 + num2;
    }
}
