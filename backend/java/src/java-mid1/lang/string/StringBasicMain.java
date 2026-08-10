package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello"; //기존
        String str2 = new String("hello"); //변경

        //편의상 쌍따옴표로 문자열을 감싸면 자바 언어에서 new String("hello")와 같이 변경해준다.

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
