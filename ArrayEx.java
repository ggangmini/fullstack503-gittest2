import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {

        // 배열 : 하나의 배열명으로 지정한 데이터 타입의 데이터를 여러개 저장할 수 있는 데이터 타입
        // 배열은 index를 사용하여 원하는 위치의 데이터를 저장하거나 사용할 수 있음.
        // 배열도 참조 타입이기 때문에 null을 저장할 수 있음
        // 배열은 한번 생성되면 배열의 크기를 변경할 수 없음

        // 사용방법(선언)
        // 1.데이터타입 배열명 [ ]= { 값1,값2,값3,...};
        // 배열을 선언과 동시에 데이터를 입력
        // 데이터 입력 시 '{}' 를 사용하고, 각각의 데이터는 , 로 구분
        // 선언과 동시에 입력하는 데이터이 수에 따라서 배열의 크기가 결정
        // 배열 객체가 생성되어 있는 상태 (배열의 기능을 다 사용 가능)

        // 2.데이터타입 배열명[] = new 데이터타입[크기];
        // 배열의 크기를 미리 지정하고 빈 배열을 생성함
        // 배열 객체가 생성되어 있는 상태 (배열의 기능을 다 사용가능)

        // 3.데이터타입 배열명[ ];
        // 배열명 [ ] = new 데이터타입[크기];
        // 배열명 [ ] = new 데이터타입 [ ] {값1,값2,...};
        // 배열 크기는 지정하지 않고 배열 이름만 미리 지정하여 선언 (
        // 배열이 완전히 생성된 것이 아니기 때문에 배열의 기능 사용 불가.
        // 배열명 = {값1,값2,...}; 이러한 형태는 사용이 불가능(new 필수)


        // 사용방법 (값 저장, 사용)
        // 배열명[index] = 데이터; // 배열의 지정한 index 위치에 데이터 저장
        // 배열명 [index]; // 배열의 지정한 index위치에 있는 데이터 가져오기

        System.out.println("----------1번 방식으로 배열 선언---------");
        int scores[] = {80, 90, 70, 100, 80};
        System.out.println(scores);
        System.out.println(scores.length);
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);

        System.out.println("\n------2번 방식으로 배열 선언-----------");
        int arr2[] = new int[5];
        System.out.println(arr2);
        System.out.println(arr2.length);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);

// 저장방법
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;
// 저장된 값 가져오기
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);


        System.out.println("\n------3번 방식으로 배열 선언-----------");
// 배열 변수를 선언만 함
        int arr3[];
// 초기화를 하지 않으면 사용 불가
//        System.out.println{arr3);
//System.out.println(arr3.length);

        arr3 = new int[3];
        System.out.println(arr3);
        System.out.println(arr3.length);

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 30;

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

        int arr4[];
        // 배열명만 미리 선언하고, {}타입으로 데이터를 나중에 입력하는 것은 불가능
        // arr4 = {10,20,30};
        arr4 = new int[]{10, 20, 30};

        System.out.println(arr4);
        System.out.println(arr4.length);
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);

        System.out.println("\n---------배열과 반복문--------");

        // 반복문을 사용하면 배열에 저장된 내용을 쉽게 모두 출력할 수 있음
        int arr5[] = new int[10];
        // 배열의 특정 위치에 데이터 저장하기
        arr5[0] = 10;
        arr5[1] = 20;
        arr5[2] = 30;
        arr5[3] = 40;
        arr5[4] = 50;
        arr5[5] = 60;
        arr5[6] = 70;
        arr5[7] = 80;
        arr5[8] = 90;
        arr5[9] = 100;

        // 배열에 저장된 내용을 직접 모두 출력
        System.out.println(arr5[0]);
        System.out.println(arr5[1]);
        System.out.println(arr5[2]);
        System.out.println(arr5[3]);
        System.out.println(arr5[4]);
        System.out.println(arr5[5]);
        System.out.println(arr5[6]);
        System.out.println(arr5[7]);
        System.out.println(arr5[8]);
        System.out.println(arr5[9]);

        // 반복문을 사용하여 배열의 모든 내용을 순서대로 출력
        for (int i = 0; i > arr5.length; i++) {
            System.out.println(arr5[i]);
        }

        // 배열 사용 중 주의사항
        // 배열의 최대 크기를 벗어나서 데이터를 저장하거나 가져올 수 없음
//        System.out.println(arr5[10]);

        // 문제 5) int 타입의 배열을 10크기로 지정하여 생성하고 데이터를 1 ~ 10까지 각각의 index에
        // 저장한 후 배열의 저장된 모든 데이터의 총합을 구하는 프로그램을 작성하세요.

        // 문제 6) 사용자 입력을 통해서 배열의 크기를 지정하고, 지정된 배열의 크기만큼
        // 1 ~ 100 까지의 숫자를 입력받아 저장 후 배열의 모든 내용을 출력하는 프로그램을 작성하세요.
        // 예시) 생성하려는 배열의 크기를 입력하세요 (최대 10)> 5
        // 예시) 배열에 저장할 데이터를 입력하세요  (1 ~ 100) >

        // 예시 x번 index에 저장된 내용 : 10

        System.out.println("저장된 데이터의 총합을 구하세요");
        int num3[] = new int[10];
        // int num3[] = {1,2,3,4,5,6,7,8,9,10};
        // index 는 0 에서 9까지이고 length는 10이다
        System.out.println(num3);
        System.out.println(num3.length);
        num3[0] = 10;
        num3[1] = 20;
        num3[2] = 30;
        num3[3] = 40;
        num3[4] = 50;
        num3[5] = 60;
        num3[6] = 70;
        num3[7] = 80;
        num3[8] = 90;
        num3[9] = 100;

        System.out.println(num3[0]);
        System.out.println(num3[1]);
        System.out.println(num3[2]);
        System.out.println(num3[3]);
        System.out.println(num3[4]);
        System.out.println(num3[5]);
        System.out.println(num3[6]);
        System.out.println(num3[7]);
        System.out.println(num3[8]);
        System.out.println(num3[9]);

        int total = 0;
        for (int i = 0; i < num3.length; i++) {
            System.out.println(num3[i]);
            total = total + num3[i];
        }
        System.out.println("저장된 데이터의 총합은" + total);




System.out.println("---------문제 6번-----------------");
        System.out.println("정수를 입력하세요");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr6[] = new int[5];
for (int i =0; i < arr6.length; i++) {
    System.out.println(arr6[i]);
}




sc.close();
    }
}