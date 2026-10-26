package lang.string.test;
/*
문제 5. str에는 파일의 이름과 확장자가 주어진다. ext에는 파일의 확장자가 주어진다.
파일명과 확장자를 분리해서 출력하라.
*/

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);

        String filename = str.substring(0, extIndex);
        String extname = str.substring(extIndex);
        System.out.println("filename = " + filename);
        System.out.println("extname = " + extname);
    }
}
