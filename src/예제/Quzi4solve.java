package java_241125.src.예제;

import java.util.Scanner; // 책89페이지 9번문제

public class Quzi4solve {
    public static void main(String[] args) {
        // 1.사용자 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 10의자리 숫자를 저장할 변수
        int first = n / 10;
        // 1의 자리 숫자를 저장할 변수
        int second = n % 10;

        if (first == 0) {
            first = 1;
        }

        if (second == 0) {
            second = 1;
        }
// 입력받은 숫자가 3의 배수인지 아닌지를 저장하는 변수
        boolean resultfirst = false;
        boolean resultsecond = false;

        System.out.println("1~99 사이의 정수를 입력하세요>>");
        // 2.1~99까지의 정수
        if (n > 0) {
            if (n < 100) {
                // 3. 3,6,9 중하나라도 있으면 박수짝 출력
                if (first % 3 == 0) {
                    resultfirst = true;
                }
                if (second % 3 == 0) {
                    resultsecond = true;
                }
                // or 연산을 통해서 10의 자리와 1의 자리에 3의 배수가 1개라도 존재하는지 확인
                if (resultfirst || resultsecond) {
                    // and 연산을 통해서10의 자리와 1의자리에 모두 3의 배수가 있는지 확인
                    if (resultfirst && resultsecond) {
                        System.out.println("박수짝짝");
                    } else {
                        System.out.println("박수짝");
                    }
                } else {
                    System.out.println("박수없음");
                }
            }
            else {
                System.out.println("1~99 사이의 정수로 입력해주세요");
            }
        }
        else {
            System.out.println("1~99 사이의 정수로 입력해주세요");
        }
    }
}
