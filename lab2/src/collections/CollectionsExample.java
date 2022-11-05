package collections;

import javax.swing.*;
import java.util.*;

public class CollectionsExample {
    //List
    // List를 상속받은 ArrayList 인터페이스 : 배열 자체가 만들어지는 컬렉션
    List<Integer> myArrayList = new ArrayList<>();
    // List를 상속받은 LinkedList 인터페이스 : 연결 리스트를 구현한 컬렉션
    List<Integer> myLinkedList = new LinkedList<>();

    //Set : 집합, 중복 허용 x
    Set<Integer> myHashSet = new HashSet<>();
    Set<Integer> myTreeSet = new TreeSet<>();

    //Queue
    //Queue를 상속받은 Deque 인터페이스를 정말 많이 사용
    Queue<Integer> myPriorityQueue = new PriorityQueue<>();
    Queue<Integer> myArrayDeque = new ArrayDeque<>();

    //Map
    // 보통 제네릭으로 사용하여 여러 개발을 할 수 있도록 함
    Map<String,Integer> myHashMap = new HashMap<>();
}

// 컬렉션 = 객체의 그룸을 표현하는 객체
// => 객체들을 모아두는 객체 자료형

// java는 JCF(Java Collections Framework) 제공
// JCF(Java Collections Framework) = collection들을 모아 둔 프레임워크를 제공
// 활용을 잘한다면 어디가서 자바 잘한다고 할 수 있음

// 컬렉션은 java.util.Collection 인터페이스를 상속 받는 여러 인터페이스들이 있음
// Ex) List, Set, Queue
// Map도 collection으로 분류되지만 엄밀히 따지면 상속받지 않음, 조금 다름

// 컬렉션에는 정말 다양한 인터페이스들이 있고 이를 구현하는 구현 클래스들도 많음.

// 컬렉션을 사용하는 가장 큰 이유
// 이미 구현되어 있는 자료구조를 사용하기 위함

// 실무에서 특수한 경우가 아닌 경우
// 자료구조 하나하나 직접 구현 x