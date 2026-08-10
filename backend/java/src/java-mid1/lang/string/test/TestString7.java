package lang.string.test;

/*
문제 7. 문자의 양쪽 공백을 제거하라.
ex) "    Hello Java   " -> "Hello Java"
 */

public class TestString7 {

    public static void main(String[] args) {
        String original = "    Hello Java   ";
        String trimmed = original.trim();

        System.out.println(trimmed);
    }
}
