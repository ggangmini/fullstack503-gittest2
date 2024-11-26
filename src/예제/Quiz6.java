package java_241125.src.예제;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        //문제 6) for 문을 사용하여 사용자가 입력한 단수의 구구단을 출력하는 프로그램을 작성하세요
       // 출력형식(5단) :5 * 1= 5 ,5 * 2 = 10 ,5 * 3 = 15, 5 * 4 = 20

    // 문제7) while문을 사용하여 사용자가 입력한 단수의 구구단을 출력하는 프로그램을 작성하세요

    // 문제8) 1 부터 50 까지의 숫자 중 홀수만 화면에 출력하는 프로그램을 반복문을 사용하여 작성하세요
        //반복문 안에 제어문 사용
        Scanner sc= new Scanner(System.in);
        System.out.println("몇단을 할지 숫자를 입력해주세요");

        int x=sc.nextInt();
        for(int i=1; i<10; i++) {
            System.out.println(x + "*"+ i+"="+x*i);
        }
System.out.println("구구단을 시작합니다");

        System.out.println("\n---------문제 7번---------\n");
        System.out.println("숫자를 입력해주세요>>");

        int i = 1;
        int y=sc.nextInt();
        while(i<10) {
            System.out.println(y + "*"+ i+"="+y*i);
            i++;
        }

        System.out.println("\n------------------\n");
        System.out.println("숫자를 입력해주세요");




        }
    }

