# GDSC_TIL

<details><summary><strong><em>2022-10-05 1주차</em></strong></summary>
<h2><strong>나만의 자바 프로그램(클래스) 만들기 과제</strong></h2>

<pre><code>
- 클래스
- 캡슐화
- 접근제어자
- 상속
- Overriding
- Overloading
</code></pre>

- <h3><em><u>피드백</u></em></h3>

> 1.  현재 Alcohol 클래스가 일반 클래스라서 객체 생성이 가능한 상태인데,
>     price를 가지고 있지 않은 Alcohol 객체는 사용처를 찾기 힘들 것 같아서
>     Alcohol 클래스를 추상클래스로 정의하는 건 어떨까 싶습니다.
>
> 2.  Chamisul 클래스 대신, Soju 클래스를 선언하고 필드에 Chamisul이라는 이름을 넣는 건 어떨까 싶습니다.
>     판매하는 주류가 늘어났을 때 처음처럼.java, 청하.java 처럼 클래스가 과도하게 늘어날 수 있어 보입니다!

 </details>

<details><summary><strong><em>2022-10-26 ~ 11-02 2,3주차</em></strong></summary>
<h2><strong>주석으로 해당 코드에 대해 설명하기</strong></h2>

<pre><code>
1. More about JAVA
2. EOF
3. 예외 처리
4. 스레드
5. 어노테이션 
6. 제네릭 /2022-10-26
7. 컬렉션
8. 람다
9. 옵셔널
10. 스트림
</code></pre>

- <h3><em><u>피드백</u></em></h3>

 </details>

<details><summary><strong><em>2022-11-09 4주차</em></strong></summary>
<h2><strong>학생, 과목, 수강 테이블 생성 후 join해서 출력하기</strong></h2>

- 구성

  - <B>Student 테이블</B>

    - 학번 : ID(int 타입) => primary key
    - 이름 : Name(varchar(30) 타입)
    - 생일 : birthday(date 타입)
      <br/>

  - <B>Subject 테이블</B>

    - 과목 코드 : ID(varchar(30) 타입) => primary key
    - 과목 명 : SubName(varchar(30) 타입)
    - 학과 명 : DepartmentName(varchar(30) 타입)
      <br/>

  - <B>Registration 테이블</B>
    - 학번 : StuID(int 타입)
      => primary key, Student 테이블의 외래키
    - 과목 코드 : SubID(varchar(30) 타입)
      => primary key, Subject 테이블의 외래키
    - 신청 날짜 : ApplicationDate(TIMESTAMP 타입)
      => Defalt를 현재 시간으로 지정
      (insert 사용 시 간단하게 날짜 입력을 할 수 있도록 지정)
      <br/>

- 관계
  - 한 학생이 여러 개의 과목을 수강할 수 있고 한 과목에 여러 학생이 수강될 수 있으므로 N:M관계
- 출력

  - Registration 테이블에서 Student 테이블, Subject 테이블을 Join하여 출력

- <h3><em><u>피드백</u></em></h3>

  > .
  > .

    </details>

<!--

<details><summary><strong><em>test ?주차</em></strong></summary>
<h2><strong> **** 제목 **** </strong></h2>


- <h3><em><u>피드백</u></em></h3>

  > .
  > .

    </details>

-->
