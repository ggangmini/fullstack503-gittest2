package 예제;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        System.out.print("몇 층인지 입력하세요");
        // 키보드로 입력된 정수 받아오기
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // 입력받은 데이터 저장용 변수
        // int input = 0;
        System.out.println(a*5 + "m" + "입니다");
        sc.close();
    }
}
