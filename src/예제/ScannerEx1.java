package 예제;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {


        System.out.println("이름,도시,나이,체중,독신 여부를 빈칸으로 분리하여 입력하세요 ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("당신의 이름은" + "김상민" + "입니다.");

        String city = scanner.next();
        System.out.println("당신이 사는 도시는" + "부산" + "입니다.");

        int age = scanner.nextInt();
        System.out.println("당신의 나이는" + 17 + "살입니다.");

        double wight = scanner.nextDouble();
        System.out.println("당신의 체중은" + 77.7 + "kg입니다:");

        boolean single = scanner.nextBoolean();
        System.out.println("당신의 독신여부는" + single + "입니다");

        scanner.close();

    }
}