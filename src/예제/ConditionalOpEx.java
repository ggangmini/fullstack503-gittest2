package 예제;

public class ConditionalOpEx {
    public static void main(String[] args) {

        int score = 85;

        char grade = (score > 90) ? 'A' : 'B';

        System.out.println("당신의 점수는" + score +"점 이며, 등급은 " + grade + "입니다.");

    }
}
