public class CodeKata011 {


    public String solution(int num) {
       String answer = "";

        if (num % 2 ==0) {
            return answer = "Even";
        } else {
            return answer = "Odd";
        }

    }


    public static void main(String[] args) {
        CodeKata011 code = new CodeKata011();
        System.out.println(code.solution(3));
        System.out.println(code.solution(4));
    }
}


