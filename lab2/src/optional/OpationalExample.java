package optional;

import java.util.Optional;

public class OpationalExample {
    public static void main(String[] args){
        String nullableStr = null;
        String neverNullStr = "null이면 안됩니다!";
    
        
        // 옵셔널은 메소드 체이닝을 활용
        // 먼저 of와 ofNullable 메소드를 통해 인스터스의 null 가능 여부 결정
        // null이 아닌 값이 넘어오면 해당 값을 가진 Optional 인스턴스 반환
        Optional<String> optNotNull = Optional.of(neverNullStr);

        // null이 넘어오면 빈 Optional 반환(null이 아닌 값이 넘어오면 of와 같은 동작)t
        Optional<String> optNullable = Optional.ofNullable(nullableStr);

        System.out.println(optNotNull);
        System.out.println(optNullable);
    }
}


// 옵셔널(Optional)은 Java8 이후로 등장한
// NullPointerException을 더 효과적으로 처리 가능한 클래스
// 예외 처리나 조건문으로 처리 가능 하지만
// 코드가 너무 길어지고 재사용은 거의 불가능할 정도로 NPE가 발생할 상황은 다향

// 옵셔널 객체 = 기본적으로 Wrapper(= 감싸는) 클래스
// Integer나 Double처럼 내부의 값을 감싸 클래스의 내부 메소드를 사용 가능하게 해줌

// 즉 옵셔녈은 프로그래머가 사용하는 인스턴스를 NPE로부터 보호하고
// null관련 다양한 메소드를 사용 가능하게 도와주는 클래스