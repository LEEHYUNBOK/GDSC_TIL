

package exception;

import java.util.Scanner;

public class ThrowExample {

    // throws문 로직 실행 중 발생한 예외의 처리를 해당 로직 호출부에서 담당하도록 함
    // 즉 예외의 처리를 나중으로 미루는 것.
    // checkChoice를 호출한 곳으로 책임 전과하는 것.
    public void checkChoice(int choice) throws NotFunnyException{
        if(choice == 1) {
            // throw로 오류를 보낼 수 있다.
            throw new NotFunnyException();
        } else {
            System.out.println("저도 집에 가고 싶습니다.");
        }
    }
    public static void main(String[] args) {
        // ThrowExample 클래스를 객체로 가져옴으로써 checkchoice 인스턴스 사용
        ThrowExample throwExample = new ThrowExample();
        Scanner scan = new Scanner(System.in);
        System.out.print("Java 스터디는 재미있습니까? (1 Yes / 2 No) :");
        int choice = scan.nextInt();

        try{
            //입력 받은 choice값을 먼저 ThrowExample 클래스의 checkchoice로 판별
            throwExample.checkChoice(choice);

        }
        // 만약 try안에서 NotFunnyException오류가 발생한다면
        catch (NotFunnyException e) {
            // 경고문 출력
            System.out.println("진심을 담아 선택해주세요");
        }
    }
}

// extends RuntimeException(기본적으로 지원하는 java 패키지)
// RuntimeException = 실행 중 발생하며 시슽ㅁ 환경적으로나 인풋 값이 잘못된 경우,
// 혹은 의도적으로 프로그래머가 잡아내기 위한 조건 등에 부합할 때 발생
// 이렇게 해주어야 throw를 받을 수 있음
class NotFunnyException extends RuntimeException {
    NotFunnyException(){
        super("공부는 항상 재미없습니다.");
    }
}