import java.util.Scanner;

public class switchNoBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1 ~ 10까지의 숫자를 입력해주세요>>");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("입력 숫자1");


            case 2:
                System.out.println("입력 숫자2");
            case 3:
                System.out.println("입력 숫자3");

            case 4:
                System.out.println("입력 숫자4");
                break;
            case 5:
                System.out.println("입력 숫자5");
                break;
// 개발자가 의도적으로 break를 생략
            case 6:


            case 7:


            case 8:


            default:
                System.out.println("입력 숫자 9나 10");

        }
    }
}
