class Solution {
    public int solution(int n) {
        return Fibonacci(0,1,n,2);
    }
    private int Fibonacci(int a, int b, int n, int cnt){
        int sum=a%1234567+b%1234567;
        if(cnt==n){
            return sum%1234567;
        }
        return Fibonacci(b,sum,n,cnt+1);
    }
}