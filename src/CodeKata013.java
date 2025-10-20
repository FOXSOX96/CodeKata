
public class CodeKata013 {

    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        CodeKata013 code = new CodeKata013();
        System.out.println(code.solution(123));
        System.out.println(code.solution(987));
    }

}

