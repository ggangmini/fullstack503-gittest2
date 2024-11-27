import java.util.Scanner;

public class BreakContinueEx {

    public static void main(String[] args) {
        System.out.println("------break 사용--------");

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println("현재 i의 값:" + i);
        }

        System.out.println("-----continue사용------");

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println("현재 i의 값:" + i);
        }


        System.out.println("\n--------while문에 continue---------");
// while 문에서 continue 문을 사용할 경우 continue문이 실행되는 위치가 증감식보다 먼저 있을 경우
        // 초기화 변수 값이 변경되지 않아서 무한루프에 빠질 수 있음
        int c2 = 0;
        while (c2 < 10) {
            c2++;
            if (c2 == 3) {
                continue;
            }
            System.out.println("현재 c2의 값 : " + c2);
//            c2++;
        }

        System.out.println("\n------중첩 반복문에서 break/continue-----");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    // 중첩 반복문에서 break를 만나면 가장 가까운(현재 실행중인) 반복문을 종료
                    System.out.println("break 실행");
                    break;
                }
                System.out.println("i의 값 :" + i + ",j의 값:" + j);
            }
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    // 중첩 반복문에서 continue를 만나면 가장 가까운(현재 실행중인) 반복문의 현재 루프를 종료하고 다음 루프로 이동
                    System.out.println("continue 실행");
                    continue;
                }
                System.out.println("i의 값 :" + i + ",j의 값:" + j);
            }
            System.out.println("--------------------");
        }

        //문제 3) 사용자 입력을 통해서 2 ~ 9까지의 정수 중 하나를 입력받고, 해당 입력받은
        // 숫자의 해당하는 구구단 단수를 제외한 모든 구구단을 출력하는 프로그램을 작성하세요

        //문제 4) 사용자 입력을 통해서 2 ~ 9까지의 정수 중 하나를 입력받고,
        // 입력받은 숫자에 해당하는 구구단 단수 전까지 모든 구구단을 출력하는 프로그램을 작성하세요


        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");

        int b = sc.nextInt();

        for (int i = 2; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            if (b == i){
                break;}

        }
        System.out.println("2번째 정수를 입력하세요");
        int h = sc.nextInt();

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (b == i) {continue;
                }
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }


    }
}
