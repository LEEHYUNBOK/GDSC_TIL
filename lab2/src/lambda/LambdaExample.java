package lambda;

import java.util.Scanner;

public class LambdaExample {
    // 람다식 기본 형태
    // (매개 변수)->{함수 식;}
    // Ex) (int a) -> {System.out.println(a);}
    // 매개변수, 로직 각각 하나면 괄호 제거 가능
    // Ex) a -> System.out.println(a);
    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        // 메소드 오버라이딩을 간편하게 해줌
        // 함수형 인터페이스에있는 멤버 메소드를 람다식으로 아주 간단하게 오버라이딩하고
        // 원하는 결과를 출력하는 함수로 사용
        // 람다식의 가장 큰 장점 = 오버라이딩을 아주 쉽게 할 수 있다는 점
        PrintResult pr = (a,b) -> a>b?a:b;
        System.out.println(pr.printResult(num1,num2));
    }
}

// 함수형 인터페이스
@FunctionalInterface
interface PrintResult{
    int printResult(int a,int b);
}

// 람다식(Lambda Expression)
// 함수를 하나의 식(Expression)으로 나타낸 것

// 식으로 나타내는 것이기 때문에 따로 이름이 필요 없는 익명함수(Anonymous Function)
// 변수처럼 사용도 가능, 매개 변수로 전달도 가능

// 극한의 효율을 추구하기 때문에 생략 가능한 표현이 많음
// 매개 변수 자료형이 코드 내에서 유추 가능
// 함수식도 하나면 자료형, return 키워드 생략 가능

// 람다 사용시 함수형 인터페이스 사용
// 함수형 인터페이스는 멤버 메서도를 단 하나만 가지고 있어
// 함수처럼 사용 가능한 인터페이스

// @FunctionalInterface 어노테이션을 인터페이스 위에 적어주면
// 해당 인터페이스는 멤버로 함수 하나만 가질 수 있게 강제됨