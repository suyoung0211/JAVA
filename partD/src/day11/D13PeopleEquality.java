package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D13PeopleEquality {
    public static void main(String[] args) {
        List<People> list = new ArrayList<People>();

        People p1 = new People(1111, "김모모");
        People p2 = new People(1112, "최사나");
        People p3 = new People(1113, "이하니");
        People p4 = new People(1114, "김땡땡");

        list.add(p1);
        list.add(p4);
        list.add(p3);
        list.add(p2);
        list.add(p4);

        // 동일성 검사 (참조값으로 검사)
        System.out.println("1. 동일성 검사");
        People temp = new People(1112, "최사나");
        System.out.println("p2 == temp 동일성 검사 : " + (p2 == temp)); // 동등성 상관없이 항상 false

        // @EqualsAndHashCode 구현해서 값이 해시 값을 강제로 같게 만듬
        // @EqualsAndHashCode 주석처리 후 확인하면 p2 와 temp 는 다른 값이 나옴
        System.out.println("다른 객체에 동등성 구현하면 해시코드 값이 같도록 합니다. 단, 실체(주소)는 다르다");
        System.out.println("p2.hashCode() : " + p2.hashCode());
        System.out.println("temp.hashCode() : " + temp.hashCode());

        // 동등성 검사
        System.out.println("\n2. 동등성 검사");
        boolean result = p2.equals(temp);
        System.out.println("p2.equals(temp) : " + result); // false

        // List 는 indexOf 메소드 : 값을 전달하면 리스트에 저장된 index 리턴
        // p2 객체가 몇 번째 있는지 알고 싶다면 ...
        System.out.println("\n3. p2와 동등성인 객체의 인덱스 찾기");
        int index = list.indexOf(temp);
        System.out.println("index temp : " + index); // @EqualsAndHashCode 구현 전 : -1

        System.out.println("\n4. p4와 동등성인 객체의 last 인덱스 찾기");
        temp = new People(1114, "김땡땡");
        index = list.lastIndexOf(temp);
        System.out.println("p4 index : " + index); // @EqualsAndHashCode 구현 전 : -1

        // set 의 동등성 테스트를 위해 새로운 객체 추가
        list.add(temp);
        list.add(new People(1112, "최사나"));

        Set<People> set = new HashSet<>(list);
        System.out.println("\n5. 동등성과 Set - Set 중복된 값을 저장하지 않는다.");
        System.out.println("set 크기 : " + set.size());
        System.out.println("set : " + set);

        // People 클래스에 @EqualsAndHashCode 구현이 있느냐 없느냐에 따랄 동등성 검사 여부 결정
        // 테스트 하기 : @EqualsAndHashCode 있을 때 없을 때 비교해서 정리하세요.
        // 🌟 @EqualsAndHashCode 구현이 있으면 동등성 검사를 할 수 있다.
        // 🌟 결론 : @EqualsAndHashCode 구현하여 내용이 같으면 "동등하다(equality)" 고 판단합니다.
        //     => 내용이 같으면 equals() 결과 true, indexOf() 찾기 가능 , Set 자료구조 중복되지 않고 저장.
    }
}
