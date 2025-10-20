public class CodeKata001 {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    public static void main(String[] args) {
        CodeKata001 code = new CodeKata001();
        System.out.println(code.solution(2, 3));
        System.out.println(code.solution(100, 2));
    }
}


