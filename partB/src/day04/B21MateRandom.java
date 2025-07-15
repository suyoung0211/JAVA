package day04;

import java.util.Arrays;

public class B21MateRandom {
    public static void main(String[] args) {
        // 배열 6개 생성
        int[] result = new int[6];
        int[] balls = new int[45];

        for (int i = 0; i < 45; i++)
            balls[i] = i + 1; // 명령문이 하나만 반복할 때는 {} 생략

        // 테스트
        for (int i = 0; i < 6; i++) {
            double rdnNum = Math.random();

            // 공을 뽑을 index 랜덤 만들기
            int range = 45 - i; // 0 보다 크고 (45-i)보다 작은 랜덤값으로 범위를 줄여나감
            int ballIndex = (int) (rdnNum * range);
            // System.out.println(Math.random()); // 0보다 크고 1보다 작은 실수
            // System.out.print((rdnNum * range) + "\t"); // 0보다 크고 45보다 작은 실수
            // System.out.println((int) (rdnNum * range)); // 0보다 크고 45보다 작은 실수

            // 랜덤 인덱스로 공 뽑기 -> result 배열에 저장
            result[i] = balls[ballIndex];

            // ballIndex 위치의 값은 빼고 복사하여 새로운 배열로 계속하기
            // balls 기존 배열로 리턴 가능
            balls = newBalls(balls, ballIndex);

            // (1) 리턴 저장 balls      (2) 주소 인자의 balls 주소 : 배열이름은 동일. 주소는 다름
            // (2) 번은 newBalls 실행하고 나면 참조되지 않는다. => JVM 이 GC(garbage collection)
            // 🌟 메모리 누수 : 참조는 되고 있으나 사용하지 않는다.

            System.out.println(Arrays.toString(result));
            System.out.println(Arrays.toString(balls));
        }

        // 배열 복사 메소드 : System 클래스

    }

    // 뽑힌 공 인덱스 빼고 새로운 배열 만들기 -> 참조값 리턴
    private static int[] newBalls(int[] balls, int ballIndex) {
        int[] result = new int[balls.length - 1];
        System.arraycopy(balls, 0, result, 0, ballIndex);
        System.arraycopy(balls, ballIndex + 1, result, ballIndex, balls.length - ballIndex - 1);
        return result;
    }

    /*
    private static int[] mergeOfArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length]; // arr1 크기 + arr2 크기

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return result; // 배열의 참조값을 전달하기
    }
    */

}
