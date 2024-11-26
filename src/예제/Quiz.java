package java_241125.src.예제;// 문제 1) 사용자에게서 국어,영어,수학 점수를 각각 입력받고, 평균 점수 및 총점, 등급을 출력하는 프로그램을 작성하세요
//$ 등급은 95이상 A+, 90이상 A, 85이상 B+, 80이상B, 70이상 C, 60이상 D, 60마만 F 로처리
// $ 중첩은 if 문이나 else if 문으로 작성
// 출력 예시 > 당신의 총점은 XXX 점이고, 평균은 XX.X 점이고, 등급은 X입니다.

// 문제2) 책 87페이지 4번 문제
// 문제3) 책 88페이지 6번 문제
// 문제4) 책 89페이지 9번 문제
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 점수를 입력해주세요>>");


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d= (a+b+c)/3.0;


        System.out.println("당신의 국어점수는" + a + "이고 수학점수는"+ b + "이며 영어점수는" + c +"입니다");
        System.out.println("당신의 총점은" + (a+b+c) + "입니다");
        System.out.print("당신의 평균은" + d + "입니다");









        if( (a+b+c)/3 >= 95){
            System.out.println("당신의 총점은" + (a+b+c) + "이고" + " 평균은" + d  + "이며" + "등급은 A+입니다." );

        }
        else if( (a+b+c)/3 >= 90) {
            System.out.println("당신의 총점은" + (a + b + c) + "이고" + " 평균은" + d + "이며" + "등급은 A입니다.");
        }
        else if( (a+b+c)/3 >= 85) {
            System.out.println("당신의 총점은" + (a + b + c) + "이고" + " 평균은" + d + "이며" + "등급은 B+입니다.");
        }
        else if( (a+b+c)/3 >= 80) {
            System.out.println("당신의 총점은" + (a + b + c) + "이고" + " 평균은" + d+ "이며" + "등급은 B입니다.");
        }
        else if( (a+b+c)/3 >= 70) {
            System.out.println("당신의 총점은" + (a + b + c) + "이고" + " 평균은" + d + "이며" + "등급은 C입니다.");
        }
        else if( (a+b+c)/3 >= 60) {
            System.out.println("당신의 총점은" + (a + b + c) + "이고" + " 평균은" + d + "이며" + "등급은 D입니다.");
        }
        else{
            System.out.println("당신의 총점은" + (a + b + c) + "이고" + " 평균은" + d + "이며" + "등급은 A+입니다.");
        }
        }

}
