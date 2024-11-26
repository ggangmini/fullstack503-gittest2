package java_241125.src.예제;

import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요"); //1부터 50중에 홀수만 출력 : 숫자%2==0 = 짝수 를 제외한 나머지것들 출력
for (int i=1; i<=50; i++){
    if(!(i%2==0)){   // !는 반대값
        System.out.println("홀수:"+i);
    }
}
    }
}
