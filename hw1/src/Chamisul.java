// Alcohol 클래스를 상속 받기 위해 extends를 사용
public class Chamisul extends Alcohol {

    // Chamisul의 가격을 담을 수 있는 price 정수형 변수 입니다.
    // Chamisul 클래스에서만 접근 가능하게 private 접근제어자 사용
    private int price;

    // Chamisul 클래스 선언 시 정보를 정보를 저장할 수 있도록 하는 Contructor
    // 상속 받은 Alcohol 클래스는 super(...)을 사용하여 정의
    public Chamisul(String name, int proof, int price) {
        super(name, proof);
        this.price = price;
    }

    // 상속 받은 Alcohol 클래스에서 다시 함수를 재정의하기 위해 Overringd 사용
    @Override
    public void print() {
        System.out.println("현재 술의 이름은 : " + getName() + "\n도수는 : " + getProof() + "도\n가격은 " + price + "원 입니다.\n");
    }

    // 상속 받은 Alcohol 클래스에서 다시 함수를 재정의하기 위해 Overringd 사용
    @Override
    public void change(int changeProof) {
        System.out.println(getName() + "의 도수를\n" + getProof() + "도에서 " + changeProof + "도로 변경하였습니다. \n");
        setProof(changeProof);
    }

    // Overload : 함수의 이름은 같지만 매개변수로 들어오는 값에 따라 여러가지로 사용할 수 있도록 하는 것
    // 매개변수를 문자열 changeName로 변경함으로써 오버로딩 지원
    public void change(String changeName) {
        System.out.println(getName() + "의 이름을\n" + changeName + "으로 변경하였습니다. \n");
        setName(changeName);
    }


    // 참이슬의 가격을 출력할 수 있는 Getter 함수 : getPrice
    public int getPrice() {
        return price;
    }

    // 참이슬의 가격을 수정할 수 있는 Setter 함수 : setPrice
    public void setPrice(int price) {
        this.price = price;
    }
}
