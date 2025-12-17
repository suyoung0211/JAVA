## 자바 Quiz 2


### 1. static 키워드에 대한 설명으로 올바른 것은?
a) static 변수는 객체마다 각각 다른 값을 가진다 <br/>
b) static 메소드는 인스턴스 변수에 직접 접근할 수 있다 <br/>
c) static 변수는 클래스가 메모리에 로드될 때 생성된다 <br/>
d) static 메소드는 this 키워드를 사용할 수 있다 <br/>

### 2. 다음 코드의 출력 결과는?
```java
public class Test {
    static int count = 0;
    
    public Test() {
        count++;
    }
    
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(Test.count);
    }
}
```
a) 0 <br/>
b) 1 <br/>
c) 2 <br/>
d) 컴파일 오류 <br/>

### 3. 기본 생성자에 대한 설명으로 틀린 것은?
a) 매개변수가 없는 생성자이다 <br/>
b) 명시적으로 생성자를 만들지 않으면 자동으로 제공된다 <br/>
c) 리턴 값은 기본값이 null 이다. <br/>
d) 객체가 생성될 때만 실행된다. <br/>

### 4. 다음 클래스에서 컴파일 오류가 발생하는 것은?
```java
public class Test {
    static int staticVar = 10;
    int instanceVar = 20;
    
    // 다음 중 오류가 발생하는 것은?
}
```
a) `public static void method1() { System.out.println("static"); }` <br/>
b) `public void method2() { System.out.println(staticVar); }` <br/>
c) `public static void method3() { System.out.println(instanceVar); }` <br/>
d) `public static void method4() { method1(); }`  <br/>


### 5. 다음 코드에서 빈칸을 채우시오.
```java
public class Counter {
    private int count = 0;
    private ______ int totalCount = 0;  // 모든 카운터가 공유하는 변수
    
    public void increment() {
        count++;
        ______++;  // 공유 변수 증가
    }
    
    public ______ int getTotalCount() {  // 객체 생성 없이 호출 가능한 메소드
        return totalCount;
    }
}
```

### 6. 다음 코드에서 빈칸을 채우시오.
```java
public class Calculator {
    private int result;
    
    public ______() {  // 기본 생성자
        result = 0;
    }
    
    public ______ add(int num) {  // 반환형이 없는 인스턴스 메소드
        result += num;
    }
    
    public ______ getResult() {  // 결과를 반환하는 인스턴스 메소드
        return result;
    }
}
```

### 7. 다음 코드에서 빈칸을 채우시오.
```java
public class MathUtils {
    public ______ final double PI = 3.14159;  // 클래스 상수
    
    public ______ double calculateArea(double radius) {  // 인스턴스 생성 없이 호출
        return ______ * radius * radius;  // 위에서 선언한 상수 사용
    }
}
```

### 8. 다음 코드에서 빈칸을 채우시오.
```java
public class Car {
    private String brand;
    private int speed;
    private ______ int maxSpeed = 200;  // 모든 자동차가 공유하는 최고 속도
    
    // 기본 생성자
    public ______() {
        brand = "Unknown";
        speed = 0;
    }
    
    public ______ void printMaxSpeed() {  // 객체 생성 없이 호출 가능
        System.out.println("Max speed: " + maxSpeed);
    }
}
```

### 9. 다음 코드에서 기본 생성자의 역할을 설명하고, 출력 결과를 예측하시오.
```java
public class Student {
    private String name;
    private int grade;
    
    // 기본 생성자
    public Student() {
        name = "Anonymous";
        grade = 1;
    }
    
    public void printInfo() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
    
    public static void main(String[] args) {
        Student s = new Student();
        s.printInfo();
    }
}
```

### 10. 다음 코드의 실행 결과를 예측하고, 그 이유를 설명하시오.
```java
public class Counter {
    private int instanceCount = 0;
    private static int staticCount = 0;
    
    public Counter() {
        instanceCount++;
        staticCount++;
    }
    
    public void printCounts() {
        System.out.println("Instance: " + instanceCount + ", Static: " + staticCount);
    }
    
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.printCounts();
        c2.printCounts();
    }
}
```
