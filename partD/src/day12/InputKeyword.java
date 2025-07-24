package day12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputKeyword {
    public static void main(String[] args) {
        writeFile(); // 1번
        readByLine(); // 2번
        addFile(); // 3번
        fileChecked(); // 생성한 java_keyword.csv 파일 확인
    }

    // 1번. 다음 5라인을 java_keyword.csv 로 저장
    public static void writeFile() {
        String fileName = "java_keyword.csv";
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(fileName);
            pw = new PrintWriter(fw);
            String[] lines = {
                    "public,공용의,1",
                    "private,사적인,1",
                    "list,목록,1",
                    "immutable,불변의,3",
                    "static,정적인,2" };
            for (int i = 0; i < lines.length; i++) {
                pw.println(lines[i]);
            }
        } catch (Exception e) {
            System.out.println("예외 : " + e.getMessage());
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

    // 2번. 1번 csv 파일을 읽어와서 List<JavaKeyWord> 로 변환하는 메소드 생성
    public static void readByLine() {
        String line = null;
        FileReader fr = null;
        Scanner sc = null;
        List<JavaKeyWord> list = new ArrayList<>();

        try {
            fr = new FileReader("java_keyword.csv");
            sc = new Scanner(fr);

            while (sc.hasNext()) {
                line = sc.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String keyword = parts[0];
                    String korean = parts[1];
                    int level = Integer.parseInt(parts[2]);

                    // JavaKeyWord 객체 생성해서 리스트에 추가
                    JavaKeyWord k = new JavaKeyWord(keyword, korean, level);
                    list.add(k);
                }
            }
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

        System.out.println("=== List<JavaKeyWord> 변환 확인 ===");
        for (JavaKeyWord k : list) {
            System.out.println(k);
        }
    }

    // 3번. 1번 csv 파일에 아래와 같은 JavaKeyWord 객체의 값을 저장
    public static void addFile() {
        String fileName = "java_keyword.csv";
        FileWriter fw = null;
        PrintWriter pw = null;
        List<JavaKeyWord> list = new ArrayList<>();
        JavaKeyWord k1 = new JavaKeyWord("final", "최종의", 1);
        JavaKeyWord k2 = new JavaKeyWord("construct", "건설하다", 2);
        list.addAll(List.of(k1, k2));

        try {
            fw = new FileWriter(fileName, true);
            pw = new PrintWriter(fw);

            for (int i = 0; i < list.size(); i++) {
                pw.println(list.get(i));
            }
        } catch (Exception e) {
            System.out.println("예외 : " + e.getMessage());
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

    // 생성한 java_keyword.csv 파일 확인
    public static void fileChecked() {
        String line = null;
        FileReader fr = null;
        Scanner sc = null;
        StringBuilder sb = new StringBuilder();
        try {
            fr = new FileReader("java_keyword.csv");
            sc = new Scanner(fr);
            while (sc.hasNext()) {
                line = sc.nextLine();
                sb.append(line).append("\n");
            }
            System.out.println("\n=== 3번 추가된 파일 내용 ===");
            System.out.print(sb);
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

}
