## Description

> SQL문을 어떻게 구성했는지 설명해주세요.

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
