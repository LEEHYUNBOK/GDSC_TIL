package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args){
        List<String> list = Arrays.asList("lee","han","cho");
        List<String> concatTarget = Arrays.asList("GDSC CORE");
        List<List<String>> complexList = Arrays.asList(
                Arrays.asList("Core", "lee"),
                Arrays.asList("Core", "han"),
                Arrays.asList("Core", "cho")
        );
        List<Integer> numList = Arrays.asList(1,2,3,4,5);

        // 스트림 생성
        // 컬렉션이나 배열을 .stream 메소드로 스트림으로 만드는 방법
        Stream<String> listStream = list.stream();
        // 기본형 스트림을 직접 생성하는 방법
        IntStream intStream = IntStream.range(1,5); // [1, 2, 3, 4]
        LongStream longStream = LongStream.rangeClosed(1,5); // [1, 2, 3, 4, 5]
        // 두 스트림을 합쳐 새 스트림을 만드는 방법
        Stream<String> unitedStream = Stream.concat(concatTarget.stream(),listStream);

        //스트림 가공하기
        // Filtering
        System.out.println("Filtering : "+list.stream().filter(name->name.contains("h")).collect(Collectors.toList()));
        // Mapping
        System.out.println("Mapping : "+list.stream().map(String::toUpperCase).collect(Collectors.toList()));
        // FlatMapping = 한 차원 낮추어 배열로 변경, ex) 배열을 2차원을 1차원으로 변경
        System.out.println("FlatMapping : "+complexList.stream().flatMap(Collection::stream).map(String::toUpperCase).collect(Collectors.toList()));
        // Sorting
        System.out.println("Sorting : "+list.stream().sorted().collect(Collectors.toList()));
        // 역순
        System.out.println("Sorting 역순: "+list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        // Interating
        System.out.print("Interating : ");
        list.stream().peek(System.out::println).collect(Collectors.joining());
        System.out.println();

        // 스트림 결과 만들기
        // Calculating
        // IntStream 은 sum을 지원함
        long count = intStream.count();
        System.out.println("count : "+count);
        long sum = longStream.sum();
        System.out.println("sum : "+sum);
        // 기본 stream은 reduce를 통해 계산 해야됨
        //Reduction
        System.out.println("Reduction : "+numList.stream().reduce(0,Integer::sum));
        //Collecting
        System.out.println("Collecting : "+list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
        );
        //Matching
        System.out.println("Matching : "+list.stream().allMatch(s->s.length()==3));
        //Interating
        System.out.print("Interating : ");
        list.stream().forEach(System.out::println);

    }
}


// 스트림 등장 이전
// 배열이나 컬렉션에 저장된 데이터를 처리할 때 반복문을 사용해야했습니다.
// But 불필요하게 코드가 중복되고 가독성이 떨어짐

// 스트림 = 연속적인 데이터에 대한 처리를 편리하게 하는 기술
// 스트림(Stream)은 Java 8에서 추가

// 옵셔널과 마찬가지로 메소드 체이닝을 통해
// 배열이나 컬렉션의 데이터를 스트림으로 만들고(생성하기)
// 스트림으로 들어온 데이터들을 가공해서(가공하기)
// 원하는 형태로 결과물을 만듦