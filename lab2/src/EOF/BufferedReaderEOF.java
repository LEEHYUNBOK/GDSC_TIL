package EOF;

// 버퍼를 사용하지 않는 입력은, 키보드의 입력이 키를 누르는 즉시 바로 프로그램에 전달
// 반면 버퍼를 사용하는 입력은, 키보드의 입력이 있을 때마다 한 문자씩 버퍼로 전송
// 버퍼가 가득 차거나 혹은 개행 문자가 나타나면 버퍼의 내용을 한 번에 프로그램에 전달
// => 중간에 버퍼를 두어 한번에 묶어 보내는 것이 더 효율적이고 빠른 방법

import java.io.*;

public class BufferedReaderEOF {
    // BufferedReader를 사용하기 위해서는 throws IOException 선언 필수
    // IOException = 스트림, 파일 및 디렉터리를 사용하여 정보에 액세스하는 동안 throw된 예외에 대한 기본 클래스
    public static void main(String[] args) throws IOException {


        // 버퍼를 사용하여 읽기와 쓰기를 하는 함수
        // 입력받기 위한 BufferedReader 클래스
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력한 값을 저장하기 위한 BufferedWriter 클래스
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";
        // br.readLinde() = 문자열 입력 받기 (공백 미포함)
        while((str = br.readLine()) != null) // str에 들어가는 값이 null이면 false를 반환(= null 시 반복문 탈출)
            bw.write(str+"\n");
        // bufferedWriter에 대한 출력문 저장
        bw.write("BufferedReader EOF");

        // BufferedWriter에 남아있는 데이터 모두 출력
        bw.flush();

        // 스트림을 닫음
        bw.close();
        br.close();
    }
}
