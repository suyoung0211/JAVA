package day12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D17FileCopyPerformance {

  public static void main(String[] args) {

    // 실행 시작한 시간 저장
    long start = System.nanoTime(); // 10억분의 1초

    // 대용량 이미지 일때, 메소드에 입출력 단위 지정 vs 자바의 버퍼 클래스 사용
    // -> 성능 차이 있음

    copyByBufferStream(); // 0.5206219 초
    // copyByByteArray(); // 2.1073038 초
    // copyByByte(); // 1344.5621689 초

    // 실행 종료한 시간 저장
    long end = System.nanoTime();
    System.out.println("소요 시간 : " + (double) (end - start) / 1000000000 + " 초");
  }

  public static void copyByBufferStream() {
    int b;
    int count = 0;
    FileInputStream fis = null;
    FileOutputStream fos = null;
    BufferedInputStream bis = null; // 추가적인 버퍼를 활용한 입력스트림
    BufferedOutputStream bos = null; // 버퍼를 활용한 출력스트림
    byte[] buffer = new byte[256];

    // C:\Users\C117\Downloads\test.tif

    try {
      fis = new FileInputStream("C:\\Users\\C117\\Downloads\\test.tif");
      fos = new FileOutputStream("C:\\Users\\C117\\Downloads\\test_copy.jpg");
      // 버퍼스트림 : 입출력 스트림 내부에서 버퍼를 사용하는 보조 스트림
      bis = new BufferedInputStream(fis); // 생성자 인자 기본 입력스트림
      bos = new BufferedOutputStream(fos); // 생성자 인자 기본 출력스트림

      while ((b = bis.read(buffer, 0, buffer.length)) != -1) {
        bos.write(buffer, 0, b); // 읽은 바이트수 b 만큼 쓰기
        count += b;
      }

      System.out.println(count + " 바이트를 복사했습니다.");
    } catch (IOException e) {
      System.out.println("파일 입출력 : " + e.getMessage());
    }
  }

  public static void copyByByteArray() { // 바이트배열을 이용하여 입출력단위를 개선
    FileInputStream fis = null;
    FileOutputStream fos = null;
    byte[] buffer = new byte[1024]; // 1kb. 프로그램에서 입출력 단위를 1024 byte 로 설정

    try {
      int b;
      int count = 0;
      fis = new FileInputStream("C:\\Users\\C117\\Downloads\\test.tif");
      fos = new FileOutputStream("C:\\Users\\C117\\Downloads\\test_copy2.jpg");
      while ((b = fis.read(buffer, 0, buffer.length)) != -1) { // 파일의 끝 EOF 는 -1
        // fis.read(buffer, 0, buffer.length) : byte 배열에서 정한 크기만큼 읽어오기
        // 실제 읽은 바이트 수는 b 에 저장.
        fos.write(buffer, 0, b); // 읽은 바이트 수만큼 출력
        count += b;
      }
      System.out.println(count + " 바이트 복사되었습니다.");

    } catch (IOException e) {
      System.out.println("파일 입출력 : " + e.getMessage());
    } finally {
      try {
        fis.close();
        fos.close();
      } catch (IOException e) {
        System.out.println("파일 입출력 : " + e.getMessage());
      }
    }
  }

  public static void copyByByte() { // 바이트 단위로 복사
    FileInputStream fis = null;
    FileOutputStream fos = null;

    try {
      int b;
      int count = 0;
      fis = new FileInputStream("C:\\Users\\C117\\Downloads\\test.tif");
      fos = new FileOutputStream("C:\\Users\\C117\\Downloads\\test_copy3.jpg");
      while ((b = fis.read()) != -1) { // 파일의 끝 EOF 는 -1
        fos.write(b);
        count += b;
      }
      System.out.println(count + " 바이트 복사되었습니다.");

    } catch (IOException e) {
      System.out.println("파일 입출력 : " + e.getMessage());
    } finally {
      try {
        fis.close();
        fos.close();
      } catch (IOException e) {
        System.out.println("파일 입출력 : " + e.getMessage());
      }
    }
  }

}
