package day09;

import java.util.ArrayList;
import java.util.List;

public class D05MyMemberMangerApp {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        initMemberList(list);
        while (true) {
            System.out.println("작업 메뉴를 선택하세요");
            System.out.println("[A] 회원 추가   [R]  회원 삭제  [U] 회원 포인트 변경    [S] 회원 조회   [E] 종료");
            String menu = System.console().readLine("선택 >>> ");

            switch (menu.toUpperCase()) {
                case "A":
                    addMember(list);
                    break;

                case "R":
                    int id = Integer.parseInt(System.console().readLine("삭제할 ID 입력 >>> "));
                    list.remove(searchMember(list, id));
                    break;

                case "U":
                    id = Integer.parseInt(System.console().readLine("수정할 ID 입력 >>> "));
                    double point = Double.parseDouble(System.console().readLine("수정할 포인트 입력 >>> "));
                    searchMember(list, id).setPoint(point);
                    System.out.println(searchMember(list, id));
                    break;

                case "S":
                    id = Integer.parseInt(System.console().readLine("조회할 ID 입력 >>> "));
                    System.out.println(searchMember(list, id));
                    break;

                case "E":
                    System.out.println("종료");
                    return;

                default:
                    System.out.println("잘못된 입력");
                    break;
            }
            System.out.println(list + "\n");
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

    // 기존 멤버 추가
    private static void initMemberList(List<Member> list) {
        Member m1 = new Member(1, "김땡땡", 3.4);
        Member m2 = new Member(2, "반하나", 1.9);
        Member m3 = new Member(3, "최사과", 5.4);
        Member m4 = new Member(4, "박모모", 6.3);

        // 불변 객체 리스트가 메소드의 인자로 가변 객체 list 에 모든 요소 추가
        list.addAll(List.of(m1, m2, m3, m4));
    }

}
