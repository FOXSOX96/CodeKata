public class CodeKata010 {


        public double solution(int[] numbers) {
            double answer = 0;

            for (int number : numbers) {
                answer += number; // 누적합
            }

            answer /= numbers.length; // 평균 계산
            return answer;
        }


    public static void main(String[] args) {
        CodeKata010 code = new CodeKata010();
        System.out.println(code.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(code.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
}


