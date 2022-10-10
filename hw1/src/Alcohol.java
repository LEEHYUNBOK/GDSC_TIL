// 술의 정보를 담을 수 있는 Alcohol 클래스 입니다.
public class Alcohol {
    // 술의 이름을 담을 수 있는 name 문자열 변수 입니다.
    // Alcohol 클래스에서만 접근 가능하게 private 접근제어자 사용
    private String name;
    // 술의 도수를 담을 수 있는 proof 정수형 변수 입니다.
    // Alcohol 클래스에서만 접근 가능하게 private 접근제어자 사용
    private int proof;

    // 알코올 클래스 선언 시 정보를 저장할 수 있도록 하는 Contructor
    // 다른 패키지에서도 접근 가능하도록 public 접근 제어자 사용
    public Alcohol(String name, int proof) {
        this.name = name;
        this.proof = proof;
    }

    // 도수의 값을 변경할 수 있도록 만들어주는 change 함수 선언
    // 매개변수로 변경할 도수를 정수형으로 받음
    public void change(int changeProof) {
        System.out.println(name + "의 도수를\n" + proof + "도에서 " + changeProof + "도로 변경하였습니다. \n");
        this.proof = changeProof;
    }

    // 술의 정보를 출력할 수 있는 print 함수 선언
    public void print() {
        System.out.println("현재 술의 이름은 : " + name + "\n도수는 : " + proof + "도 입니다.\n");
    }

    // 술의 이름을 출력할 수 있는 Getter 함수 : getName
    public String getName() {
        return name;
    }

    // 술의 이름을 수정력할 수 있는 Setter 함수 : setName
    public void setName(String name) {
        this.name = name;
    }

    // 술의 도수를 출력할 수 있는 Getter 함수 : getProof
    public int getProof() {
        return proof;
    }

    // 술의 도수를 수정력할 수 있는 Setter 함수 : setProof
    public void setProof(int proof) {
        this.proof = proof;
    }
}
