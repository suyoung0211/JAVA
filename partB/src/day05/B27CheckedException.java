package day05;

import java.io.IOException;

public class B27CheckedException {
    public static void main(String[] args) {
        Score s1 = new Score();
        // java.lang.IllegalArgumentException: score 값 오류!!
        // IOException 발생시켰으므로 예외처리 필수

        try {
            s1.setScore(-9);
        } catch (Exception e) {
            System.out.println("예외 발생 : " + e.getMessage() + ", " + e.getCause());
        }
    }
}

class Score {
    private int score; // 0~100

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws IOException {
        // 여기서 직접 try ~ catch 안하면 사용하는 main 으로 위임
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            // 잘못된 값 -> 개발자가 임의로 예외 발생 처리
            // throw new IllegalArgumentException("score 값 오류!!"); // checked 예외 x
            throw new IOException("score 값 오류!!"); // checked 예외
        }
    }
}
