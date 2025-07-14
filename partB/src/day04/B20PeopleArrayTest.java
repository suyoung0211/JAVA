package day04;

public class B20PeopleArrayTest {
    public static void main(String[] args) {
        People[] members = new People[4];

        members[0] = new People("모모", 18, false);
        members[1] = new People("나연", 27, true);
        members[2] = new People("다현", 28, true);
        members[3] = new People("지효", 24, true);

        // 1. members 배열이 참조하는 People 객체 중 이름을 모두 출력하기
        // 예시 : members[0].getName()

        System.out.println("~~~~~ 멤버 이름 출력하기 1 ~~~~~");
        for (int i = 0; i < members.length; i++) {
            System.out.println("\t" + members[i].getName());
        }

        System.out.println("~~~~~ 멤버 이름 출력하기 2 ~~~~~");
        for (People p : members) { // p = members[i] 와 동일함. i는 순서대로 자동 증ㅇ가
            System.out.println("\t" + "\t" + p.getName());
        }

        // 멤버들 평균나이를 구하기 위해 합계 연산하기
        int total1 = 0;
        for (int i = 0; i < members.length; i++) {
            total1 += members[i].getAge();
        }
        System.out.println("total1 평균 나이 : " + (double) total1 / members.length);
        
        int total2 =0;
        for (People p : members) {
            total2 += p.getAge();
        }
        System.out.println("total2 평균 나이 : " + (double) total2 / members.length);


        // 2번 인덱스 객체를 변경하기 : "사나", 19, false
        members[2] = new People("사나", 19, false);

        // 성인이 아닌 멤버 출력(toString"() 리턴값)하기
        for (int i = 0; i < members.length; i++) {
            if (!members[i].isAdult()) {
                System.out.println(members[i]);
            }
        }

    }
}
