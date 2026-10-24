package programmers.level_0;

/**
 * 문제: 두 수의 곱 구하기
 * 출처: Programmers 120804
 * 난이도: Lv.0
 * <p>
 * 문제 설명
 * 정수 num1, num2가 매개변수로 주어집니다. num1과 num2를 곱한 값을 return 하도록 한다.
 * <p>
 * 제한사항
 * 0 <= num1 <= 100
 * 0 <= num2 <= 100
 */

public class P120804_MultiplyTwoNumbers {
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        System.out.println(new P120804_MultiplyTwoNumbers().multiply(3, 4));
    }
}
