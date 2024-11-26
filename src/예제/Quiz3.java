package java_241125.src.예제;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("돈의 액수를 입력하세요>>");

        int all = sc.nextInt();
        int w50000 = all / 50000;
        int w10000 = (all % 50000) / 10000;
        int w1000 = (((all % 50000)%10000))/1000;
        int w500 = ((((all % 50000)%10000))%1000)/500;
        int w100 = (((((all % 50000)%10000))%1000)%500)/100;

        System.out.println( w50000 + "/" + w10000 + "/" + w1000 + "/" + w500 + "/" + w100 );

    }
}
