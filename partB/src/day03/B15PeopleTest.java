package day03;

// People 클래스 활용
public class B15PeopleTest {
    public static void main(String[] args) {
        People momo = new People();
        String name = momo.getName();
        System.out.println("회원이름 : " + name); // 객체의 기본값 null

        // momo 객체에게 name 필드를 "김모모" 하고 싶은데
        momo.setName("김모모");
        System.out.println("momo 회원이름 : " + momo.getName());
        
        People sana = new People();
        sana.setName("최사나");
        System.out.println("sana 회원이름 : " + sana.getName());
        

        momo.setAge(22);
        System.out.println(momo.getAge());
        
        momo.setAdult(true);
        System.out.println(momo.isAdult());


        // 참고
        // int age;
        // System.out.println(age); 오류 : 지역변수 기본값이 없습니다.

    }

}
