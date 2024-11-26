package java_241125.src.예제;

import java.util.Scanner; // 문제2) 책 87페이지 4번 문제

public class Quiz2solve {
    public static void main(String[] args) {
        // 키보드 입력용
        Scanner sc = new Scanner(System.in);

        //입력된 데이터 저장용 변수
        // 사용자가 입력한 x,y가 지정된 사각형 안에 있는지 아닌지의 결과를 저장하는 변수
        int x = 0;
        int y = 0;
        System.out.println("점(x,y)의 좌표를 입력해주세요");
        x = sc.nextInt();
        y = sc.nextInt();
        String result = "";

        boolean resultx = false;
        boolean resulty = false;

        if(x>=50) {
            if (x <= 100) {
                resultx = true;
            } else {
                resultx = false;
            }
        }
//        else{
//                resultx = false;
//            }



        if(y>=50){
            if(y <=100){
                resulty = true;
            }
        else{
            resulty = false;
            }
        }
//        else{
//            resulty = false;
//        }
        if(resultx && resulty){
            result = "내에";
        }
        else{
            result = "밖에";
        }






        System.out.println("점("+x+","+y+")은 (50,50) 과 (100,100)의 사각형" +result+"에 있습니다.");


    }
}
