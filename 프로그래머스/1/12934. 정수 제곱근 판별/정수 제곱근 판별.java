class Solution {
    public long solution(long n) { 
    double x = Math.sqrt(n);
    long answer = (x%1==0 ? (long)Math.pow(x +1,2 ): -1);
        return answer;
    }
}