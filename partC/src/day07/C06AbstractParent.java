package day07;

// 추상클래스 테스트
public class C06AbstractParent {
    public static void main(String[] args) {
        // 추상클래스 부모는 직접 객체 생성 못함
        // Animal ani = new Animal(1, "동물", "화이트"); // 오류

        Animal ani1 = new Cat(1, "소금이", "그레이");
        System.out.println(ani1);

        // 내부 익명 클래스 : 여기서 new 연산 { } 안에 메소드 재정의하면 익명 클래스입니다.(일회용)
        Animal ani9 = new Animal(9, "개구리", "그린") {
            @Override
            void sound() {
                System.out.println("개굴 개굴~~~");
            }

            @Override
            boolean isFly() {
                return false;
            }

            @Override
            String todo(String task) {
                return "개구리는 " + task + " 를 연못에서 합니다.";
            }
        };
        System.out.println(ani9);
        ani9.sound();
        System.out.println(ani9.todo("점프"));
    }
}

// 부모를 추상클래스로 정의 : abstract 키워드
// 자식클래스가 Animal 을 구체화(추상메소드 재정의)시켜서 객체를 생성하도록 합니다.
abstract class Animal {
    private int id;
    protected String name;
    protected String color;

    Animal(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s (%s)", id, name, color);
    }

    // 추상메소드가 정의되어 있어야 진정한 추상클래스
    // 메소드의 원형만 정의 => 자식클래스는 추상메소드 재정의가 필수
    abstract void sound();

    abstract boolean isFly();

    abstract String todo(String task);
}

// 자식클래스 정의
class Cat extends Animal {

    // 부모클래스가 기본생성자 없을 때, 자식 클래스도 super() 사용 못함
    // => 해결방법 : 커스텀 생성자 (다른 해결방법은 기본생성자 직접 정의)
    Cat(int id, String name, String color) {
        super(id, name, color);
    }

    @Override
    void sound() {
        System.out.println("고양이는 야옹 야옹~~~");
    }

    @Override
    boolean isFly() {
        return false;
    }

    @Override
    String todo(String task) {
        return "고양이는 " + task + " 합니다.";
    }

}