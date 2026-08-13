package enumeration.test.ex1;
/*
문제 2. 인증 등급 열거형 조회하기
AuthGradeMain1이라는 클래스를 만들고 다음 결과가 출력되도록 코드를 작성해라.
grade=GUEST, level=1, 설명=손님
grade=LOGIN, level=2, 설명=로그인 회원
grade=ADMIN, level=3, 설명=관리자
 */

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade=" + value.name() + ", level=" + value.getLevel() + ", 설명=" + value.getDescription());
        }
    }
}
