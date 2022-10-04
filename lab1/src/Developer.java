// Human 클래스를 상속 받기 위해 extends를 사용
public class Developer extends Human{
    private String tecSkill;



    // Overringd : 상속 받은 클래스에서 다시 함수를 재정의 하는 것
    @Override
    public void print() {
        System.out.println("개발자의 이름은 "+getName()+"\n나이는 "+getAge()+"\n기술 스택은 "+ tecSkill);
    }
    // Overload : 함수의 이름은 같지만 매개변수로 들어오는 값에 따라 여러가지로 사용할 수 있도록 하는 것
    public void print(String sex){
        print();
        System.out.println("성별은 : "+sex);
    }

    // 상속 받은 클래스는 super(...)을 사용하여 정의 가능
    public Developer(int age, String name, String tecSkill) {
        // 자신의 부모로 가서 생성자 호출하겠다.
        super(age, name);
        this.tecSkill = tecSkill;
    }

    public String getTecSkill() {
        return tecSkill;
    }

    public void setTecSkill(String tecSkill) {
        this.tecSkill = tecSkill;
    }
}
