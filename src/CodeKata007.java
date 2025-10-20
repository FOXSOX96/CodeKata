public class CodeKata007 {


    public int solution(int num1, int num2) {
        int answer = num1 * 1000 / num2;
        return answer;
    }

    public static void main(String[] args) {
        CodeKata007 code = new CodeKata007();
        System.out.println(code.solution(3, 2));
        System.out.println(code.solution(7, 3));
        System.out.println(code.solution(1, 16));
    }
}


