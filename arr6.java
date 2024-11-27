import java.util.Scanner;

public class arr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("배열의 크기를 몇으로 하겠습니까");
//        int n = sc.nextInt();
//// 배열의 크기 지정
//        int arr5[] = new int[5];
//
//        System.out.println("점수를 입력하세요");
//        for (int i = 0; i < arr5.length; i++) {
//            arr5[i] = sc.nextInt();
//            System.out.println(i + "번 index에 저장된 내용" + arr5[i]);
//        }

        System.out.println("----------문제 7번-----------");

        System.out.println("x 값을 입력하세요");
        int x = sc.nextInt();
        int arr3[] = new int[5];
        System.out.println("10 ,20 ,30 ,40 ,50 을 역순으로 출력하세요");
        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 30;
        arr3[3] = 40;
        arr3[4] = 50;

        for(int i = 4;i>=0; i--) {
            System.out.println(i+"번째 index 내용은"+ arr3[i]);
        }

    }
}