//Written and Tested in LeetCode
class NthTribonacci {
    public int tribonacci(int n) {
        int temp = 0;
        int sum1 = 0;
        int sum2 = 1;
        int sum3 = 1;
        for(int i = 3; i < n; i++){
            temp = sum1;
            sum1 = sum2;
            sum2 = sum3;
            sum3 = sum1 + sum2 + temp;
        }
        if(n == 0){
            return 0;
        }else if(n == 1 || n == 2){
            return 1;
        }else{
            return sum1 + sum2 + sum3;
        }
    }
}
