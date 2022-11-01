package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Target(ElementType.[어노테이션 적용 대상])
// @Retention(RetentionPolicy.[어노테이션 적용 범위])
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)


public @interface CustomAnnotation {

    // public 타입 메소드이름() default 값;
    public int myAge() default 24;
}
// @Override 어노테이션
// 어노테이션은 주석이란는 뜻을 가진 단어
// 어노테이션은 주석과 같은 데이터를 위한 데이터(메타데이터)를 알려줍니다.
// 즉, 어노테이션을 붙인 코드(데이터)에 대한 정보(데이터)를 줍니다.


/* ※ 직접 만든 어노테이션은 무분별하게 사용 x
 내가 작성한 코드를 영원히 나만 보는게 아니라면
 다른개발자가 내 커스텀 어노테이션이 무슨 역할을 하는지
 하나하나 확인해야하는 불상사 발생 가능 */



// @Target 어노테이션의 파라미터 ElementType의 종류
// ● ElementType.PACKAGE : 패키지
// ● ElementType.TYPE : 타입
// ● ElementType.ANNOTATION_TYPE : 어노테이션 타입
// ● ElementType.CONSTRUCTOR : 생성자
// ● ElementType.FIELD : 멤버 변수
// ● ElementType.LOCAL_VARIABLE : 지역 변수
// ● ElementType.METHOD : 메소드
// ● ElementType.PARAMETER : 파라미터
// ● ElementType.TYPE_PARAMETER : 파라미터 타입
// ● ElementType.TYPE_USE : 타입

// @Retention 어노테이션의 파라미터 RetentionPolicy의 종류
// ● RetentionPolicy.SOURCE : 컴파일 전까지만 유효.
// ● RetentionPolicy.CLASS : 컴파일러가 클래스를 참조할 때까지 유효.
// ● RetentionPolicy.RUNTIME : 컴파일 이후에도 JVM에 의해 계속 참조가 가능.


// 또한, 어노테이션을 직접 작성 후 사용할 때 지켜야할 규칙
// ● 요소의 타입은 기본형, String, enum, 어노테이션, Class만 허용된다.
// ● 괄호안에 매개변수를 선언할 수 없다.
// ● 예외를 선언할 수 없다.
// ● 요소의 타입을 매개변수로 정의할 수 없다.