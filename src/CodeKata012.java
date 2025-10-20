import java.util.Arrays;

public class CodeKata012 {


    public double solution(int[] arr) {
        double answer = 0;
        answer = Arrays.stream(arr).average().orElse(0);
        return answer;
    }


    public static void main(String[] args) {
        CodeKata012 code = new CodeKata012();
        System.out.println(code.solution(new int[]{1,2,3,4}));
        System.out.println(code.solution(new int[]{5,5}));
    }
}

