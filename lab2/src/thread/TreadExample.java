package thread;

// 스레드 하나의 프로세스 내에서 여러 작업을 동시에 실행

import java.util.ArrayList;

// Thread 클래스를 상속 받아 TreadExample 클래스에서 사용가능
public class TreadExample extends Thread{
    private int order;
    public TreadExample(int order) { this.order = order;}

    @Override
    public void run(){
        System.out.println(this.order + "번째 스레드 시작합니다.");
        try {
            // Thread를 1초 정도 잠깐 멈추어라
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.order + "번째 스레드 종료합니다.");
    }

    // 이 예제에서 스레드는 순서대로 실행되지 않으며,
    // 종료 역시 순서대로 되지 않는다는 것.
    // main 메소드마저 스레드보다 먼저 종료되어
    // 프로그램이 예상치 못한 결과를 낳을 수도 있음
//    public static void main(String[] args) {
//        for(int i =1; i<=10; i++){
//            Thread thread = new TreadExample(i);
//            thread.start();
//        }
//        System.out.println("main 메소드 종료합니다.");
//    }



    // main이 먼저 종료되는 문제를 해결하려면 join 메소드를 사용하면 됨.
    // Thread 클래스를 상속 받아야 하기 때문에 다른 클래스를 상속 받을 수 없음
    // 이를 보안하기 위해 runnalbe 인터페이스 사용
    public static void main(String[] args) {

        ArrayList<Thread> threadList = new ArrayList<>();
        for(int i =1; i<=10; i++){
            Thread thread = new TreadExample(i);
            thread.start();
            threadList.add(thread);
        }
        for(int i =0; i < threadList.size(); i++){
            Thread thread = threadList.get(i);
            try {
                // join 메소드 = 자신을 호출한 스레드가 종료될 때까지 대기하는 메소드
                thread.join();
            } catch (Exception e){

            }
        }
        System.out.println("main 메소드 종료합니다.");
    }
// Thread 클래스를 통한 스레드 구현의 치명적인 단점
// => Thread 클래스를 상속 받아야 하기 때문에 다른 클래스를 상속 받을 수 없음
// ==> 단점을 보완하기 위해 Runnable 인터페이스를 사용해 스레드 구현

}
