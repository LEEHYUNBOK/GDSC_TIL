package exception;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int result;

        try {
            result = A / B;
            System.out.println(result);
        }
        //
        // catch (Exception e ) {
        // 수학적으로 말이 되지 않을 때 나오는 예외
        catch (ArithmeticException k){
            System.out.println("0으로는 나눌 수 없습니다.");
        }
        // 예외처리와 상관 없이 항상 실행합니다.
        // 예외가 발생하더라도 실행되어야 하는 코드
        finally {
            System.out.println("정말 재미있는 Java 스터디!");
        }
    }
}
