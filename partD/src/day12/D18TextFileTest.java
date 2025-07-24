package day12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

// 문자 단위(기반)의 입출력
public class D18TextFileTest {
    public static void main(String[] args) {
        // readText();
        readByLine();
        // writeFile();
        // writeFileAutoClose();
    }

    // 1. 텍스트 파일을 한 글자씩 읽어오기
    public static void readText() {
        int ch;
        int count = 0;
        FileReader fr = null;
        StringBuilder sb = new StringBuilder();
        try {
            fr = new FileReader("C:\\Class250615\\Java_workspace\\partD\\test.txt");
            while ((ch = fr.read()) != -1) {
                // System.out.println((char)ch);
                sb.append((char) ch); // 읽어온 값은 정수 타입. 문자 char 로 캐스팅
                // 읽은 문자 한개씩을 문자열로 만들기 위해 추가
                count++; // 윈도우OS 는 엔터가 2개의 문자 CRLF
            }
            System.out.println(sb.toString());
            System.out.println("읽은 문자 개수 : " + count);
        } catch (Exception e) {
            System.out.println("예외 : " + e.getMessage());
        } finally {
            try {
                fr.close();
            } catch (Exception e) {
                System.out.println("예외 : " + e.getMessage());
            }
        }
    }

    // 2. 텍스트 파일 라인(줄) 단위로 읽어오기
    public static void readByLine() {
        String line = null;
        int count = 0;
        FileReader fr = null;
        Scanner sc = null;
        StringBuilder sb = new StringBuilder();
        try {
            // 파일의 인코딩 형식을 지정하여 사용하기
            fr = new FileReader("0724_파일입출력.txt", Charset.forName("UTF-8")); // 경로가 현재 폴더위치에 있는 파일(경로 생략)
            sc = new Scanner(fr); // 파일을 읽기 위해서 Reader 타입 클래스를 인자로 합니다.
            // hasNext() 은 iterator(반복자) 를 통해서 다음 내용이 있을 때 동작하는 방식
            // Iterator 인터페이스 구현 클래스 : hasNext() 메소드, nextXXX() 메소드가 있습니다.
            while (sc.hasNext()) { // 읽어올 다음 줄이 있느냐? 참이면
                line = sc.nextLine(); // 다음 줄 읽어오기
                System.out.println("line : " + line);
                sb.append(line).append("\n"); // 최종 파일의 내용 출력을 위해서 저장
                count++; // 읽은 행의 갯수 카운트
            }

            System.out.println("\n=== 파일의 내용 ===");
            System.out.println(sb.toString());
            System.out.println("읽은 라인 개수 : " + count);
        } catch (Exception e) {
            System.out.println("예외 : " + e.getMessage());
        } finally {
            try {
                fr.close();
                sc.close();
            } catch (Exception e) {
                System.out.println("예외 : " + e.getMessage());
            }
        }
    }

    // 3. 텍스트 파일 라인 단위로 저장
    public static void writeFile() {
        String fileName = "텍스트파일출력.txt";
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(fileName, true); // true : 기존 파일내용에 추가
            pw = new PrintWriter(fw); // Charset 지정은 가능하나 첫번째 인자 타입이 제한적
            String test = "PrintWrite는 FileWriter 또는 파일명을 인자로 사용합니다.";
            String[] lines = test.split("\\s+");
            for (int i = 0; i < lines.length; i++) {
                pw.println(lines[i]);
            }
        } catch (Exception e) {
            System.out.println("파일쓰기 예외 : " + e.getMessage());
        } finally {
            try {
                if (fw != null)
                    fw.close();
                if (pw != null)
                    pw.close();
            } catch (Exception e) {
                System.out.println("예외 : " + e.getMessage());
            }
        }
    }

    // 4. 🌟 try-with-resources : try 구문에서 사용한 입출력 리소스(장치)를 자동으로 해제(close X)
    public static void writeFileAutoClose() {
        String fileName = "텍스트파일출력.txt";
        try (
                // 🌟 colse 가 필요한 선언
                FileWriter fw = new FileWriter(fileName, true);
                PrintWriter pw = new PrintWriter(fw);) {
            int line = 0;
            String test = "PrintWrite는 FileWriter 또는 파일명을 인자로 사용합니다.";
            String[] lines = test.split("\\s+");
            for (int i = 0; i < lines.length; i++) {
                pw.println(lines[i]);
                line++;
            }
            System.out.println(line + " 행이 저장되었습니다.");
        } catch (Exception e) {
            System.out.println("파일쓰기 예외 : " + e.getMessage());
        }
    }

}
