public class CodeKata009 {


    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        CodeKata009 code = new CodeKata009();
        System.out.println(code.solution(10));
        System.out.println(code.solution(4));
    }
}


