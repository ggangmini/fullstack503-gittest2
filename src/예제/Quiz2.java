package java_241125.src.예제;

import java.util.Scanner;
// 입력 처리 출력 순으로 진행
public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점 (x,y)의 좌표를 입력하세요>>");
        int a = sc.nextInt();
        int b = sc.nextInt();


        if(a>=50 && a<=100 && b>=50 && b<=100){
            System.out.println("직사각형 안에 있습니다.");
        }
        else {
            System.out.println("직사각형 안에 있지 않습니다.");
        }
    }
}
