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

<br>

> [과제 git 주소 ](https://github.com/LEEHYUNBOK/GDSC-Server-Assignment-03)

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

  > CASCADE 제약조건 좋네요
  > 👍👍👍
  > LG👍

</details>

<details><summary><strong><em>2022-11-16  5주차</em></strong></summary>
<h2><strong> 자기만의 웹사이트 만들기 </strong></h2>

> [실습 git 주소 ](https://github.com/LEEHYUNBOK/GDSC-BACK-SpringIntroduction-start)

> [과제 git 주소 ](https://github.com/GDSC-SKHU/GDSC-Server-Assignment-04)

- ### Description

  - 수업을 관리하고 확인할 수 있도록 만들어진 사이트입니다.
    어떠한 수업이 있는지 표 형식으로 확인 가능, 회원가입 및 로그인 구현,
    로그인 시 수업 삭제 기능, 수업 추가 기능을 구현하였습니다.

  - get "/" 요청 시 사전에 만들어 주었던 수업들(Subject 클래스) 값들과 유저(Member 클래스) 값을 추가해 주었습니다.
  - 회원가입 버튼을 누르게 된다면 수업 추가와 같은 방식으로 /signup으로 이동하면서 get "signup"이 요청됩니다. id와 비밀번호는 모두 모두 2글자~8글자 사이로 입력 해야하고 조건에 맞지 않다면 오류메시지가 출력됩니다. 조건이 맞으며 회원가입 버튼을 누른다면 post "/signup" 요청이 되면서 홈으로 redirect하게 되고 회원가입한 정보로 로그인한다면 성공적으로 작동하는 것을 확인할 수 있습니다.
  - 아이디 비밀번호를 입력하고 "로그인하기" 버튼을 누르게 되면 post "signin"이 요청됩니다. 여기서 로그인 여부를 판단합니다. 로그인 실패 시 "로그인 오류" 에러 메세지 출력합니다.
    (MemberService.java의 validate함수에서 유저가 없다면 오류 메세지 출력하도록 수정)
    ~~(Valid 어노테이션 사용하면 더 편할 것 같음=>문제는 사용법을 잘 모르겠음... 연습 필요...)~~
  - 로그인 완료 시 세션에 저장합니다. 그리고 수업 표 옆에 삭제 버튼이 생겨납니다.
  - 수업 표 위 input태그에 원하는 수업을 입력한다면 검색이 가능합니다.
  - 검색 태그 옆 추가 버튼을 누르게 된다면 url이 /subAdd으로 이동하면서 get "/subAdd" 요청이 됩니다. 과목 코드, 과목 이름, 전공명은 모두 2글자~8글자 사이로 입력 해야하고 조건에 맞지 않다면 오류메시지가 출력됩니다. 조건이 맞는다면 추가 버튼을 누릅니다. post "/subAdd" 요청이 되면서 홈으로 redirect하게 되고 수업 표에 추가되는 것을 확인할 수 있습니다.

- ### Question

  - 로그인 실패 시 valid어노테이션을 사용하려고 했지만 계속 실패하였습니다.
    결국 MemberService.java의 validate함수에서 정보 일치 여부를 판별한 후 컨트롤러에 보내도록 만들었습니다. 조금 더 어노테이션에 대해 알아보도록 하겠습니다.

- <h3><em><u>피드백</u></em></h3>

> ```javascript
> function getvalue() {
>   var query = document.getElementById('query').value
>   return '/?' + query
> }
> ```
>
> ```javascript
> function getvalue() {
>   var queryValue = document.getElementById('query').value
>   var queryName = document.getElementById('query').getAttribute('name')
>   return '/?' + queryName + '=' + queryValue
> }
> ```
>
> 폼태그 없이 조회버튼을 구현하려면 저렇게 쿼리스트링의 name, value값을 직접 가져와야 동작하네요!

> 저번에 잘못 말씀드렸던거같은데
> 메모리 저장소를 List가 아니라 Map으로 구현하여도 수정 가능해요!
> put, replace, remove 같은 메소드도 사용 가능하고 심지어 Map.get(key) 로 Subject 객체를 가져와서 setter만 써줘도 값이 변경됩니다!
> (Map에 등록된 참조값을 가져와서 변경했기 때문)
>
> ---
>
> 그리고 로그인 실패처리는 보통 **DB를 조회하는 과정**이 있어서
> 검증 라이브러리(@Valid)에서 제공하는 기능으로는 구현이 힘들 거에요
> (당연하게도, 검증 라이브러리 개발자가 성공회대 GDSC 회원이 어떤 DB에 어떤 데이터를 넣어놓을지 모르는 상태로 라이브러리를 개발했기 때문)
> 그래서 @Valid 어노테이션의 경우 요청값을 제한하는 정도로만 사용하고,
> 로그인처럼 **시스템 내부적인 검증**은 작성하신 코드처럼 예외상황에 대해 따로
> 에러 메시지를 반환하는 식으로 하는 것으로 알고 있습니다.

  </details>

<details><summary><strong><em>2022-11-23 6주차</em></strong></summary>
<h2><strong> JPA Practice </strong></h2>

> [과제 git 주소](https://github.com/LEEHYUNBOK/GDSC-Server-Assignment-05.git)

- ### Description

  - **Controller** _@RequestMapping("/api")_
    - **Team**
      - POST "/teams"
        -> **TeamService** save -> /api/teams/{id} URI 생성
      - GET "/teams"
        -> **TeamService** findAll
      - Get "/teams/{id}"
        -> **TeamService** findById({id})
      - PATCH "/teams/{id}"
        -> **TeamService** updateById({id})
      - DELETE "/teams/{id}"
        -> **TeamService** deleteById({id})
    - **Member**
      - POST "/teams/{id}/members"
        -> **MemberService** saveByTeamId({id}) -> // /api/members/{id} URI 생성
      - GET "/teams/{id}/members"
        -> **MemberService** findAllByTeamId({id})
      - Get "Members"
        -> **MemberService** findAll
      - GET "/members/{id}"
        -> **MemberService** findById({id})
      - PATCH "/members/{id}"
        -> **MemberService** updateById({id})
      - DELETE "/members/{id}"
        -> **MemberService** deleteById({id})

- ### Reference

> [RequestBody 어노테이션](https://2ham-s.tistory.com/294).
> [@Controller와 @RestController 차이](https://mangkyu.tistory.com/49)
> [[JPA] 양방향 연관관계](https://ict-nroo.tistory.com/122)
> [JPA의 공통 인터페이스, JpaRepository 의 기능과 구조](https://wonit.tistory.com/469)
> [Transactional 어노테이션](https://goddaehee.tistory.com/167)

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
