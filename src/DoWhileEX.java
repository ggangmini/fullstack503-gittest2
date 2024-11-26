package java_241125.src;
import java.util.Scanner;

public class DoWhileEX {
    public static void main(String[] args) {

        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 누르세요");

        Scanner sc = new Scanner(System.in);
        // 사용자 키보드 입력값을 저장하기 위한 변수
        String input;

        // do ~ while : while 문과 기본적으로 동일한 반복문이지만 무조건 1번은 실행하는 반복문
        do {
            System.out.println(">");
            input = sc.nextLine();
            System.out.println("입력한 메세지 : " + input);
            // 사용자가 입력한 문자가 "q"와 같은지 확인
        } while (!(input.equals("q"))); // ! = 부정연산자 반대값을 나타냄

        System.out.println();
        System.out.println("프로그램 종료");

        System.out.println("\n---------일반 while문 사용 시 ---------\n");

        input = sc.nextLine();
        //  input은 이미 q라고 나옴

        while (!input.equals("q")) ; // 이  while 문은 q 가 아닌 값이 들어오면 종료되고 q가 들어온다면 연속진행!
        {
            System.out.println(">");
            input = sc.nextLine();
            System.out.println("입력한 메세지 : " + input);
            // 사용자가 입력한 문자가 "q"와 같은지 확인
        }
        System.out.println();
        System.out.println("프로그램 종료");

    }
}
