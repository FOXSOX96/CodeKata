public class CodeKata008 {


    public int solution(int angle) {
        if (angle <90 && angle >0 ) {return 1;}
        else if (angle == 90) {return 2;}
        else if (angle >90 && angle < 180) {return 3;}
        else if (angle == 180) {return 4;}
        else {return 0;}
    }

    public static void main(String[] args) {
        CodeKata008 code = new CodeKata008();
        System.out.println(code.solution(70));
        System.out.println(code.solution(91));
        System.out.println(code.solution(180));
    }
}


