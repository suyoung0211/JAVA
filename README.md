# 2506_Java
2025-07 자바수업

[간단한 기본 개념 요약](https://github.com/kimsewhee/classTest/tree/main)

* 자바 수업 프로젝트는 java_workspace 폴더에 모두 저장합니다.
* [gitignore](https://www.toptal.com/developers/gitignore/)
  - 위의 링크 사이트에서 생성하기
  - 개발 환경 입력(선택) 하기 : Windows, VisualStudioCode, Eclipse, Java
* git 저장소는 java_workspace 폴더로 하겠습니다.

### 수업 진도

### Part A
- 1일차 : 자바의 데이터 타입 (기본타입과 객체타입)
### Part B
- 2일차
  - 오전 : 객체의 참조값, 불변 객체, toString() 재정의
  - 오후 : 콘솔 입력, static 메소드 정의, 계산기 기능 메소드 예제, 데이터의 overflow , 변수 scope, switch 와 while
- 3일차
  - 오전 : 객체의 인스턴스 메소드 
    - 1) 문자열 메소드 연습. (정규표현식 연습)
    - 2) Score 클래스에 인스턴스 메소드 만들기 
    - 3) (강제 캐스팅)
  - 오후 : 접근 제어자 , static 메소드 퀴즈
- 4일차
  - 생성자, 배열, 배열 메소드, 배열이 메소드의 인자 또는 리턴값인 예시
  - 객체의 배열
  - 배열 활용 (lotto)
- 5일차
  - 오전 : 정렬 알고리즘, clone() 메소드 활용
  - 오후 : 객체 인스턴스 변수가 배열인 예시, 예외
 ### Part C 
- 6일차
  - 오전 : 2차원 배열과 문자열 배열, 클래스 상속
  - 오후 : 클래스 상속과 상속 예시(도형) , 다형성
- 7일차
  - 오전 : 추상 클래스, 인터페이스 기본 형식(🔥다형성)
  - 오후 : Cloneable, Comparable 자바 인터페이스 테스트 (기본형, 문자열,래퍼클래스의 값 비교) 
- 8일차
  - 오전 : 7일차 문제 풀이 -> 래퍼클래스의 static compare 메소드 , clone() 의 얕은 복사 테스트
  - 오후 : 문자열 String, StringBuilder, StringBuffer 비교. CharSequence 인터페이스 테스트  

### Part D
- 9일차
  - 오전 : 2진수 비트 연산(10진수 결과값은 중요하지 않습니다. 연산 동작 이해합시다.)
  - 오후 : Collection 자료구조 중 ArrayList 클래스 (List 인터페이스 ),
           List 의 기본 메소드 (🔥중요),
           sort 메소드의 Comparator 인터페이스(참고)
    
### 롬복 lombok 라이브러리 
: getter/setter, toString, 생성자 등 반복적인 코드를 개발 단계에서 생성합니다.
1) lombok.org 에서 다운로드하기
2) 현재 프로젝트에 라이브러리 추가하기
JAVA PROJECTS 탭의 Referenced Libraries 에서 + 클릭해서 추가합니다.
           
- 10일차 :
  - 오전 : List 를 활용한 회원 관리 App 완성
  - 오후 : Set, Map. Map 활용 예시(단어 출현 횟수 카운트)
- 11일차
  - 오전 : 시험
  - 오후 : Map 사용 복습. 객체의 주요 개념. 객체의 동등성 구현
- 12일차
  - 오전 : 문자인코딩, 파일, 이미지 파일복사(바이트 기반 입출력)
  - 오후 : 버퍼 입출력 스트림, 텍스트 기반 인코딩.
