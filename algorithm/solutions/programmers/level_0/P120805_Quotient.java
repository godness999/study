package programmers.level_0;

/**
 * 문제: 몫 구하기
 * 출처: Programmers 120805
 * 난이도: Lv.0
 * <p>
 * 문제 설명
 * 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 한다.
 * <p>
 * 제한사항
 * 0 <= num1 <= 100
 * 0 <= num2 <= 100
 */

public class P120805_Quotient {
    public int quotient(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println(new P120805_Quotient().quotient(10, 5));
        System.out.println(new P120805_Quotient().quotient(7, 2));
    }
}
