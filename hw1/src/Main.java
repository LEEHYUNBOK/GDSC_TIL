public class Main {
    public static void main(String[] args) {
        // Alcohol 클래스를 기반으로 soju 객체 선언
//        Alcohol soju = new Alcohol("소주", 17);
        // Alcohol의 print 함수로 soju의 정보 출력
//        soju.print();
        // Alcohol의 change 함수로 soju의 도수 변경
//        soju.change(18);
        // Alcohol의 print 함수로 soju의 정보 출력
//        soju.print();

        // Chamisul 클래스를 기반으로 cham 객체 선언
        Soju cham = new Soju("참이슬", 17, 1800);
        // Chamisul의 print 함수로 cham의 정보 출력
        cham.print();
        // Chamisul의 change 함수로 cham의 도수 변경
        cham.change(18);
        // Chamisul의 change 함수로 cham의 이름 변경
        cham.change("참이슬 후레쉬");
        // Chamisul의 print 함수로 cham의 정보 출력
        cham.print();
    }
}