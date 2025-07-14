package day03;

// String 클래스의 인스턴스 메소드
// 생성된 객체를 대상으로 실행하는 객체의 값에 따라 결과가 다름
public class B11StringInstanceMethod {
    public static void main(String[] args) {
        String message = "Hello";
        String temp = new String("hello"); // 참조값이 다른 하나가 temp
        String temp2 = "Hello";

        // message 문자열 객체의 인스턴스 메소드(자바스크립트, 파이썬 등 거의 유사)
        message = "Hello~  Java"; // 문자열을 구성하는 문자의 위치 0 부터 시작
        System.out.println(message); // message.toSting() 실행

        // 각 메소드가 어떤 형식의 데이터를 리턴하는가?
        // 🌟 인스턴스 메소드 실행으로 원래 문자열 객체의 상태가 변하지 않습니다.
        // 리턴 타입이 String 인 경우, 새로운 문자열이 만들어집니다.
        System.out.println(message.length()); // int
        System.out.println(message.charAt(4)); // ?
        System.out.println(message.toUpperCase()); // String
        System.out.println(message.indexOf("Java")); // int
        System.out.println(message.indexOf("java")); // int 없는 문자열이면 -1
        System.out.println(message.startsWith("Hello")); // boolean
        System.out.println(message.endsWith("java")); // boolean
        System.out.println(message.replace(" ", " * ")); // String
        System.out.println(message.substring(1, 4)); // String
        System.out.println(message.substring(3)); // String
        System.out.println(message.indexOf(" ")); // int
        System.out.println(message.lastIndexOf(" ")); // int
        System.out.println(message.concat("??")); // String
        System.out.println(message.equals("Hello~  Java")); // boolean;
        System.out.println("-------------------------");

        // 주의 : 자바는 문자열 같은지 비교할 때 == 안됩니다. (참조값 비교)
        // 꼭 equals 쓰세요

        // 위의 메소드를 다른 값으로 실행 시켜 보세요.
        message = "hello~~~  hi!!!!";
        System.out.println(message.length()); // int
        System.out.println(message.charAt(8)); // ?
        System.out.println(message.toUpperCase()); // String
        System.out.println(message.indexOf("~")); // int
        System.out.println(message.startsWith("hello")); // boolean
        System.out.println(message.endsWith("java")); // boolean
        System.out.println(message.replace(" ", " * ")); // String
        System.out.println(message.substring(1, 4)); // String
        System.out.println(message.substring(3)); // String
        System.out.println(message.indexOf(" ")); // int
        System.out.println(message.lastIndexOf(" ")); // int
        System.out.println(message.concat("??")); // String
        System.out.println(message.equals("Hello~  Java")); // boolean
        System.out.println("-------------------------");

        //
        String test = "   ";
        System.out.println(test.isBlank()); // test.lenght() > 0, 공백만 있으면 true
        System.out.println(test.isEmpty()); // 문자열의 길이가 0 일 때 true
        System.out.println("-------------------------");

        // 정규식 패턴을 검사 : 예시) 핸드폰 번호 010-숫자4자리-숫자4자리
        String regex = "^010-\\d{4}-\\d{4}$";
        String hpnum = "010-2342-3453";

        System.out.println(hpnum.matches(regex)); // true
        System.out.println("011-685-8888".matches(regex)); // false
        System.out.println("0116858888".matches(regex)); // false

        // - 기호를 선택적. 없거나 한번 나오기 ?
        System.out.println("01066858888".matches("^010-?\\d{4}-?\\d{4}$"));
        System.out.println("-------------------------");

        // 한글 검사
        String name = "김땡땡";
        // 순서는 없고, 가능한 문자를 [] 기호 안에 나열, a-z 또는 A-Z
        // + 기호는 반드시 한글자 이상.
        regex = "^[가-힣]{2,5}+$";
        System.out.println(name.matches(regex)); // true
        System.out.println("john".matches(regex)); // false

        // 영문 검사
        System.out.println("john".matches("^[a-zA-Z\\s]+$")); // true
        // 첫 글자만 대문자
        System.out.println("john".matches("^[A-Z][a-zA-Z\\s]+$")); // false
    }
}
