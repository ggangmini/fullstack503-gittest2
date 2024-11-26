public class SwitchEx {
    public static void main(String[] args) {

        // Math.random() : 0.0 ~ 0.9까지의 숫자 중 랜덤으로 숫자를 출력
        // (int)(Math.random() * 출력하고싶은 최대값) + 최소값;


        // switch ~ case : if 문과 함께 프로그래밍에서 자주 사용하는 제어문
        // if 문과는 다르게 조건식이 아닌 값을 입력
        // switch 문과 함께 사용하는 case 와 동일한 값을 찾아서 실행
        // 입력한 값이 case와 일치하는 것이 없을 경우 default 실행
        // default를 생략할 수 있음
        // default 는 if 문의 else 문과 비슷한 역할을 하며 생략 가능함
        // case 에 나올 수 있는 모든경우의 수를 입력하거나 사용자가 의도적으로 생략할 수 있음
        // break 문을 만나면 switch ~ case 문을 종료하고 탈출
        // 문자열로 비교가능

        // 주의점
        // -case 안에는 반드시 break 문이 있어야함
        // -case 문 안에 break 문이 없을 경우 다음 case 문을 실행
        // break 가 없으면 break 가 나올때까지 계속 실행

        // if 문과의 차이점
        // -if 문은 조건식을 사용하기 때문에 조건의 범위 설정이 가능함
        // -switch 문은 값을 사용하기 때문에 조건의 범위 설정이 불가능
        // - switch 문은 주로 지정된 값을 비교 시 사용

        int num = (int) (Math.random() * 6) + 1;

        switch (num) {
            case 1:
            System.out.println("1번이 나왔습니다.");
            break;

            case 2:
            System.out.println("2번이 나왔습니다");
            break;

            case 3:
                System.out.println("3번이 나왔습니다");
                break;

            case 4:
                System.out.println("4번이 나왔습니다");
                break;

            case 5:
                System.out.println("5번이 나왔습니다");
                break;

                default:
                    System.out.println("6번이 나왔습니다");
                    break;
        }
    }
}
