public class CodeKata003 {


    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }


    public static void main(String[] args) {
        CodeKata003 code = new CodeKata003();
        System.out.println(code.solution(10, 5));
        System.out.println(code.solution(7, 2));
    }
}


