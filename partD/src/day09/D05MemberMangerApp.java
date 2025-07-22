package day09;

import java.util.ArrayList;
import java.util.List;

public class D05MemberMangerApp {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        // list 초기화 메소드 실행
        initMemberList(list); // list 변수 참조값 전달

        while (true) {
            System.out.println("작업 메뉴를 선택하세요");
            System.out.println("[A] 회원 추가   [N] 이름으로 조회   [R]  회원 삭제  [U] 회원 포인트 변경    [S] 회원 조회   [E] 종료");
            String menu = System.console().readLine("선택 >>> ");

            switch (menu.toUpperCase()) {
                case "A":
                    if (confirm("회원 추가")) {
                        addMember(list);
                    } else {
                        System.out.println("추가 취소");
                    }
                    break;

                case "N":
                    if (confirm("이름으로 조회")) {
                        String find = System.console().readLine("조회할 이름 입력 >>> ");
                        int count = 0;
                        for (int i = 0; i < list.size(); i++) {
                            // 순서대로 인덱스 i 의 데이터를 가져와서 getter 이름값이 contains(find)
                            if (list.get(i).getName().contains(find)) {
                                count++;
                                System.out.println(list.get(i));
                            }
                        }
                        if (count == 0) {
                            System.out.println("조회 불가");
                        }
                    }
                    break;

                case "R":
                    int index = Integer.parseInt(System.console().readLine("삭제할 인덱스 입력 >>> "));
                    if (confirm("회원 삭제")) {
                        Member m = list.remove(index);
                        System.out.println("삭제 확인 : " + m);
                    } else {
                        System.out.println("삭제 취소");
                    }
                    break;

                case "U":
                    index = Integer.parseInt(System.console().readLine("수정할 인덱스 입력 >>> "));
                    double point = Double.parseDouble(System.console().readLine("수정할 포인트 입력 >>> "));
                    if (confirm("포인트 변경")) {
                        list.get(index).setPoint(point);
                        // index 의 객체를 가져와서 (Member 타입) setter 로 point 값 변경
                        System.out.println("변경 포인트 확인" + list.get(index));
                    } else {
                        System.out.println("변경 실패");
                    }
                    break;

                case "S":
                    index = Integer.parseInt(System.console().readLine("조회할 인덱스 입력 >>> "));
                    if (confirm("회원 조회")) {
                        System.out.println("조회한 인덱스" + list.get(index));
                    } else {
                        System.out.println("조회 실패");
                    }
                    break;

                case "E":
                    System.out.println("종료");
                    return;

                default:
                    System.out.println("잘못된 입력");
                    return;
            }
        }
    }

    // 멤버 추가
    static void addMember(List<Member> list) {
        int id = Integer.parseInt(System.console().readLine("ID >>> "));
        String name = System.console().readLine("이름 >>> ");
        double point = Double.parseDouble(System.console().readLine("점수 >>> "));

        Member m = new Member(id, name, point);
        list.add(m);
    }

    // 멤버 id로 조회
    static Member searchMember(List<Member> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return list.get(i);
            }
        }
        return null;
    }

    // 추가,삭제, 변경 작업 반영할 때 확인 받는 메시지 출력 메소드
    private static boolean confirm(String task) {
        String yn = System.console().readLine(task + " 을(를) 실행할까요?(확인:엔터, 취소:N) ");
        // 엔터를 누르면 참 리턴
        return yn.length() != 0 && yn.toUpperCase().equals("N") ? false : true;
    }

    // 프로그램을 실행할 때마다 4개의 객체를 리스트에 저장하고 시작 : list 초기화
    // 메소드 인자는 main 메소드의 ArrayList 객체의 주소를 저장(객체의 주소를 공유)
    private static void initMemberList(List<Member> list) {
        Member m1 = new Member(1, "김땡땡", 3.4);
        Member m2 = new Member(2, "반하나", 1.9);
        Member m3 = new Member(3, "최사과", 5.4);
        Member m4 = new Member(4, "박모모", 6.3);

        // 불변 객체 리스트가 메소드의 인자로 가변 객체 list 에 모든 요소 추가
        list.addAll(List.of(m1, m2, m3, m4));
    }
}
