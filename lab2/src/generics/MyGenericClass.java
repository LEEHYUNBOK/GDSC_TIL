// 제네릭 = 클래스 내부에서 사용할 자료형을 외부에서 사용자가 선언 시에 직접 지정할 수 있도록 한 개념
// 즉 , 어떤 클래스가 자료형에 전혀 영향을 받지 않고
// 모든 자료형에 같은 기능을 제공하도록 하는 일종의 다향성입니다.
// java 내장 자료구조들을 사용할 떄 <>안에 Wrapper 클래슬르 통해 자료형을 지정하는 것
// Ex) Stack<Integer> myStack = new Stack<>();

package generics;
// 타입 파라미터의 종류
// ● E : Element (Java 컬렉션 프레임워크에서 광범위하게 사용됨)
// ● K : Key
// ● N : Number
// ● T : Type
// ● V : Value
// ● ? : Wildcard (Unknown Type, 메소드와 변수에서만)


// <T extends Number> = number의 자식들만 올 수 있다. 즉 upper bound를 사용
//public class MyGenericClass<T extends  Number> {
public class MyGenericClass<T> {
    private T value;
    // 어떤 자료형이든 입력 받을 수 있고 불필요한 형변환이 일어나지 않게 됨.
    // 자료형마다 여러 각각 클래스를 구현해주지 않아도 되어
    // 다형성의 이점을 온전히 가질 수 있게 됨
    public T getValue(){
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}

// 타입 파라미터 관련해서 2가지
// Unvbounded : 어떤 값을 넣어도 상관 없는 타입
// Bounded : 타입을 넣어줄 때 조건이 있는 것
// 지정한 클래스와 그 자식들만 가능하는 Upper Bound => 모든 파라미터 타입 가능
// 지정한 클래스와 그 부모들만 가능하게 하는 Lower Bound => Wildcard를 사용해서 구현 가능
