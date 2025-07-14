package day03;

public class B16Static_InstanceQuiz {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // count++
        System.out.println("c1.getNum() : " + c1.getNum()); // 1
        Counter c2 = new Counter();
        System.out.println("c2.getNum() : " + c2.getNum()); // 1
        Counter c3 = new Counter();
        System.out.println("c3.getNum() : " + c3.getNum()); // 1
        Counter c4 = new Counter();
        System.out.println("c4.getNum() : " + c4.getNum()); // 1
        System.out.println(Counter.getCount()); // count 변수가 4

        // 참고 : System.out.println(c4.getCount());
        // 경고 메시지 : The static method getCount() 
        // from the type Counter should be accessed in a static way
    }
}

/*
 * Counter.getCount() => 이 실행 코드로 알 수 있는 내용은?
 * getCount() 메소드는 1) static 이다
 *                    2) ( ) 안에 값이 없다.
 */

// 🌟 이 코드는 Counter 객체가 몇 번 생성되었는지 알아내는 방법입니다.
//     static 이 저장되는 메모리 영역은 공유 영역입니다.
//     static 메소드는 static 변수 또는 메소드만 사용할 수 있습니다.
class Counter {
    private static int count = 0;
    private int num; // Counter 객체의 필드. 인스턴트 변수

    public Counter() { // 생성자 메서드 - new 연산할 때 실행. 리턴이 없습니다.
        count++;
        num++;
        // count += 3;
    }

    // count 값을 리턴하는 getter 만들기 => 1) 리턴 타입이 int
    //                                    2) 인자로 선언하는 변수 없음
    public void setCount(int count) {
        Counter.count = count;
    }

    public static int getCount() {
        return count;
    }

    // 객체를 만들고 사용하는 인스턴스 메소드
    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}