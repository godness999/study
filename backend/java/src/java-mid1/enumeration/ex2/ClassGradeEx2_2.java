package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        /*
        ClassGrade newClassGrade = new ClassGrade();
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);
        */
    }
}
// private 생성자를 사용해서 외부에서 ClassGrade를 임의로 생성하지 못하게 막았다.
/*
< 타입 안전 열거형 패턴의 장점 >
- 타입 안정성 향상: 정해진 객체만 사용할 수 있기 때문에, 잘못된 값을 입력하는 문제를 근본적으로 방지할 수 있다.
- 데이터 일관성: 정해진 객체만 사용하므로 데이터의 일관성이 보장된다.

----- 조금 더 자세히 -----
- 제한된 인스턴스 생성: 클래스는 사전에 정의된 몇 개의 인스턴스만 생성하고, 외부에서는 이 인스턴스들만 사용할 수 있도록 한다.
이를 통해 미리 정의된 값들만 사용하도록 보장한다.

- 타입 안전성: 이 패턴을 사용하면, 잘못된 값이 할당되거나 사용되는 것을 컴파일 시점에 방지할 수 있다.
예를 들어, 특정 메서드가 특정 열거형 타입의 값을 요구한다면, 오직 그 타입의 인스턴스만 전달할 수 있다.
여기서는 메서드의 매개변수로 ClassGrade를 사용하는 경우, 앞서 열거한 BASIC, GOLD, DIAMOND만 사용할 수 있다.
 */
