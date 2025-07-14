package day02;

// 콘솔 입력은 여러 클래스로 부터 지원을 받을 수 있습니다.

public class B05ConsoleInput {
    public static void main(String[] args) {
        // System.out.println();
        String name = System.console().readLine("이름 >>> ");
        // 입력값 저장변수 String 타입. why? System.console().readLine() 의 결과로 콜솔에 입력한 문자열 리턴
        System.out.println("입력된 이름 : " + name);

        int age; // 나이는 정수로 저장하고 싶어요.
        String temp = System.console().readLine("나이 >>> ");
        // 문자열을 정수로 변환하여 age 변수에 저장
        age = Integer.valueOf(temp);

        double weight; // 몸무게를 실수로 저장하고 싶어요
        temp = System.console().readLine("몸무게 >>> ");
        // 문자열을 실수로 변환하여 weight 변수에 저장
        weight = Double.valueOf(temp);

        System.out.println("나이 : " + age + ", " + "몸무게 : " + weight);

        // 정수, 실수, 블린 값들을 문자열로 변환 메소드
        // String.valueOf(어떤 형식의 값이든 변환)
    }

}
