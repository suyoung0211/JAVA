## 2025. 7.10 오늘의 문제

### 문제 1 (데이터 타입)
다음 중 자바의 기본 타입(primitive type)이 **아닌** 것은?
1. int
2. String
3. boolean
4. double

---

### 문제 2 (불변 객체)
다음 코드의 출력 결과를 예상하시오.
```java
String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello");

System.out.println(str1 == str2);
System.out.println(str1 == str3);
```

---

### 문제 3 (참조값)
다음 코드에서 Person 객체의 참조값 비교에 대해 설명하시오.
```java
class Person {
    String name;
    int age;
}

Person p1 = new Person();
Person p2 = new Person();
Person p3 = p1;

System.out.println(p1 == p2);
System.out.println(p1 == p3);
```

---

### 문제 4 (toString() 재정의)
다음 Student 클래스에서 toString() 메소드를 재정의하여 "이름: 홍길동, 나이: 20" 형태로 출력되도록 코드를 작성하시오.
```java
class Student {
    String name;
    int age;
     
    // toString() 메소드를 여기에 작성
}
```

---

### 문제 5 (static 메소드)
다음 중 static 메소드의 특징으로 **올바른** 것은?
1. 객체를 생성해야만 호출할 수 있다
2. 클래스 이름으로 직접 호출할 수 있다
3. 모든 변수에 자유롭게 접근할 수 있다
4. 오버라이딩이 가능하다

---

### 문제 6 (반복문 연습)
다음과 같이 계산기 클래스에 2의 n승 계산하는 메소드를 만드세요.
2를 n 만큼 곱하는 for 반복문을 사용합니다.(n=0일 때 결과는 1)

```java
class MyCalculator {
    // 2의 n승 계산하기(n=0일 때 결과는 1)
    static int powerOfTwo(int count) {  
     
    }
}
```
---

### 문제 7 (Overflow)
다음 코드의 실행 결과를 예상하고, 왜 이런 결과가 나오는지 설명하시오.
```java
byte b = 127;
b++;
System.out.println(b);
```

---

### 문제 8 (변수 Scope)
다음 코드에서 컴파일 에러가 발생하는 이유를 설명하시오.
```java
public class ScopeTest {
    public static void main(String[] args) {
        if (true) {
            int x = 10;
        }
        System.out.println(x); // 컴파일 에러
    }
}
```
---

### 문제 9 (Switch 문)
다음 요구사항에 맞는 switch 문을 작성하시오.
- 정수 grade를 입력받아 학점을 출력
- 90 이상: A, 80 이상: B, 70 이상: C, 60 이상: D, 나머지: F

```java
int grade = 85;
// switch 문을 여기에 작성. grade 를 10으로 나눈 몫을 활용합니다.
```
---

