package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args){
        // 원래는 양쪽 <> 모두 Wrapper클래스를 작성해야했지만, javaSE 7 이후부터는
        // 다이아몬드라는 개념이 도입되어 자료형을 명시하지 않아도 알아서 앞서 입력한 자료형으로 설정됩니다.
        MyGenericClass<Integer> exampleInteger = new MyGenericClass<>();
        MyGenericClass<String> exampleString = new MyGenericClass<>();

        exampleInteger.setValue(1);
        exampleString.setValue("Hello, generics!");
        System.out.println(exampleInteger.getValue());
        System.out.println(exampleString.getValue());

        List<Integer> myList = new ArrayList<>();
        addNumbers(myList);
    }


    // addNumbers(List<? super  Number> list) => Number이므로 Integer은 못 들어옴.
    // = super키워드를 통해 Bound할때는 자식 클래스로 객체를 생성하고 사용할때 오류 발생.
//    public static void addNumbers(List<? super Number > list){
    public static void addNumbers(List<Integer> list){
        for(int i=1;i<=10;i++){
            list.add(i);
        }
    }
    // bound개념이 필요한 이유: 제네릭의 특성상 데이터 타입에 대한 불확실성떄문
}


