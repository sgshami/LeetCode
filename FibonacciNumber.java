//Written and Tested in LeetCode
class FibonacciNumber {
    public int fib(int n) {
       int temp = 0;
        int num1 = 0;
        int num2 = 1;
        for(int i = 2; i < n; i++){
            temp = num1;
            num1 = num2;
            num2 = num1 + temp;
        }
        if(n == 0)
            return 0;
        return num1 + num2;
 
    }
}
