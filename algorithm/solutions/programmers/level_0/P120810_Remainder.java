package programmers.level_0;

/**
 * 문제: 나머지 구하기
 * 출처: Programmers 120810
 * 난이도: Lv.0
 * <p>
 * 문제 설명
 * 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 나머지를 return 하도록 한다.
 * <p>
 * 제한사항
 * 0 <= num1 <= 100
 * 0 <= num2 <= 100
 */

public class P120810_Remainder {
    public int remainder(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        System.out.println(new P120810_Remainder().remainder(3, 2));
        System.out.println(new P120810_Remainder().remainder(10, 5));
    }
}
