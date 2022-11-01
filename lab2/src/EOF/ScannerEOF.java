// EOF = “End of file”
// 데이터 소스로부터 더 이상 읽어들일 수 있는 데이터가 없음
package EOF;
import java.util.Scanner;


public class ScannerEOF {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // 입력데이터를 문자열로 받으며 EOF를 체크
        // 입력을 계속 받겠다.
        // hasNext()에 null 이 들어오면 false 반환
        // ctrl + d 로 종료 가능
        while(scan.hasNext()) { // EOF인 경우 hasNext()이 false로 반복문을 빠져나옴
            System.out.println(scan.nextLine());
        }
        System.out.println("Scanner EOF");
    }
}


// EOF는 코딩테스트에서
// 무한 루프 탈출 조건으로 사용하라고 나올 수도 있음
// 본래의 목적은 코테가 아닌 데이터의 끝을 확인하는데 있음