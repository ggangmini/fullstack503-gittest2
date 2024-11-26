public class LogiclaOpEx {
    public static void main(String[] args) {

        int charCode = 'A';

        // 문자 A 는 10진수로 65임
        if((charCode >= 65) && (charCode <=90)) {
            System.out.println("대문자 입니다.");
        }

// && 둘다 사실이여야함
        if((charCode >= 97) && (charCode <=122)) {
            System.out.println("소문자 입니다");
        }
// ! 는 반대값을 의미  즉, 48보다 크거나 같다 와 57보다 작거나 같다 된다.
        //charCode의 값이 65이므로 charCode < 48은 false이나 ! 연산에 의해서 결과값이 true가 됨
    // charCode의 값이 65이므로 charCode <57은 false이나 ! 연산에 의해서 결과값이 true가 됨
        if(!(charCode < 48) && !(charCode > 57)){
            System.out.println("0~9까지 숫자 입니다.");
        }

        int value = 4;
        // value % 2 연산이 먼저 발생하고 결과값 == 0 연산이 진행 , true
//  value % 3 연산이 먼저 발생하고 결과값 == 0 연산이 진행, false
        // 왼쪽 결과값 true 와 오른쪽 결과값 flase 를 or 연산시 true
        if((value % 2 == 0) || (value % 3 == 0)){
            System.out.println("2 또는 3의 배수 입니다.");
        }




    }
}
