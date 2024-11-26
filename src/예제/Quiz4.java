package java_241125.src.예제;

import java.util.Scanner;

// 3,6,9가 들어가면 박수짝 , 두개 있는경우 박수짝짝, 하나도 없으면 박수없음 출력//
public class Quiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~99 사이의 정수를 입력하세요");

        int n = sc.nextInt();


        if (n >= 1 &&  n < 10) {
            if(n % 3 == 0){
            System.out.println("박수짝");}
            else{
                System.out.println("박수없음");
            }
        } else if (n >= 10 && n <= 99) {
            int first = n / 10;
            int second = n % 10;

            if (first % 3 == 0 && second % 3 == 0 ) {
System.out.println("박수짝짝");

            }
           else if (first % 3 == 0) {
                System.out.println("박수짝");
            } else if (second % 3 == 0) {
                System.out.println("박수짝");
            }
else{
    System.out.println("박수없음");
            }

        }
    }
}
