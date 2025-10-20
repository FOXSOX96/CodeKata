public class CodeKata005 {

    public int solution(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        CodeKata005 code = new CodeKata005();
        System.out.println(code.solution(2, 3));
        System.out.println(code.solution(11, 11));
        System.out.println(code.solution(7, 99));
    }
}


