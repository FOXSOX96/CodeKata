public class CodeKata004 {


    public int solution(int age) {
        int answer = 2022 -age +1;
        return answer;
    }


    public static void main(String[] args) {
        CodeKata004 code = new CodeKata004();
        System.out.println(code.solution(40));
        System.out.println(code.solution(23));
    }
}


