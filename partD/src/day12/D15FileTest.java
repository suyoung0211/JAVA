package day12;

import java.io.File;

import javax.swing.JFrame;
import java.awt.FileDialog;

public class D15FileTest {
    public static void main(String[] args) {
        // String fileName = "README.md"; // 폴더 위치가 현재 폴더가 아닌 경우는 정확히 경로까지 작성.
        String fileName = showFileDialog("파일 선택", FileDialog.LOAD);
        if (fileName == null || fileName.length() == 0) {
            System.out.println("파일 선택 취소했습니다.");
            return; // 종료
        }
        File file = new File(fileName); // 파일명 지정
        System.out.println("file 이 있나? " + file.exists()); // 파일 존재여부 확인

        // 1. 파일 생성 - 이미 있는지 확인하고 만들기
        try {
            if (file.exists()) {
                System.out.println("파일이 이미 존재합니다.");
            } else { // 파일이 없을 때
                if (file.createNewFile()) { // 파일이 생성되면 참
                    System.out.println("파일이 만들어 졌습니다.");
                } else {
                    System.out.println("파일 생성 실패했습니다.");
                }
            }
        } catch (Exception e) {
            System.out.println(" 파일 처리 예외 : " + e.getMessage());
        }

        // 2. 파일 정보 출력
        System.out.println("\n파일 이름 : " + file.getName());
        System.out.println("파일 경로 : " + file.getAbsolutePath());
        System.out.println("파일 크기 : " + file.length());
    }

    // 운영체제의 파일선택 GUI 활용
    public static String showFileDialog(String title, int type) {
        // 윈도우 창 객체 생성.
        JFrame jf = new JFrame();
        jf.setVisible(false);

        FileDialog fd = new FileDialog(jf, title, type); // 대화상자의 제목(title)과 버튼이름(type) 설정
        fd.setVisible(true);

        // 선택한 파일의 정보는 fd 가 저장
        System.out.println(fd);
        System.out.println("선택한 폴더 : " + fd.getDirectory()); // 폴더 위치
        System.out.println("선택한 파일 : " + fd.getFile()); // 파일명
        jf.dispose(); // 프레임 해제

        if (fd.getDirectory() == null || fd.getFile() == null) {
            return null;
        } else {
            return fd.getDirectory() + fd.getFile();
        }
    }
}