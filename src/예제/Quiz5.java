package java_241125.src.예제;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("논리 연산을 입력하세요>>");
// 논리 타입 데이터를 입력받아 변수에 저장
boolean a = sc.nextBoolean();

// 문자열 타입의 데이터를 입력받아 변수에 저장
String op = sc.next();
        boolean b = sc.nextBoolean();

        // 최종결과를 저장할 변수
        boolean result = false;

// switch ~ case 문으로 AND 연산인지 OR 연산인지 확인
 switch (op) {
     case "AND":
         result = a && b;
         break;

         case "OR":
             result = a || b;
             break;
// 논리연산자에서 and 두개다 true 일 때 true이고 or은 둘중한개라도 true면 true 값이 나옴//
     default:
         System.out.println("잘못된 입력 입니다");
        }
        System.out.println(result);
 sc.close();
    }



}
