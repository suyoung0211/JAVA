package day06;

public class C03ParentChildTest {
    public static void main(String[] args) {
        
        // 부모에 없는 생성자, setter 와 getter 테스트
        YourChild2 child2 = new YourChild2(true);
        System.out.println("isFail : " + child2.isFail()); // true

        child2.setFail(false);
        System.out.println("isFail : " + child2.isFail()); // false

        // 부모생성자가 message 속성을 초기화 한 내용 확인
        System.out.println("message : " + child2.getMessage()); // unknown

        // 새로운 자식2 객체
        YourChild2 child22 = new YourChild2();
        System.out.println("message : " + child22.getMessage()); // unknown
        
    }
}

// C02 파일에 YoutParent 클래스 정의함
class YourChild2 extends YourParent { // 부모가 갖고 있지 않는 속성, 메소드를 추가하는 자식 클래스

    // 부모에 없는 속성 추가
    private boolean isFail;

    // 자식 클래스에서 생성자를 직접 만들면, 부모 클래스에 기본 생성자가 없을 때 에러 (생략할 수 없음)
    YourChild2() {
        super(); // 생략 가능. 생략해도 부모 생성자 호출
    }

    // 부모에 없는 생성자
    YourChild2(boolean isFail) {
        super(); // 생략 가능. 생략해도 부모 생성자 호출
        this.isFail = isFail;
    }

    // 부모에 없는 메소드
    public boolean isFail() {
        return isFail;
    }

    public void setFail(boolean isFail) {
        this.isFail = isFail;
    }
}