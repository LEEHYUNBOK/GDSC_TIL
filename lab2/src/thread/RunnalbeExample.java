package thread;

// 스레드 하나의 프로세스 내에서 여러 작업을 동시에 실행

import java.util.ArrayList;

// 다른 클래스를 상속 받기 위해
// Runnable 인터페이스를 상속 받음
// 사실 Thread로 구현하는 것과의 차이점은 스레드 객체를 생성하는 곳 뿐
public class RunnalbeExample implements Runnable {
    private int order;
    public RunnalbeExample(int order) { this.order = order;}

    @Override
    public void run(){
        System.out.println(this.order + "번째 스레드 시작합니다.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.order + "번째 스레드 종료합니다.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threadList = new ArrayList<>();
        for(int i =1; i<=10; i++){
            Thread thread = new Thread(new RunnalbeExample(i));
            thread.start();
            threadList.add(thread);
        }
        for(int i =0; i < threadList.size(); i++){
            Thread thread = threadList.get(i);
            try {
                thread.join();
            } catch (Exception e){

            }
        }
        System.out.println("main 메소드 종료합니다.");
    }
}


