import java.util.Scanner;

public class ElseIfEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 점수를 입력해주세요>>");
        int score = sc.nextInt();
// if ~ else if ~ else 문 : 한번의 조건문에 여러가지의 조건식을 사용하여 해당 조건에 맞는 값이 있을 경우
        // 해당 코드 블럭을 실행하는 if문
        // if ~ else if ~ else 문의 마지막에 있는 else 문은 필수가 아님 ,생략 가능
        // 단 생략가능 조건 : 1.위의 조건식에서 나올 수 있는 모든 조건식을 다 입력 시 가능
        // 2. 개발자가 의도적으로 생략할 수 있음
        if(score >= 90){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 A입니다.");
        }
        else if(score >= 80){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 B입니다.");
        }
        else if(score >= 70){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 C입니다.");
        }
        else if(score >= 60){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 D입니다.");
        }
        // else if (score < 60){
        // System.out.println("당신의 점수는" + score + "점 이고, 등급은 F입니다."); 할시 else문 생략가능
        else {
            System.out.print("당신의 점수는" + score + "점 이고,등급은 F입니다.");
        }


        if(score >= 90){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 A입니다.");
        }
        else if(score >= 80){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 B입니다.");
        }
        else if(score >= 70){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 C입니다.");
        }
        else if(score >= 60){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 D입니다.");
        }
        else if(score < 60){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 F입니다.");
        }


System.out.println( "----------------------------------------------" );
        // 주의사항
        // if ~ else if ~ else 문 사용 시 조건식은 단계적으로 입력해야 함
        // 자바의 문법상 잘못된 것은 아니기 때문에 오류가 발생하진 않음
        // 실제로 실행 시 잘못된 결과가 출력됨

        if(score >= 90){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 A입니다.");
        }
        else if(score >= 70){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 C입니다.");
        }
        else if(score >= 80){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 B입니다.");
        }
        else if(score >= 60){
            System.out.print("당신의 점수는" + score + "점 이고,등급은 D입니다.");
        }
        else {
            System.out.print("당신의 점수는" + score + "점 이고,등급은 F입니다.");
        }
    }
}
