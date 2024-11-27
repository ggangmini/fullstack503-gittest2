public class Quiz1 {
    public static void main(String[] args) {
        //문제1 중복 for문을 이용하여 구구단을 2단부터 9단까지 모두 출력하는 프로그램을 작성하세요

        //문제2 중복 while문을 이용하여 구구단을 2단부터 9단까지 모두 출력하는 프로그램을 작성하세요
        System.out.println("구구단을 외자!");
        for (int a = 2; a < 10; a++) {
            System.out.println("----"+a+"단--------");
            for (int b = 1; b < 10; b++) {
                System.out.println(a + "*" + b + "=" + a * b);
            }
        }
        // 각각의 증감식 외부 증감식은 마지막 외부 while문 안에 내부 증감식은 내부 while문 안에!!!
        System.out.println("구구단을 외자");
        int c = 2; // 외부 while문 변수 초기화 선언

        while (c < 10) {
            int d = 1; // 내부  while문 변수초기화선언을 외부 while문 안에서 먼저 실행하면 편함.!!!
            System.out.println("----"+c+"단-----");
            while (d < 10) {
                System.out.println(c+ "*" + d + "=" + c * d);
                d++;

            }
            c++;
        }

    }

    public static class BreakContinue {
        public static void main(String[] args) {

            System.out.println("------break 사용--------");
            for(int i =0;i<10;i++){
                if(i==5){
                    break;
                }
                System.out.println("현재 i의 값:" + i);
            }

            System.out.println("-----continue사용------");
            for(int i =0;i<10;i++) {
                if (i == 5) {
                    continue;
                }
                System.out.println("현재 i의 값:" + i);
            }
        }
    }
}
