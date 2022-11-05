package lambda;

import  java.util.*;

public class LambdaWithCollections {
    public static void main(String[] args){
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("C");


        // List에 담긴 문자열들을 역순으로 정렬하는 프로그램
        // sort메소드를 통해 정렬해야하는데
        // Comparator 클래스의 compare 메소드를
        // 오버라이딩해서 정렬법을 변경 가능
        // But 코드 너무 복잡..
        Collections.sort(myList, new Comparator<String>() {
            @Override
            public int compare(String o1,String o2) {
                return o2.compareTo(o1);
            }
        });
        // 람다식을 통해 매소드 오버라이딩 간편, 다형성의 효율을 극대화 가능
        Collections.sort(myList,(o1,o2)->o1.compareTo(o2));

        // 그 람다식 마저도 메소드 참조 표현(::)으로 교체
        // 주의할 점 = (인스턴스의 자료형)::(메소드) 형식으로 적성해야 함
        Collections.sort(myList,String::compareTo);

        for(String s : myList){
            System.out.println(s);
        }

    }
}
