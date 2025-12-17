public class StringFormatTest {
    public static void main(String[] args) {
        // String.format() 메서드를 사용한 문자열 포맷팅 예제
        
        // 1. 정수 포맷팅
        int number = 42;
        String formatted1 = String.format("정수: %d", number);
        System.out.println(formatted1);
        
        // 2. 실수 포맷팅
        double pi = 3.14159265359;
        String formatted2 = String.format("파이: %.2f", pi);
        System.out.println(formatted2);
        
        // 3. 문자열 포맷팅
        String name = "홍길동";
        int age = 25;
        String formatted3 = String.format("이름: %s, 나이: %d", name, age);
        System.out.println(formatted3);
        
        // 4. 왼쪽 정렬
        String formatted4 = String.format("%-10s|", "왼쪽");
        System.out.println(formatted4);
        
        // 5. 오른쪽 정렬
        String formatted5 = String.format("%10s|", "오른쪽");
        System.out.println(formatted5);
        
        // 6. 숫자 자릿수 맞추기 (0으로 채우기)
        int num = 7;
        String formatted6 = String.format("%05d", num);
        System.out.println("0으로 채운 숫자: " + formatted6);
        
        // 7. 여러 값을 포맷팅
        String formatted7 = String.format("%-10s %5d %8.2f", "상품명", 100, 15000.50);
        System.out.println(formatted7);
    }
}
