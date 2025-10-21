class Solution {
    public long[] solution(long n) {
        String str = String.valueOf(n);
        int len = str.length();
        long[] answer = new long[len];

        for(int i = 0;i < len;i++){
            answer[i] = str.charAt(len -i -1) -'0';
        }
        return answer;
    }
}