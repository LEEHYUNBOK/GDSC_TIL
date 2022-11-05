package optional;

import java.util.Optional;

public class OptionalMethodExample {
    public static void main(String[] args) {
        MyData lee = new MyData();
        lee.setMyAge(24);
        lee.setMyName("Lee");

        // Filter
        Optional<MyData> leeOpt = Optional.of(lee);
        System.out.println(leeOpt.filter(a->a.getMyAge()==24));

        // Map
        System.out.println(leeOpt.map(s -> s.getMyName().toUpperCase()));

        // Get
        System.out.println(leeOpt.map(s->s.getMyName().toUpperCase()).get());

        //isPresent = 값 여부 확인
        System.out.println(leeOpt.isPresent());

        //ifPresent = 값이 있으면은 출력
        leeOpt.ifPresent(System.out::println);
    }
}
