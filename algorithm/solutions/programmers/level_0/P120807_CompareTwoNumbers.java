package programmers.level_0;

/**
 * 문제: 숫자 비교하기
 * 출처: Programmers 120807
 * 난이도: Lv.0
 * <p>
 * 문제 설명
 * 정수 num1, num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 return 하도록 한다.
 * <p>
 * 제한사항
 * 0 <= num1 <= 10,000
 * 0 <= num2 <= 10,000
 */

public class P120807_CompareTwoNumbers {
    public int compare(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        P120807_CompareTwoNumbers result = new P120807_CompareTwoNumbers();
        System.out.println(result.compare(2, 3));
        System.out.println(result.compare(11, 11));
        System.out.println(result.compare(7, 99));
    }
}
