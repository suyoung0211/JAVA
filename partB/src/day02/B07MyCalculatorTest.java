package day02;

public class B07MyCalculatorTest {
    public static void main(String[] args) {
        String temp1 = System.console().readLine("data1 >>> ");
        String temp2 = System.console().readLine("data2 >>> ");
        double data1 = Double.valueOf(temp1);
        double data2 = Double.valueOf(temp2);

        System.out.println("data1 + data2 : " + MyCalculator.add(data1, data2));
        System.out.println("data1 - data2 : " + MyCalculator.substract(data1, data2));
        System.out.println("data1 * data2 : " + MyCalculator.multiply(data1, data2));
        System.out.println("data1 / data2 : " + MyCalculator.divide(data1, data2));

        int a = Integer.valueOf(temp1);
        int b = Integer.valueOf(temp2);

        // 지금 연습한 MyCalculator 클래스와 유사한 기능의 자바 클래스 Math 가 있습니다.
        System.out.println(Math.addExact(a, b));
        System.out.println(Math.subtractExact(a, b));
        System.out.println(Math.multiplyExact(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));
    }

}

class MyCalculator {
    static double add(double data1, double data2) {
        return data1 + data2;
    }

    static double substract(double data1, double data2) {
        return data1 - data2;
    }

    static double multiply(double data1, double data2) {
        return data1 * data2;
    }

    static double divide(double data1, double data2) {
        return data1 / data2;
    }
}
