package java_241125.src.예제;

import java.util.Scanner; //Quiz1 문제풀이 //

public class Quiz1_solve {
    public static void main(String[] args) {
        // 사용자 키보드 입력을 받기 위한 객체 생성
        Scanner sc = new Scanner(System.in);
        //국어점수 수학점수 영어점수 평균 총합 점수를 저장하기위한 변수 선언//
        int kor = 0;
        int eng = 0;
        int mat = 0;
        int total = 0;
        int avg = 0;
        String grade = "";

        System.out.print("국어 점수를 입력해 주세요>>");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력해 주세요>>");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력해 주세요>>");
        mat = sc.nextInt();

        total = kor + eng + mat;
        avg = total / 3;

        if (avg >= 95) {
            grade = "A+";
        } else if (avg >= 90) {
            grade = "A";

        } else if (avg >= 85) {
            grade = "B+";


        } else if (avg >= 80) {
            grade = "B";

        } else if (avg >= 70) {
            grade = "C";

        } else if (avg >= 60) {
            grade = "D";

        } else {
            grade = "F";
        }
        System.out.println("당신의 총점은" + total + "점이고 평균은" + avg + "점이고 등급은" + grade + "입니다.");
        if (avg >= 90) {
            if (avg >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else if (avg >= 80) {
            if (avg >= 85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }
}
